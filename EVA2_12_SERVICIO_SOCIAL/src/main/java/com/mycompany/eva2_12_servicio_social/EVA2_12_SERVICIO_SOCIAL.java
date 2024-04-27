/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_12_servicio_social;

import java.util.Scanner;

/**
 *
 * @author juani
 */
public class EVA2_12_SERVICIO_SOCIAL {

    public static void main(String[] args) {
        int creditos, semestre;
        Scanner captu = new Scanner(System.in);
        System.out.println("¿que semestre curas");
        semestre = captu.nextlnt();
        System.out.println("¿cuantos creditos llevas");
        creditos = captu.nextlnt();
        if ((semestre >= 6) && (creditos >= 150))
            System.out.println("puedes realizar el servicio social");
        else
            System.out.println("no puedes realizar el servicio social");
     
        
    }
}
