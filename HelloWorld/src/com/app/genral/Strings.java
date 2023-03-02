package com.app.genral;
import java.lang.String;

public class Strings {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String palabra = "hola";
        int longitud = palabra.length();

        for(int i = 0; i < longitud; i++) {
            System.out.println(palabra.charAt(i));
        }
    }
}