/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_4_ventas;

/**
 *
 * @author juani
 */
public class EVA2_4_VENTAS {

    public static void main(String[] args) {
        int canti, calSaldo;
        Scanner captu = new Scanner(System.in);
        System.out.println("¿Cuantas piezas quieres comprar?");
        canti = captu.nextint();
        
        if(canti >= 1000)//verdadeero
            calSaldo = canti * 500;
        else        
            calSaldo = canti * 800;
        
        System.out.println("Saldo es;" + calSaldo);
        
        
    
    }
}
