/*
 * Descripción: Contexto del problema, clase que recibe la entrada
 * Fecha: 6/03/2020
 * Versión: 1.0
 */
package interpreter;

import java.util.Stack;

/**
 *
 * @author David Armando Rodríguez Varón, Juan Sebastián Sánchez Tabares
 */
public class Context {

    private String input;
    private float output;
    Stack stackOp = new Stack<>();

    public Context(String input) {
        this.input = input;
        getResult();
    }

    public void getResult() { //Calcula el resultado usando una pila de nodos
        String inputs[] = input.split(" ");
        for (String in : inputs) {
            if (!Classifier.operator(in)) { //No operador entonces apila número
                Expression num = new Number(Float.parseFloat(in));
                stackOp.push(num);
            } else { //Realiza operación quitando los números 
                Expression num1 = (Expression) stackOp.pop();
                Expression num2 = (Expression) stackOp.pop();
                Expression op = Classifier.getOperation(num1, num2, in);
                float numFloat = op.interpreter();
                Expression numf = new Number(numFloat);
                stackOp.push(numf);
            }
        }
    }

    public float getOutput() {
        Expression out = (Expression) stackOp.pop();
        output = out.interpreter();
        return output;
    }
}
