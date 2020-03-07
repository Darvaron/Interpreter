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
        BufferedReader in =  new BufferedReader(new InputStreamReader(System.in));
        
        /*
          Ingrese cada operador y operando separado por un espacio 
        */
        String input = in.readLine();
             
        //Creamos un contexto
        Context newContext = new Context(input);
        System.out.println(newContext.getOutput());
    }
}
