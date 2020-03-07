/*
 * Descripción: Determina el tipo de operación o si es un número
 * Fecha: 6/03/2020
 * Versión: 1.0
 */

package interpreter;

/**
 *
 * @author David Armando Rodríguez Varón,  Juan Sebastián Sánchez Tabares
 */
public class Classifier {

    //Verifica si es un nodo no terminal
    public static boolean operator(String in){
        boolean isop = false;
        if (in.equals("+") || in.equals("-") || in.equals("*") || in.equals("/")){
            isop = true;
        }
        return isop;
    }
    
    // Retorna la operación adecuada
    public static Expression getOperation(Expression num1, Expression num2,String in){ 
        if(in.equals("+")){
            return new Addition(num1, num2);
        }else if(in.equals("-")){
            return new Substraction(num1, num2);
        }else if(in.equals("*")){
            return new Multiplication(num1, num2);
        }else{
            return new Division(num1, num2);
        }
    }
}
