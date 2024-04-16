/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usear;

import java.io.FileWriter;
import javax.swing.JOptionPane;


 public class saveCahierDetalis extends CreateNewCahiierAccount{
    
    @Override
    public void createAccount() {
        String cashierName = getUsername();
        String cashierPass = getPassword();

        try {
            FileWriter writer = new FileWriter("cashier.txt", true);
            writer.write("\n" + cashierName + ":" + cashierPass);
            writer.close();
            JOptionPane.showMessageDialog(null, "New Account Created");

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error creating account: " + e);
        }
    }
}
    

