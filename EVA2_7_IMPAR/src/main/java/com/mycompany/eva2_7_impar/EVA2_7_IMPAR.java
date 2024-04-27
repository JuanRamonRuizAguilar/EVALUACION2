/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_7_impar;

/**
 *
 * @author juani
 */
public class EVA2_7_IMPAR {

    public static void main(String[] args) {
       //TODO code aplicacation logic here
       int num,divi,resi;
       Scanner captu = new Scanner(System.in);
       System.out.println("introduce un numero entero;");
       num = captu.nextlnt();
       System.out.println("division entera de "+ num + " / 2 = + divi");
       resi = num % 2;
       System.out.println("division entera de "+ num + " % 2 = + resi");
       // NUMERO PAR O IMPAR
       if(resi == 1)
          System.out.println(num + "es par");
        else
          System.out.println(num + "es impar");
          
       
       
       
       
       
               
       
    }
}
