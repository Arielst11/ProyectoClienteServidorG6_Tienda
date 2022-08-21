
package proyecto.g6_clienteservidorproyecto;

import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author brett
 */

//SERVIDOR
public class frm_pantalla1 extends javax.swing.JFrame {
    private Servidor s;

    
    public frm_pantalla1() {
        initComponents();
        this.setLocationRelativeTo(null);
        s = new Servidor (5000);
        Thread t = new Thread(s);
        t.start();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_actualizar = new javax.swing.JButton();
        label_aros = new javax.swing.JLabel();
        txt_alternadores = new javax.swing.JTextField();
        label_baterias = new javax.swing.JLabel();
        txt_aros = new javax.swing.JTextField();
        jLabel_alternadores = new javax.swing.JLabel();
        txt_baterias1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_actualizar.setText("Actualizar promoción");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        label_aros.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_aros.setText("Aros");

        txt_alternadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_alternadoresActionPerformed(evt);
            }
        });

        label_baterias.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_baterias.setText("Baterias");

        txt_aros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_arosActionPerformed(evt);
            }
        });

        jLabel_alternadores.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_alternadores.setText("Alternadores");

        txt_baterias1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_baterias1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_baterias1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_aros, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_baterias)
                            .addComponent(jLabel_alternadores))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(txt_aros, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_alternadores, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(label_aros)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_aros, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_baterias)
                    .addComponent(txt_baterias1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_alternadores)
                    .addComponent(txt_alternadores, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(btn_actualizar)
                .addGap(77, 77, 77))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_alternadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_alternadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_alternadoresActionPerformed

    private void txt_arosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_arosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_arosActionPerformed

    private void txt_baterias1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_baterias1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_baterias1ActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        
        double aros = Double.parseDouble(this.txt_aros.getText());
        double baterias =Double.parseDouble(this.txt_baterias1.getText());
        double alternadores = Double.parseDouble(this.txt_alternadores.getText());
      
        
        String[] nombres= {"aros","baterias","alternadores"};
        double[] valores = {aros,baterias,alternadores};
        
        s.enviarInfo(nombres, valores);
        this.setVisible(false);
     
        
        
    }//GEN-LAST:event_btn_actualizarActionPerformed

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
            java.util.logging.Logger.getLogger(frm_pantalla1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_pantalla1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_pantalla1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_pantalla1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_pantalla1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JLabel jLabel_alternadores;
    private javax.swing.JLabel label_aros;
    private javax.swing.JLabel label_baterias;
    private javax.swing.JTextField txt_alternadores;
    private javax.swing.JTextField txt_aros;
    private javax.swing.JTextField txt_baterias1;
    // End of variables declaration//GEN-END:variables
}
