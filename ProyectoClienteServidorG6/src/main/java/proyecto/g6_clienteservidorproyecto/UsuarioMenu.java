/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.g6_clienteservidorproyecto;

/**
 *
 * @author asanc
 */
public class UsuarioMenu extends javax.swing.JFrame {

    /**
     * Creates new form UsuarioMenu
     */
    public UsuarioMenu() {
        initComponents();
    this.setLocationRelativeTo(null);
    lbl_bienvenido.setText("Bienvenido "+ UsuarioActualStatic.usuarioActual.getNombre());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_bienvenido = new javax.swing.JLabel();
        jBcerrarSesion = new javax.swing.JButton();
        jBcarrito = new javax.swing.JButton();
        jBAgregarAlCarrito = new javax.swing.JButton();
        jBminijuego = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lbl_bienvenido.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_bienvenido.setForeground(new java.awt.Color(0, 0, 0));

        jBcerrarSesion.setText("Cerrar sesión");
        jBcerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcerrarSesionActionPerformed(evt);
            }
        });

        jBcarrito.setText("Carrito de compras");
        jBcarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcarritoActionPerformed(evt);
            }
        });

        jBAgregarAlCarrito.setText("Agregar al carrito");
        jBAgregarAlCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarAlCarritoActionPerformed(evt);
            }
        });

        jBminijuego.setText("Minijuego");
        jBminijuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBminijuegoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBcerrarSesion)
                .addGap(42, 42, 42))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jBcarrito)
                        .addGap(26, 26, 26)
                        .addComponent(jBAgregarAlCarrito)
                        .addGap(37, 37, 37)
                        .addComponent(jBminijuego))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(lbl_bienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lbl_bienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBcarrito)
                    .addComponent(jBAgregarAlCarrito)
                    .addComponent(jBminijuego))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                .addComponent(jBcerrarSesion)
                .addGap(77, 77, 77))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBcerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcerrarSesionActionPerformed
        UsuarioActualStatic.usuarioActual = null;
        Objeto.arrayListCarritoDeCompras = null;
        frm_sesion inicio = new frm_sesion();
        inicio.setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jBcerrarSesionActionPerformed

    private void jBminijuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBminijuegoActionPerformed
frm_hilos juego = new frm_hilos();
juego.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jBminijuegoActionPerformed

    private void jBAgregarAlCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarAlCarritoActionPerformed
AgregarArticulos agregarArticulos = new AgregarArticulos();
agregarArticulos.setVisible(true);


        // TODO add your handling code here:
    }//GEN-LAST:event_jBAgregarAlCarritoActionPerformed

    private void jBcarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcarritoActionPerformed
CarritoDeCompras carrito = new CarritoDeCompras();
carrito.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jBcarritoActionPerformed

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
            java.util.logging.Logger.getLogger(UsuarioMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuarioMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuarioMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuarioMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregarAlCarrito;
    private javax.swing.JButton jBcarrito;
    private javax.swing.JButton jBcerrarSesion;
    private javax.swing.JButton jBminijuego;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_bienvenido;
    // End of variables declaration//GEN-END:variables
}
