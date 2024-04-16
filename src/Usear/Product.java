/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usear;


public class Product {
    
     
    private String ProductName,ProductId,ProductAvalability,ProductCategory;
    private double ProductPrice;
    
    public Product(String ProductName, String ProductId, double ProductPrice, String ProductAvalability, String ProductCategory){
        this.ProductName = ProductName;
        this.ProductId = ProductId;
        this.ProductAvalability = ProductAvalability;
        this.ProductCategory = ProductCategory;
        this.ProductPrice = ProductPrice;
    }
    
    public String getProductName(){
        return ProductName;
    }
    
    public String getProductId(){
        return ProductId;
    }
    
    public String getProductAvalability(){
        return ProductAvalability;
    }
    
    public String getProductCategory(){
        return ProductCategory;
    }
    
    public double getProductPrice(){
        return ProductPrice;
    }
    
    
    public void setProductName(String ProductName){
        this.ProductName = ProductName;
    }
    
    public void setProductId(String ProductId){
        this.ProductId = ProductId;
    }
     
    public void setProductAvailability(String ProductAvalability){
        this.ProductAvalability = ProductAvalability;
    }
      
    public void setProductCategory(String ProductCategory){
        this.ProductCategory = ProductCategory;
    }
       
    public void setProductPrice(double ProductPrice){
        this.ProductPrice = ProductPrice;
    }
    
}
