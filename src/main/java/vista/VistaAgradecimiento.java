/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author Usuario
 */
public class VistaAgradecimiento extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VistaAgradecimiento.class.getName());

    public VistaAgradecimiento() {
        initComponents();
        configurarAgradecimiento("Mimi");
    }

    // Constructor donde recibo el nombre del animal
    public VistaAgradecimiento(String nombreAnimal) {
        initComponents();
        configurarAgradecimiento(nombreAnimal);
    }

    private void configurarAgradecimiento(String nombreAnimal) {
        setTitle("¡Solicitud Enviada!");
        setSize(720, 850);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        if (jPanel1 != null) {
            jPanel1.setBackground(new java.awt.Color(204,204,255));
            jPanel1.setLayout(new java.awt.GridBagLayout());
        }

        if (jPanel2 != null) {
            jPanel2.removeAll();
            jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.Y_AXIS));
            jPanel2.setBackground(java.awt.Color.WHITE);
            // Márgenes más compactos para aprovechar espacio
            jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(30, 40, 30, 40));

            // Título principal 
            javax.swing.JLabel lblTitulo = new javax.swing.JLabel("Gracias por querer adoptar a " + nombreAnimal);
            lblTitulo.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 22));
            lblTitulo.setForeground(new java.awt.Color(40, 50, 60));
            lblTitulo.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
            jPanel2.add(lblTitulo);
            jPanel2.add(javax.swing.Box.createRigidArea(new java.awt.Dimension(0, 15)));

            int anchoImg = 540;
            int altoImg = 360;

            javax.swing.JLabel lblImagen = new javax.swing.JLabel();
            lblImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            lblImagen.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
            lblImagen.setPreferredSize(new java.awt.Dimension(anchoImg, altoImg));
            lblImagen.setMaximumSize(new java.awt.Dimension(anchoImg, altoImg));
            lblImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(220, 225, 230), 1));

            try {
                java.net.URL imgUrl = getClass().getResource("/recursos/gato2.2.jpg");
                if (imgUrl != null) {
                    javax.swing.ImageIcon iconoOriginal = new javax.swing.ImageIcon(imgUrl);
                    java.awt.Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(anchoImg, altoImg, java.awt.Image.SCALE_SMOOTH);
                    lblImagen.setIcon(new javax.swing.ImageIcon(imagenEscalada));
                } else {
                    lblImagen.setText("[No se encontró gato2.2.jpg en recursos]");
                    lblImagen.setFont(new java.awt.Font("Segoe UI", java.awt.Font.ITALIC, 13));
                    lblImagen.setForeground(new java.awt.Color(120, 130, 140));
                }
            } catch (Exception e) {
                lblImagen.setText("[Error al cargar imagen]");
            }
            
            jPanel2.add(lblImagen);
            jPanel2.add(javax.swing.Box.createRigidArea(new java.awt.Dimension(0, 20)));

            // Mensaje 
            javax.swing.JLabel lblSub = new javax.swing.JLabel("Pronto nos pondremos en contacto para coordinar el proceso de adopción.");
            lblSub.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13));
            lblSub.setForeground(new java.awt.Color(100, 110, 120));
            lblSub.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
            jPanel2.add(lblSub);
            jPanel2.add(javax.swing.Box.createRigidArea(new java.awt.Dimension(0, 20)));

            // Botón para volver
            javax.swing.JButton btnInicio = new javax.swing.JButton("Volver a la página de inicio");
            btnInicio.setBackground(new java.awt.Color(53, 162, 159)); // Turquesa unificado
            btnInicio.setForeground(java.awt.Color.WHITE);
            btnInicio.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13));
            btnInicio.setFocusPainted(false);
            btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnInicio.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
            btnInicio.setPreferredSize(new java.awt.Dimension(260, 40));
            btnInicio.setMaximumSize(new java.awt.Dimension(260, 40));

            btnInicio.addActionListener(e -> {
                new VistaPrincipal().setVisible(true);
                this.dispose();
            });

            jPanel2.add(btnInicio);
        }
        revalidate();
        repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));
        jPanel1.add(jPanel2, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        java.awt.EventQueue.invokeLater(() -> new VistaAgradecimiento().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
