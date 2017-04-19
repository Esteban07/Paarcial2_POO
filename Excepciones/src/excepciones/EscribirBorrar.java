/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.io.*;

/**
 *
 * @author Estudiante
 */
public class EscribirBorrar {
    public static void main(String[] args) throws FileNotFoundException {
     PrintStream output = new PrintStream(new File("hello.txt"));
    
    output.println("Hello world.");
    output.println();
    output.println("This program produces four");
    output.println("lines of output.");
    }
    }

