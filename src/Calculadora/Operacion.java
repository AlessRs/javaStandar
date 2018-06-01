/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import java.util.Scanner;

public class Operacion {
    
    static public Operacion elegirOperador() {
        Scanner scn = new Scanner(System.in);
        Operacion operacion;
        switch (scn.nextLine()) {
            case "+":
                operacion = new Suma();
                break;
            case "-":
                operacion = new Resta();
                break;
            case "*":
                operacion = new Multiplicacion();
                break;
            case "/":
                operacion = new Division();
                break;
            case "=":
                operacion = new Igual();
                break;
            default: {
                operacion = null;
                System.out.println("operacion incorrecta");
            }
        }
        return operacion;
    }

    static float ingresaDatos() {
        try {
            Scanner scn = new Scanner(System.in);
            return Float.parseFloat(scn.nextLine());
        } catch (RuntimeException e) {
            System.out.println("Ingrese un numero valido");
            return ingresaDatos();
        }
    }

    public float operar(float a) {
        return elegirOperador().operar(a);
    }
}
