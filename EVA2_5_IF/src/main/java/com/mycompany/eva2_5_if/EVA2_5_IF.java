/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_5_if;

import java.util.Scanner;

/**
 *
 * @author juan Ruiz
 * 
 */
public class EVA2_5_IF {

    public static void main(String[] args) {
        //CAPTURAR TEMPERATURA
        int temp;
        Scanner captu = new Scanner(System.in);
        //CAPTURAR TEMPERATURA
        System.out.println("Temperatura (°C):");
        temp = captu.nextInt();
        //Vamos a evaluar
        //Si la temperatura se mayor a 22°, se enciende
        //clima
        if(temp > 22)
            System.out.println("ENCIENDE EL AIRE");
        
        
    }
}
