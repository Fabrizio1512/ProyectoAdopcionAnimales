/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author Usuario
 */
public class VistaLogin extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VistaLogin.class.getName());

    public VistaLogin() {
        initComponents();
        estilizarBotonesLogin(); // Método
        
        java.awt.Image imgOriginal = new javax.swing.ImageIcon(getClass().getResource("/recursos/animal shelter.jpg")).getImage();
        jLabel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent e) {
                java.awt.Image imgEscalada = imgOriginal.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), java.awt.Image.SCALE_SMOOTH);
                jLabel1.setIcon(new javax.swing.ImageIcon(imgEscalada));
            }
        });
    }

    private void estilizarBotonesLogin() {
        java.awt.Color colorTurquesa = new java.awt.Color(53, 162, 159);
        java.awt.Font fuenteBoton = new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14);

        // Iniciar sesión
        if (jButton1 != null) {
            jButton1.setBackground(colorTurquesa);
            jButton1.setForeground(java.awt.Color.WHITE);
            jButton1.setFont(fuenteBoton);
            jButton1.setFocusPainted(false);
            jButton1.setBorderPainted(false);
            jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        }

        // Registrarse
        if (jButton2 != null) {
            jButton2.setBackground(colorTurquesa);
            jButton2.setForeground(java.awt.Color.WHITE);
            jButton2.setFont(fuenteBoton);
            jButton2.setFocusPainted(false);
            jButton2.setBorderPainted(false);
            jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 2));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Desktop\\animal shelter.jpg")); // NOI18N
        getContentPane().add(jLabel1);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Bienvenido al Refugio Salvando Vidas!");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.addActionListener(this::jTextField1ActionPerformed);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 490, 30));

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Iniciar sesión");
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(this::jButton1ActionPerformed);
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 590, 490, -1));

        jButton2.setBackground(new java.awt.Color(153, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("Registrarse");
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(this::jButton2ActionPerformed);
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 680, 490, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Correo electrónico");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Inicia sesión para poder continuar con tu adopción!");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Contraseña");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, -1, -1));

        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 490, 30));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
modelo.Conexion cc = new modelo.Conexion();
java.sql.Connection cn = cc.conectar();


String correo = jTextField1.getText();
String contra = jTextField2.getText();


String sql = "SELECT * FROM Adoptantes WHERE correo = ? AND contraseña = ?";

try {
    java.sql.PreparedStatement pst = cn.prepareStatement(sql);
    pst.setString(1, correo);
    pst.setString(2, contra);
    
    java.sql.ResultSet rs = pst.executeQuery();
    
    if (rs.next()) {
        javax.swing.JOptionPane.showMessageDialog(this, "¡Inicio de sesión exitoso!");
                new VistaPrincipal().setVisible(true);
                this.dispose();
    } else {
        javax.swing.JOptionPane.showMessageDialog(this, "Correo o contraseña incorrectos.", "Acceso denegado", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    
    cc.desconectar();
} catch (java.sql.SQLException e) {
    javax.swing.JOptionPane.showMessageDialog(this, "Error al consultar la base de datos: " + e.getMessage());
}        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
VistaRegistro registro = new VistaRegistro();
registro.setVisible(true);
this.dispose(); 
    }//GEN-LAST:event_jButton2ActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new VistaLogin().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
