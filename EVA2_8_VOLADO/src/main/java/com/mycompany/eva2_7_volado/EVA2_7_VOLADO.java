/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_7_volado;

/**
 *
 * @author juani
 */
public class EVA2_7_VOLADO {

    public static void main(String[] args) {
        double moneda;
        moneda = Math.random();
        System.out.println("El valor de moneda = "+ moneda);
        
        //o.5 es el mitad de rango
        if(moneda > 0.5)
            System.out.println("CARA");
        else
            System.out.println("AGUILA");
    }
}
