/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.Font;

/**
 *
 * @author robso
 */
public class telaGenio extends javax.swing.JFrame {

    /**
     * Creates new form telaGenio
     */
    public telaGenio() {
        initComponents();
        lblfrase.setText("<html>Vou pensar um valor entre 1 e 5 tente advinhar</html>");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblfrase = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtval = new javax.swing.JSpinner();
        btnpalpite = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblfrase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblfrase.setText("frase");
        getContentPane().add(lblfrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 110, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/balao.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, -20, 300, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/genio100.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Valor");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        txtval.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        getContentPane().add(txtval, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 50, -1));

        btnpalpite.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnpalpite.setText("Palpite");
        btnpalpite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpalpiteActionPerformed(evt);
            }
        });
        getContentPane().add(btnpalpite, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnpalpiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpalpiteActionPerformed
        // TODO add your handling code here:
        double n = 1 + Math.random() * (6 - 1);
        int valor = (int) n ;
        
        int num = Integer.parseInt(txtval.getValue().toString());
        
        String  f1 = "<html>ACERTOU </html>";
        String f2 = "<html>ERROU ! eu pensei no valor " + valor + "</html>";
        
        String res = (valor == num)?f1:f2;
        
        lblfrase.setFont(new Font("Arial Black",Font.PLAIN, 18));
                
        lblfrase.setText(res);
        
        
    }//GEN-LAST:event_btnpalpiteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaGenio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnpalpite;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblfrase;
    private javax.swing.JSpinner txtval;
    // End of variables declaration//GEN-END:variables
}
