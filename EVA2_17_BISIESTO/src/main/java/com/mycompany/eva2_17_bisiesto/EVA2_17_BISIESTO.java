/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_17_bisiesto;

import java.util.Scanner;

/**
 *
 * @author juani
 */
public class EVA2_17_BISIESTO {

    public static void main(String[] args) {
        int anio;
        Scanner captu = new Scanner(System.in);
        System.out.println("introduce de año a evaluar");
        anio = captu.nextInt();
        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
            System.out.println("El año no es bisiseto");
        else
            System.out.println("El año no es bisiesto");
        
        
        
    }
}
