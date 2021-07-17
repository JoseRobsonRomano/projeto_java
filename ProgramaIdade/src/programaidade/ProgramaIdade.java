/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author robso
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        System.out.println("Em que ano você nasceu ");
       int nasc = teclado.nextInt();
       int idade = 2021 - nasc;
        System.out.println("Sua idade é " + idade);
       if(idade>18) {
           System.out.println("Maior de idade");
       } else {
           System.out.println("Menor de idade");
       }
    }
    
}
