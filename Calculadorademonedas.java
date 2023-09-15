/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadorademonedas;
import java.util.Scanner;


/**
 *
 * @author Usuario
 */
public class Calculadorademonedas {

    public static void main(String[] args) {
        Scanner lectura = new Scanner( System.in);
        
        final double euro = 18.21;
        final double dolar = 17.09;
        final double yen = 0.12;
        final double libra = 21.20;
        System.out.println("Ingrese una cantidad en pesos");
        double pesos = lectura.nextInt();
        System.out.println(" euro " + pesos/18.21);
        System.out.println(" dolar " + pesos/17.09);
        System.out.println(" yen " + pesos/0.12);
        System.out.println(" Libra " + pesos/21.20);
        
    }
}
