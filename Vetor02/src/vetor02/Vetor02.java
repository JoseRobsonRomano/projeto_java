/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor02;

/**
 *
 * @author robso
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String mes[] = {"jan", "fev", "mar", "abril", "maio", "junho", 
           "julho", "agosto", "set", "out", "nov", "dez"};
       int dias[] = {31, 28, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31};
       for(int c=0; c<mes.length; c++) {
           System.out.println("O mes de " + mes[c] + " tem " + dias[c] + " Dias ao todo");
       }
    }
    
}
