/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usear;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Chamod Mullegama
 */
public class user {
   
    
     public boolean LOGIN(String username, String password, String userType) {
        String filePath = "";

        if (userType.equals("Manager")) {
            filePath = "C:\\Users\\Chamod Mullegama\\Documents\\NetBeansProjects\\Apple_I_Store_\\Manager.txt";
        } else if (userType.equals("Cashier")) {
            filePath = "C:\\Users\\Chamod Mullegama\\Documents\\NetBeansProjects\\Apple_I_Store_\\cashier.txt";
        }

        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] credentials = line.split(":");
                if (credentials.length == 2 && username.equals(credentials[0]) && password.equals(credentials[1])) {
                    scanner.close();
                    return true;
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred during login.");
        }

        return false;
    }
    
    public void Exit(){
         System.exit(0);
    }
}
