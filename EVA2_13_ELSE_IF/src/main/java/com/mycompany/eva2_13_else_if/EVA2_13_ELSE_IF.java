/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_13_else_if;

import java.util.Scanner;

/**
 *
 * @author juani
 */
public class EVA2_13_ELSE_IF {

    public static void main(String[] args) {
        int dia;
        Scanner captu = new Scanner(System.in);
        System.out.println("introduce el dia de la semana en numero (1 al 7;");
        dia = captu.nextInt();
        
        if (dia == 1)
            if(dia == 2)
                System.out.println("lunes");
            else if(dia == 3)
                System.out.println("martes");
            else if(dia == 4)
                System.out.println("miercoles");
            else if(dia == 5)
                System.out.println("jueves");
            else if(dia == 6)
                System.out.println("viernes");
            else if(dia == 7)
                System.out.println("sabado");
            else
                System.out.println("el numero no es un dia valido");
        else System.out.println("Domingo");
            

                    
                
    }
}
