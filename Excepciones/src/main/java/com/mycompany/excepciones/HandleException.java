package com.mycompany.excepciones;

import com.mycompany.excepciones.customExceptions.InvalidAgeException;
import java.util.Scanner;


public class HandleException {
    public static void main (String[] args){               
        try{
                   
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese una edad aleatoria edad: ");
        
        int age = teclado.nextInt();
        checkAge(age);
        
        }catch(InvalidAgeException x){
            System.err.println("Error: "+x.getMessage());
        }catch(Exception e){
            System.err.println("Error inesperado: " + e.getMessage());
        }finally{
            System.err.println("Bloque de codigo comprobado");
        }
    }
    public static void checkAge(int age)throws InvalidAgeException{
        if (age <18){
            throw new InvalidAgeException("Edad Invalida");
        //JOptionPane.showMessageDialog(null, number);
        }
    }
}

