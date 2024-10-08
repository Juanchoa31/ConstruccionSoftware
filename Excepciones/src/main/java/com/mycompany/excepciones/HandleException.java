package com.mycompany.excepciones;

import com.mycompany.excepciones.customExceptions.InvalidAgeException;
import java.util.Scanner;


public class HandleException {
    public static void main (String[] args){               
        try{
                   
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un edad: ");
        
        int age = teclado.nextInt();
        checkAge(age);
        
        }catch(InvalidAgeException x){
            System.out.println("Error: "+x.getMessage());
        }finally{
            System.out.println("Bloque de codigo comprobado");
        }
    }
    public static void checkAge(int age)throws InvalidAgeException{
        if (age <18){
            throw new InvalidAgeException("Edad Invalida");
        //JOptionPane.showMessageDialog(null, number);
        }
    }
}

