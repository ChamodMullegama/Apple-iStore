/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usear;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Manager {
    

    private ArrayList<Product> Productlist;
    private DefaultTableModel dtm;

    public Manager(DefaultTableModel dtm) {
        this.Productlist = new ArrayList<>();
        
        this.dtm = dtm;
    }

    public void add(String ProductId, String ProductName, double ProductPrice,
                    String ProductAvailability, String ProductCategory) {
        try {
            boolean productExists = false;
            for (Product existingProduct : Productlist) {
                if (existingProduct.getProductId().equals(ProductId)) {
                    existingProduct.setProductName(ProductName);
                    existingProduct.setProductPrice(ProductPrice);
                    existingProduct.setProductAvailability(ProductAvailability);
                    existingProduct.setProductCategory(ProductCategory);
                    productExists = true;
                    break;
                }
            }
            if (!productExists) {
                Product newProduct = new Product(ProductId, ProductName, ProductPrice, ProductAvailability, ProductCategory);
                Productlist.add(newProduct);
                dtm.setRowCount(0);
                for (Product product : Productlist) {
                    Object[] objs = { product.getProductId(), product.getProductName(), product.getProductPrice(),
                                      product.getProductAvalability(), product.getProductCategory() };
                    dtm.addRow(objs);
                    saveToFile();
                }
                JOptionPane.showMessageDialog(null, "Product added successfully");
            }
         
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
        }
    }

    public void delete(int row) {
        int dialoButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to delete data");
        
        try {
             if (dialogResult == 0) {
            dtm.removeRow(row);
            Productlist.remove(row);
            dtm.setRowCount(0);
            for (Product product : Productlist) {
                Object[] objs = { product.getProductId(), product.getProductName(), product.getProductPrice(),
                                  product.getProductAvalability(), product.getProductCategory() };
                dtm.addRow(objs);
            }
          
        }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error" + e);
        }
        
       
    }

    public void update(int row, String updateProductId, String updateProductName, double updateProductPrice,
        String updateProductAvailability, String updateProductCategory) {
        Product selectedProduct = Productlist.get(row);
        selectedProduct.setProductId(updateProductId);
        selectedProduct.setProductName(updateProductName);
        selectedProduct.setProductPrice(updateProductPrice);
        selectedProduct.setProductAvailability(updateProductAvailability);
        selectedProduct.setProductCategory(updateProductCategory);

        dtm.setRowCount(0);
        for (Product product : Productlist) {
            Object[] objs = { product.getProductId(), product.getProductName(), product.getProductPrice(),
                              product.getProductAvalability(), product.getProductCategory() };
            dtm.addRow(objs);
        }
        JOptionPane.showMessageDialog(null, "Product data updated successfully");
        
    }

    public void search(String input) {
        for (int i = 0; i < Productlist.size(); i++) {
            if (Productlist.get(i).getProductId().equalsIgnoreCase(input)) {
                JOptionPane.showMessageDialog(null, "FOUND!!!", "SEARCH PRODUCT", JOptionPane.INFORMATION_MESSAGE);
                Product product = Productlist.get(i);
                dtm.setRowCount(0);
                Object[] objs = { product.getProductId(), product.getProductName(), product.getProductPrice(),
                                  product.getProductAvalability(), product.getProductCategory() };
                dtm.addRow(objs);
              
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "NOT FOUND", "SEARCH PRODUCT", JOptionPane.WARNING_MESSAGE);
    }

    
    

    public void saveToFile() {
    String filePath = "C:\\Users\\Chamod Mullegama\\Documents\\NetBeansProjects\\Apple_I_Store_\\products.txt";
    try (PrintWriter writer = new PrintWriter(new FileWriter(filePath, true))) {
        for (Product product : Productlist) {
            String line = product.getProductId() + "," + product.getProductName() + "," +
                    product.getProductPrice() + "," + product.getProductAvalability() + "," +
                    product.getProductCategory();
            writer.println(line);
        }
        System.out.println("Data saved to the file");
    } catch (IOException e) {
        System.err.println("Error saving data to file: " + e.getMessage());
    }
}
    
}

    
    



