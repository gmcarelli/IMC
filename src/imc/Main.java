/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

import java.util.Scanner;

/**
 *
 * @author gilca
 */
public class Main {

    public static void main(String[] args) {
        String peso, altura;
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Informe o peso em quilogramas:");
        peso = scanner.next();
        System.out.println(
                "Informe a altura em metros:");
        altura = scanner.next();
        System.out.println("IMC = " + IMC.calculaIMC(peso, altura));
        
    }

}
