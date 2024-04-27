/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_6_comandos;

import java.util.Scanner;

/**
 *
 * @author juan
 *
 */
public class EVA2_6_COMANDOS {

    public static void main(String[] args) {
        //TODO code application logic 
        //CUAL ES EL MAYOR VALOR ENTRE DOS NOMEROS 
        //PIDAN AL USUARIO DOS VALORES ENTEROS
        int num1, num2;
        Scanner captu = new Scanner(System.in);
        System.out.println("VALOR 1:");
        num1 = captu.nextInt();
        System.out.println("VALOR 2:");
        num2 = captu.nextInt();
        //CUAL ES MAYOR
       if(num1 > num2)
           System.out.println(num1 + "es mayor!!");
       else
           if (num1 == num2) //num1 es igual que num2
               System.out.println("Son iguales");
               else
           System.out.println(num2 + "es mayor!!");
    }
}
