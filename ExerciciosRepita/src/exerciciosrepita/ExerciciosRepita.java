/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosrepita;


import javax.swing.JOptionPane;
/**
 *
 * @author robso
 */
public class ExerciciosRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int n, s=0 , impares=0 , pares=0 , AC=0 , ContadorValores = 0 , media;
     
        do  {
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numeto o valor 0 Interrompe ")); 
         s = s + n;   
          if (n%2 == 0) 
            pares++;         
                    
          if (n%2 == 1)
            impares++;
          
           if (n>= 100)
            AC++;
           
           if (n>= 1)
            ContadorValores++;       
            
           media = (s/ContadorValores);
        
    } while (n!= 0); {
             JOptionPane.showMessageDialog(null, "<html>Resultado Final <br> <hr>" 
                     + " Somatório Vale " + s + "<br>" 
                     + "Total e Valores: "+ ContadorValores 
                     + "<br>"  + "Total de Pares: " 
                     + pares + "<br>" + "Total de Impares:" 
                     + impares + "<br>" + "Acima de 100: "
                     + AC + "<br>" + "Media dos Valores: " 
                     + media + "<br>" + "</html>");
        }
    }
}
