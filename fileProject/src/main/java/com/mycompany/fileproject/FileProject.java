package com.mycompany.fileproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
//import java.util.Scanner;
import javax.swing.JOptionPane;
//import java.util.Arrays;

public class FileProject {
    public static ArrayList<User> users = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        //Scanner teclado = new Scanner (System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(10); // Genera un número aleatorio entre 0 y 9999
        
        String fileName = "archive" + numeroAleatorio;
        String path = "./" + fileName + ".csv";  
        
        String opcion = selectMenuOption();
        
        switch(opcion){
            case "1":
                writeTextToFile(path);
                break;
            case "2":
                readFile(path);
                break;
            default:
                throw new AssertionError();
        }
    }
    
    public static void createFile(String path) throws IOException{
        File file = new File(path);
        
        if (file.exists()){
            JOptionPane.showMessageDialog(null, "El archivo ya existe, no se va a crear");
        }else{
            System.out.println(file.getPath());
            file.createNewFile();
        }
    }
    
    public static void writeTextToFile(String path) throws IOException{
        File file = new File(path);
        FileWriter fr = new FileWriter(file, true);
        
        String texto = JOptionPane.showInputDialog("Que quieres escribir?");
        
        fr.append(texto+ "\n");
        fr.close();
    }
    
    public static void readFile(String path)throws FileNotFoundException, IOException{ 
        File file = new File(path);
        FileReader fr = new FileReader(file);
        
        BufferedReader br = new BufferedReader(fr);
        
        String line = null;
        while((line = br.readLine()) != null){
            loadUserCollection(line);
        }
        br.close();
        for(User user : users){
            System.out.println(user.getInfo());
        }
    }
    
    public static String selectMenuOption(){     
        String menuTemplate = 
                """
                1. Escribir texto en el archivo. 
                2. Leer texto del archivo""";
        
        return JOptionPane.showInputDialog(menuTemplate);    
    }
    
    public static void loadUserCollection(String recordLine){
        if (!recordLine.contains("USERNAME")){
            String[] records = recordLine.split(",");
            User user = new User(records[0], records[1],records[2]);
            users.add(user);
        }
    }
}
