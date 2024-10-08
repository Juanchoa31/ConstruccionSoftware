package com.mycompany.excepciones.customExceptions;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message){
        super(message);
    }
}
