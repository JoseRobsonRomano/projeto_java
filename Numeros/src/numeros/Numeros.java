/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author robso
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, S=0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        do {
        System.out.print("Digitel um numero: ");
        n = teclado.nextInt();
        S += n; // S = S + n
        System.out.println("Quem continuar S/N ?");
        resp = teclado.next();
    } while (resp.equals("S"));
        System.out.println("A Soma de todos os numeros é " + S);
}
}