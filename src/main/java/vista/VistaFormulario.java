/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author Usuario
 */
public class VistaFormulario extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VistaFormulario.class.getName());

   public VistaFormulario() {
        initComponents();
        reorganizarComponentesCentrados("Mimi");
    }

    public VistaFormulario(String nombreAnimal) {
        initComponents();
        reorganizarComponentesCentrados(nombreAnimal);
    }

    private void reorganizarComponentesCentrados(String nombreAnimal) {
        setTitle("Formulario de Adopción");
        setSize(680, 900); 
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.JPanel panelFondo = new javax.swing.JPanel(new java.awt.GridBagLayout());
        panelFondo.setBackground(new java.awt.Color(204,204,255));

        // Tarjeta
        javax.swing.JPanel tarjeta = new javax.swing.JPanel();
        tarjeta.setLayout(new javax.swing.BoxLayout(tarjeta, javax.swing.BoxLayout.Y_AXIS));
        tarjeta.setBackground(java.awt.Color.WHITE);
        tarjeta.setBorder(javax.swing.BorderFactory.createEmptyBorder(45, 55, 45, 55));

        java.awt.Font fuenteLabel = new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13);
        java.awt.Font fuenteInput = new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 14);
        java.awt.Color colorTexto = new java.awt.Color(70, 80, 90);

        
        if (jLabel1 != null) {
            jLabel1.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 22));
            jLabel1.setForeground(new java.awt.Color(40, 50, 60));
            jLabel1.setAlignmentX(java.awt.Component.LEFT_ALIGNMENT);
            tarjeta.add(jLabel1);
        }
        tarjeta.add(javax.swing.Box.createRigidArea(new java.awt.Dimension(0, 8)));

        
        if (lblSubtitulo != null) {
            lblSubtitulo.setText("Estás aplicando para adoptar a " + nombreAnimal);
            lblSubtitulo.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
            lblSubtitulo.setForeground(new java.awt.Color(100, 110, 120));
            lblSubtitulo.setAlignmentX(java.awt.Component.LEFT_ALIGNMENT);
            tarjeta.add(lblSubtitulo);
        }
        tarjeta.add(javax.swing.Box.createRigidArea(new java.awt.Dimension(0, 25)));

        agregarFilaOrdenada(tarjeta, jLabel3, jTextField1, fuenteLabel, fuenteInput, colorTexto);
        agregarFilaOrdenada(tarjeta, jLabel4, jTextField2, fuenteLabel, fuenteInput, colorTexto);
        agregarFilaOrdenada(tarjeta, jLabel5, jTextField3, fuenteLabel, fuenteInput, colorTexto);
        agregarFilaOrdenada(tarjeta, jLabel6, jTextField4, fuenteLabel, fuenteInput, colorTexto);

        if (jLabel7 != null) {
            jLabel7.setFont(fuenteLabel);
            jLabel7.setForeground(colorTexto);
            jLabel7.setAlignmentX(java.awt.Component.LEFT_ALIGNMENT);
            tarjeta.add(jLabel7);
            tarjeta.add(javax.swing.Box.createRigidArea(new java.awt.Dimension(0, 5)));
        }
        if (jTextArea1 != null) {
            jTextArea1.setFont(fuenteInput);
            jTextArea1.setLineWrap(true);
            jTextArea1.setWrapStyleWord(true);
        }
        if (jScrollPane1 != null) {
            jScrollPane1.setAlignmentX(java.awt.Component.LEFT_ALIGNMENT);
            jScrollPane1.setMaximumSize(new java.awt.Dimension(500, 90));
            jScrollPane1.setPreferredSize(new java.awt.Dimension(500, 90));
            tarjeta.add(jScrollPane1);
            tarjeta.add(javax.swing.Box.createRigidArea(new java.awt.Dimension(0, 25)));
        }
        
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        
        javax.swing.JPanel panelBotones = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 0));
        panelBotones.setBackground(java.awt.Color.WHITE);
        panelBotones.setAlignmentX(java.awt.Component.LEFT_ALIGNMENT);
        
        panelBotones.add(jButton1); // Enviar solicitud
        panelBotones.add(javax.swing.Box.createHorizontalStrut(50)); // separo los botones
        panelBotones.add(jButton2); // Volver a los animales
        
        
        if (jButton1 != null) {
            jButton1.setBackground(new java.awt.Color(53, 162, 159)); 
            jButton1.setForeground(java.awt.Color.WHITE);
            jButton1.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13));
            jButton1.setFocusPainted(false);
            jButton1.setPreferredSize(new java.awt.Dimension(160, 38));
            panelBotones.add(jButton1);
        }
        if (jButton2 != null) {
            jButton2.setBackground(new java.awt.Color(53, 162, 159)); 
            jButton2.setForeground(java.awt.Color.WHITE);
            jButton2.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13));
            jButton2.setFocusPainted(false);
            jButton2.setPreferredSize(new java.awt.Dimension(160, 38));
            panelBotones.add(jButton2);
        }
        tarjeta.add(panelBotones);

        panelFondo.add(tarjeta, new java.awt.GridBagConstraints());
        setContentPane(panelFondo);
        revalidate();
        repaint();
    }

    private void agregarFilaOrdenada(javax.swing.JPanel tarjeta, javax.swing.JLabel lbl, javax.swing.JTextField txt, java.awt.Font fLbl, java.awt.Font fTxt, java.awt.Color col) {
        if (lbl != null) {
            lbl.setFont(fLbl);
            lbl.setForeground(col);
            lbl.setAlignmentX(java.awt.Component.LEFT_ALIGNMENT);
            tarjeta.add(lbl);
            tarjeta.add(javax.swing.Box.createRigidArea(new java.awt.Dimension(0, 5)));
        }
        if (txt != null) {
            txt.setFont(fTxt);
            txt.setMaximumSize(new java.awt.Dimension(500, 36));
            txt.setPreferredSize(new java.awt.Dimension(500, 36));
            txt.setAlignmentX(java.awt.Component.LEFT_ALIGNMENT);
            tarjeta.add(txt);
            tarjeta.add(javax.swing.Box.createRigidArea(new java.awt.Dimension(0, 15)));
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanel1, gridBagConstraints);

        jLabel1.setText("Formulario de inscripción");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 13, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        lblSubtitulo.setText("Estás aplicando para adoptar a");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 49, 0, 0);
        getContentPane().add(lblSubtitulo, gridBagConstraints);

        jLabel3.setText("Nombre completo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 130, 0, 0);
        getContentPane().add(jLabel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 320;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 130, 0, 0);
        getContentPane().add(jTextField1, gridBagConstraints);

        jLabel4.setText("Correo electrónico");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 130, 0, 0);
        getContentPane().add(jLabel4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 320;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 130, 0, 0);
        getContentPane().add(jTextField2, gridBagConstraints);

        jLabel5.setText("Teléfono");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 130, 0, 0);
        getContentPane().add(jLabel5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 320;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 130, 0, 0);
        getContentPane().add(jTextField3, gridBagConstraints);

        jLabel6.setText("Dirección / Ciudad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 130, 0, 0);
        getContentPane().add(jLabel6, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 320;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 130, 0, 0);
        getContentPane().add(jTextField4, gridBagConstraints);

        jLabel7.setText("Motivo de adopción");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 130, 0, 0);
        getContentPane().add(jLabel7, gridBagConstraints);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 368;
        gridBagConstraints.ipady = 84;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(18, 130, 0, 0);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        jButton1.setText("Enviar solicitud");
        jButton1.addActionListener(this::jButton1ActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 26, 17, 0);
        getContentPane().add(jButton1, gridBagConstraints);

        jButton2.setText("Volver a los animales");
        jButton2.addActionListener(this::jButton2ActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 16, 17, 221);
        getContentPane().add(jButton2, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                                           
        String nombre = jTextField1.getText().trim();
        String correo = jTextField2.getText().trim();
        String telefono = jTextField3.getText().trim();
        String direccion = jTextField4.getText().trim();
        String motivo = jTextArea1.getText().trim();

        if (nombre.isEmpty() || correo.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, completa al menos tu nombre y correo electrónico.");
            return;
        }

        modelo.Conexion conexionObj = new modelo.Conexion();
        
        String sql = "UPDATE adoptantes SET telefono = ?, direccion = ?, motivo = ? WHERE correo = ?";

        try (java.sql.Connection conn = conexionObj.conectar();
             java.sql.PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, telefono);
            pstmt.setString(2, direccion);
            pstmt.setString(3, motivo);
            pstmt.setString(4, correo); // Localizo al usuario por el correo
            
            int filasAfectadas = pstmt.executeUpdate();

            if (filasAfectadas > 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "¡Solicitud enviada con éxito! Nos pondremos en contacto pronto.");
                
                VistaAgradecimiento agradecimiento = new VistaAgradecimiento();
                agradecimiento.setVisible(true);
                this.dispose();
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "No se encontró una cuenta registrada con ese correo electrónico.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }

        } catch (java.sql.SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al actualizar la solicitud en la base de datos: " + e.getMessage());
        }
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    VistaPrincipal principal = new VistaPrincipal();
    principal.setVisible(true);
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
        java.awt.EventQueue.invokeLater(() -> new VistaFormulario().setVisible(true));
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblSubtitulo;
    // End of variables declaration//GEN-END:variables
}
