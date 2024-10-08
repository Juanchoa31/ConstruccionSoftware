package com.mycompany.fileproject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class FileProject {

    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner (System.in);
        
        String fileName = JOptionPane.showInputDialog("Ingrese el nombre del archivo");
        
        JOptionPane.showMessageDialog(null, fileName);
        
        String path = "./" + fileName + ".fp";
        File file = new File(path);
        
        
        if (file.exists()){
            JOptionPane.showMessageDialog(null, "Archivo ya existente");
            System.out.println(file.getName());
            
        }else {
            System.out.println(file.getPath());
            file.createNewFile();
            
            FileWriter fr = new FileWriter(file);
            fr.write("Hola que tal" + "\n");
            fr.close();
        }
    }
}
