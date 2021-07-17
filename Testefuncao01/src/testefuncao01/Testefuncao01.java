/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao01;

/**
 *
 * @author robso
 */
public class Testefuncao01 {

    static int soma (int a, int b) {
        int s = a+ b;
        return  s;
    }
    public static void main(String[] args) {
        System.out.println("Começou o programa");
        int sm = soma (5,2);
        System.out.println("a Soma é " + sm);
    }
    
}
