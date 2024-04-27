/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_15_comparar_texto;

import java.util.Scanner;

/**
 *
 * @author juani
 */
public class EVA2_15_COMPARAR_TEXTO {

    public static void main(String[] args) {
        String dia;
        int otroDia;
        Scanner captu = new Scanner (System.in);
        System.out.println("introduce el dia (lunes, martes, etc");
        dia = captu.nextLine();
        
        if(dia.equals("Domingo"))//no podemos comprar cadenas 
            System.out.println("1");
        else if (dia.equals("lunes"))//no podemos comprar cadenas 
           System.out.println("2");
        else if (dia.equals("Martes"))//no podemos comprar cadenas 
            System.out.println("3");
        else if (dia.equals("Miercoles"))//no podemos comprar cadenas 
            System.out.println("4");
        else if (dia.equals("jueves"))//no podemos comprar cadenas 
            System.out.println("5");
        else if (dia.equals("viernes"))//no podemos comprar cadenas 
            System.out.println("6");
        else if (dia.equals("sadabo"))//no podemos comprar cadenas 
            System.out.println("7");
    }
}
