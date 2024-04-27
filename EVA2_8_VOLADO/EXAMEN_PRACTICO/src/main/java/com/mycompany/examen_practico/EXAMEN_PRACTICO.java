/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen_practico;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author juani
 */
public class EXAMEN_PRACTICO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] opciones = {"piedra", "papel", "tijera"};
        
        while (true) {
            // La computadora elige una opción aleatoria
            int indiceComputadora = random.nextInt(3);
            String opcionComputadora = opciones[indiceComputadora];

            System.out.println("Elige una opción: piedra, papel o tijera (o 'salir' para terminar el juego):");
            String opcionUsuario = scanner.nextLine().toLowerCase();

            if (opcionUsuario.equals("salir")) {
                System.out.println("¡Gracias por jugar!");
                break;
            }
            if (!opcionUsuario.equals("piedra") && !opcionUsuario.equals("papel") && !opcionUsuario.equals("tijera")) {
                System.out.println("Opción no válida. Por favor, elige piedra, papel o tijera.");
                continue;
            }
            System.out.println("La computadora elige: " + opcionComputadora);
            if (opcionUsuario.equals(opcionComputadora)) {
                System.out.println("¡Es un empate!");
            } else if ((opcionUsuario.equals("piedra") && opcionComputadora.equals("tijera")) ||
                       (opcionUsuario.equals("papel") && opcionComputadora.equals("piedra")) ||
                       (opcionUsuario.equals("tijera") && opcionComputadora.equals("papel"))) {
                System.out.println("¡Ganaste!");
            } else {
                System.out.println("¡La computadora gana!");
            }
        }
    }
}
