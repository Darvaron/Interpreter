/*
 * Descripción: Main patron interpreter
 * Fecha: 6/03/2020
 * Versión: 1.0
 */

package interpreter;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author David Armando Rodríguez Varón, Juan Sebastián Sánchez Tabares
 */
public class Main {
    public static void main(String arg[]) throws IOException{
        //Input
        BufferedReader in =  new BufferedReader(new InputStreamReader(System.in));
        // System.out.println("\n\tIngrese el problema separando por espacio cada termino y operador:");
        String input = in.readLine();
             
        //Creamos un contexto
        Context newContext = new Context(input);
    }
}
