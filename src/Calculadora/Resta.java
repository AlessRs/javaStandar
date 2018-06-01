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
public class Resta extends Operacion {

    @Override
    public float operar(float a) {
        float b = ingresaDatos();
        return a - elegirOperador().operar(b);
    }
}
