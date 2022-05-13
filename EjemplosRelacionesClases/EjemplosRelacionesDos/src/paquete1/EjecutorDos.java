/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class EjecutorDos {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("Ingrese el barrio");
        String barril = entry.nextLine();
        Barrio barrio3 = new Barrio(barril);
        
        System.out.println("Ingrese el nombre");
        String Ingreso1 = entry.nextLine();
        
        System.out.println("Ingrese la cédula");
        String ingreso2 = entry.nextLine();
        
        Persona persona1 = new Persona(Ingreso1, ingreso2, barrio3);
        
        persona1.establecerBarrio(barrio3);
        
        System.out.printf("%s", persona1);
        
    }
}
