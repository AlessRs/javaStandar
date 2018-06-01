/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import java.util.Scanner;

/**
 *
 * @author Alessandro
 */
public class Multiplicacion extends Operacion{
    @Override
    public float operar(float a){
        Scanner scn = new Scanner(System.in);
        float b=scn.nextFloat();
        return a*elegirOperador().operar(b);
    }
}
