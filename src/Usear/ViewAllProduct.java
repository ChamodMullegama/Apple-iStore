/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usear;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chamod Mullegama
 */
public class ViewAllProduct extends chashier{
    
    public void ManagerdisplayProduct() {
        DefaultTableModel model = new DefaultTableModel();
        // Call the displayProduct method from the superclass (chashier)
        displayProduct(model);
  }

}