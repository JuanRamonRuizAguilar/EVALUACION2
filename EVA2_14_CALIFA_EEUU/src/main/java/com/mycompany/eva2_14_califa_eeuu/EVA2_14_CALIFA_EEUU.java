/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_14_califa_eeuu;

import java.util.Scanner;

/**
 *
 * @author juani
 */
public class EVA2_14_CALIFA_EEUU {

    public static void main(String[] args) {
        int califa;
        Scanner captu = new Scanner(System.in);
        System.out.println("introduce el dia de la semana en numero (0 - 100);");
        califa = captu.nextInt();
        
        if (califa >= 90 && califa <=100)
                System.out.println("A");
            else if(califa >= 80 && califa <=89)
                System.out.println("B");
            else if(califa >= 70 && califa <= 79)
                System.out.println("C");
            else if(califa >= 60 && califa <= 69)
                System.out.println("D");
            else if(califa >= 0 && califa <= 59)
                System.out.println("F");
            else 
                System.out.println("el numero no es valido");
    }
}
