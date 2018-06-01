/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

/**
 *
 * @author Alessandro
 */
public class Main {
    public static void main(String[] args) {
        Operacion calculadora = new Operacion();
        float resultado = calculadora.operar(calculadora.ingresaDatos());
        System.out.println(resultado);
    }
}
