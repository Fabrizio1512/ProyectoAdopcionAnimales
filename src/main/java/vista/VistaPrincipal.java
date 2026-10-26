/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author Usuario
 */
public class VistaPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VistaPrincipal.class.getName());

    public VistaPrincipal() {
        initComponents(); 
        
        // Poner pantalla completa
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        
        jPanel1.setLayout(new java.awt.BorderLayout());
        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 30, 15, 30));
        
        try {
            jLabel1.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 22));
            jLabel1.setForeground(new java.awt.Color(40, 50, 60));
            jPanel1.add(jLabel1, java.awt.BorderLayout.WEST);
            
            jButton1.setBackground(new java.awt.Color(153, 255, 255));
            jButton1.setForeground(java.awt.Color.BLACK);
            jButton1.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13));
            jButton1.setFocusPainted(false);
            jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            jButton1.addActionListener(e -> {
                new VistaLogin().setVisible(true);
                this.dispose();
            });
            
            javax.swing.JPanel panelBotonDerecho = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));
            panelBotonDerecho.setBackground(java.awt.Color.WHITE);
            jPanel1.remove(jButton1);
            panelBotonDerecho.add(jButton1);
            jPanel1.add(panelBotonDerecho, java.awt.BorderLayout.EAST);
        } catch (Exception e) {
        }

        
        cargarTarjetasAnimales();
    }

    private void cargarTarjetasAnimales() {
        panelContenedor.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 35, 35));
        panelContenedor.removeAll();

        String urlDb = "jdbc:sqlite:adopciones.db"; 

        try (java.sql.Connection conn = java.sql.DriverManager.getConnection(urlDb);
             java.sql.Statement stmt = conn.createStatement();
             java.sql.ResultSet rs = stmt.executeQuery("SELECT nombre, especie, edad, ruta_imagen, personalidad FROM Animales")) {

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String especie = rs.getString("especie");
                String edad = rs.getString("edad");
                String personalidad = rs.getString("personalidad");
                String rutaImg = rs.getString("ruta_imagen");

                String htmlDesc = 
                    "<tr><td><b>Especie:</b></td><td>" + especie + "</td></tr>" +
                    "<tr><td><b>Edad:</b></td><td>" + edad + "</td></tr>" +
                    "<tr><td><b>Personalidad:</b></td><td>" + personalidad + "</td></tr>";

                // Tarjeta
                javax.swing.JPanel card = new javax.swing.JPanel();
                card.setPreferredSize(new java.awt.Dimension(360, 480));
                card.setLayout(new javax.swing.BoxLayout(card, javax.swing.BoxLayout.Y_AXIS));
                card.setBackground(java.awt.Color.WHITE);
                card.setBorder(javax.swing.BorderFactory.createCompoundBorder(
                    javax.swing.BorderFactory.createLineBorder(new java.awt.Color(210, 220, 230), 1, true),
                    javax.swing.BorderFactory.createEmptyBorder(22, 22, 22, 22)
                ));

                // Imagen
                javax.swing.JLabel lblImagen = new javax.swing.JLabel();
                lblImagen.setAlignmentX(javax.swing.JComponent.CENTER_ALIGNMENT);
                lblImagen.setPreferredSize(new java.awt.Dimension(320, 220));
                lblImagen.setMaximumSize(new java.awt.Dimension(320, 220));
                lblImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

                // Busco la imagen
                javax.swing.ImageIcon iconoOriginal = null;
                String nombreArchivo = new java.io.File(rutaImg).getName();

                java.net.URL urlImg = getClass().getResource("/recursos/" + nombreArchivo);
                if (urlImg == null) {
                    urlImg = getClass().getResource("/vista/recursos/" + nombreArchivo);
                }

                if (urlImg != null) {
                    iconoOriginal = new javax.swing.ImageIcon(urlImg);
                } else {
                    java.io.File archivo = new java.io.File(rutaImg);
                    if (!archivo.exists()) {
                        archivo = new java.io.File("recursos/" + nombreArchivo);
                    }
                    if (!archivo.exists()) {
                        archivo = new java.io.File("src/recursos/" + nombreArchivo);
                    }
                    if (archivo.exists()) {
                        iconoOriginal = new javax.swing.ImageIcon(archivo.getAbsolutePath());
                    }
                }

                if (iconoOriginal != null) {
                    java.awt.Image imgEscalada = iconoOriginal.getImage().getScaledInstance(320, 220, java.awt.Image.SCALE_SMOOTH);
                    lblImagen.setIcon(new javax.swing.ImageIcon(imgEscalada));
                } else {
                    lblImagen.setText("Sin imagen");
                    lblImagen.setForeground(java.awt.Color.GRAY);
                    lblImagen.setFont(new java.awt.Font("Segoe UI", java.awt.Font.ITALIC, 12));
                }

                // Nombre
                javax.swing.JLabel lblNombre = new javax.swing.JLabel(nombre);
                lblNombre.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 22));
                lblNombre.setForeground(new java.awt.Color(40, 45, 55));
                lblNombre.setAlignmentX(javax.swing.JComponent.CENTER_ALIGNMENT);

                // Descripción
                javax.swing.JLabel lblDesc = new javax.swing.JLabel(
                    "<html><div style='text-align: center;'><table style='font-family: Segoe UI; font-size: 13px; color: #607080; border-spacing: 6px 4px;'>" + 
                    htmlDesc + 
                    "</table></div></html>"
                );
                lblDesc.setAlignmentX(javax.swing.JComponent.CENTER_ALIGNMENT);

                javax.swing.JButton btnAdoptar = new javax.swing.JButton("Adoptar");
                btnAdoptar.setAlignmentX(javax.swing.JComponent.CENTER_ALIGNMENT);
                btnAdoptar.setBackground(new java.awt.Color(53, 162, 159));
                btnAdoptar.setForeground(java.awt.Color.WHITE);
                btnAdoptar.setFocusPainted(false);
                btnAdoptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                btnAdoptar.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
                btnAdoptar.setMaximumSize(new java.awt.Dimension(150, 38));

                btnAdoptar.addActionListener(e -> {
                // se abre el formulario
                VistaFormulario form = new VistaFormulario(nombre);
                form.setVisible(true);
                this.dispose(); 
                });

                card.add(lblImagen);
                card.add(javax.swing.Box.createRigidArea(new java.awt.Dimension(0, 12)));
                card.add(lblNombre);
                card.add(javax.swing.Box.createRigidArea(new java.awt.Dimension(0, 6)));
                card.add(lblDesc);
                card.add(javax.swing.Box.createRigidArea(new java.awt.Dimension(0, 15)));
                card.add(btnAdoptar);

                panelContenedor.add(card);
            }

        } catch (java.sql.SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos: " + e.getMessage());
        }

        panelContenedor.revalidate();
        panelContenedor.repaint();
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelContenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Animales disponibles para adopción");

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Cerrar sesión");
        jButton1.setBorderPainted(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 234, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton1)))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        panelContenedor.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout panelContenedorLayout = new javax.swing.GroupLayout(panelContenedor);
        panelContenedor.setLayout(panelContenedorLayout);
        panelContenedorLayout.setHorizontalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 793, Short.MAX_VALUE)
        );
        panelContenedorLayout.setVerticalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 473, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(panelContenedor);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

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
        java.awt.EventQueue.invokeLater(() -> new VistaPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelContenedor;
    // End of variables declaration//GEN-END:variables
}
