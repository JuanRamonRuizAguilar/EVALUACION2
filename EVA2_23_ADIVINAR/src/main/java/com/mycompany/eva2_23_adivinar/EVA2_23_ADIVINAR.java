/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_23_adivinar;

import java.util.Scanner;

/**
 *
 * @author juani
 */
public class EVA2_23_ADIVINAR {

    public static void main(String[] args) {
        int num = 5;
        int valor = 0;
        Scanner captu = new Scanner(System.in);
        do{
            System.out.println("cual es el numero? (entro 1 y 10);");
            valor = captu.nextInt();
        }while(num != valor);
        System.out.println("ADIVINASTE");
   
    }
}
