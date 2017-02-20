/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro.pasajeros;

import java.util.Scanner;
/**
 */
public class main {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre1");
        String nombre1 = teclado.next();
        
        System.out.println("Apellido1");
        String apellido1 = teclado.next();
        
        System.out.println("Nombre2");
        String nombre2 = teclado.next();
        
        System.out.println("\"Apellido2");
        String apellido2 = teclado.next();
        
        System.out.println("Nombre3");
        String nombre3 = teclado.next();
        
        System.out.println("\"Apellido3");
        String apellido3 = teclado.next();
        
        person.pasajero1 = new person (Nombre1, apellido1);
        person.pasajero2 = new person (Nombre2, apellido2);
        person.pasajero3 = new person (Nombre3, apellido3);
        
        Carro  car = new Carro();
        car.setConductor (pasajero3);
        car.setPersona (pasajero1);
        car.setOtra_persona (pasajero2);
    }
    
    
}
