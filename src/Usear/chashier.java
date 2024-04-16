/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usear;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chamod Mullegama
 */
public class chashier {
    

    public static void displayProduct(DefaultTableModel model) {
        String filepath = "C:\\Users\\Chamod Mullegama\\Documents\\NetBeansProjects\\Apple_I_Store_\\products.txt";
        File file = new File(filepath);

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            Object[] lines = br.lines().toArray();

            for (int i = 0; i < lines.length; i++) {
                String[] row = lines[i].toString().split(",");
                model.addRow(row);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

    

