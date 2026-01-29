package peliculas_final;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Alta_Clientes extends javax.swing.JFrame {
    public static final int n=140;
    //public static int contador=0;
    //public static Clientes std[]=new Clientes[n];
    public static int contadorClientes = 0;
    // Arreglo en clase Clientes, nombre del arreglo: "clientes"
    // new Clientes[n] reserva un espacio en la memoria para n cantidad de clientes
    public static Clientes[] clientes = new Clientes[n];

    public Alta_Clientes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BACKGROUND = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        tipoSala = new javax.swing.JComboBox<>();
        peli = new javax.swing.JComboBox<>();
        siguiente = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        Impresion = new javax.swing.JButton();
        cantidadboletos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cinepolis = new javax.swing.JLabel();
        fondo3 = new javax.swing.JLabel();
        fondo1 = new javax.swing.JLabel();
        fondo2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));
        setForeground(new java.awt.Color(0, 0, 153));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 540, 540));
        setMinimumSize(new java.awt.Dimension(540, 540));
        setResizable(false);

        BACKGROUND.setBackground(new java.awt.Color(0, 0, 74));
        BACKGROUND.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 204, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Alta Clientes");
        BACKGROUND.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 240, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");
        BACKGROUND.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, -1, -1));

        nombre.setBackground(new java.awt.Color(0, 0, 102));
        nombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setToolTipText("Ingrese su nombre....");
        nombre.setBorder(null);
        BACKGROUND.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 620, 30));

        tipoSala.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tipoSala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona tipo de sala", "SalaNormal", "SalaVIP", "Sala4DX", "" }));
        tipoSala.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tipoSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoSalaActionPerformed(evt);
            }
        });
        BACKGROUND.add(tipoSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, -1, -1));

        peli.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        peli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una película", "Spider-Man No way Home", "Shrek 2", "The Dark Knight Rises", "Megamind", "", "", "" }));
        peli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BACKGROUND.add(peli, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, 320, -1));

        siguiente.setBackground(new java.awt.Color(255, 204, 0));
        siguiente.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        siguiente.setText("Siguiente>>");
        siguiente.setToolTipText("");
        siguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });
        BACKGROUND.add(siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 600, -1, 60));

        Limpiar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Limpiar.setForeground(new java.awt.Color(102, 102, 102));
        Limpiar.setText("Limpiar");
        Limpiar.setBorder(null);
        Limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        BACKGROUND.add(Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 730, 140, 60));

        Impresion.setBackground(new java.awt.Color(255, 204, 0));
        Impresion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Impresion.setText("Impresión de boletos");
        Impresion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Impresion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImpresionActionPerformed(evt);
            }
        });
        BACKGROUND.add(Impresion, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 600, -1, 60));

        cantidadboletos.setBackground(new java.awt.Color(0, 0, 102));
        cantidadboletos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cantidadboletos.setForeground(new java.awt.Color(255, 255, 255));
        cantidadboletos.setToolTipText("Ingrese cantidad...");
        cantidadboletos.setBorder(new javax.swing.border.MatteBorder(null));
        BACKGROUND.add(cantidadboletos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 290, 120, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cantidad de boletos");
        jLabel3.setToolTipText("");
        BACKGROUND.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 280, 270, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tipo de Sala:");
        BACKGROUND.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Película");
        BACKGROUND.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, -1, -1));

        cinepolis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/CINEPOLIS LOGO.png"))); // NOI18N
        BACKGROUND.add(cinepolis, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 350, 170));

        fondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gif fondo.gif"))); // NOI18N
        BACKGROUND.add(fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 210, 870, 700));

        fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gif fondo1.gif"))); // NOI18N
        BACKGROUND.add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, -270, 1030, 840));

        fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gif fondo.gif"))); // NOI18N
        BACKGROUND.add(fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 870, 700));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gif fondo1.gif"))); // NOI18N
        BACKGROUND.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, -270, 1030, 840));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("¡BIENVENID@!");
        BACKGROUND.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 0));
        jLabel7.setText("Próximos estrenos");
        BACKGROUND.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 250, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Spiderman No Way Home");
        BACKGROUND.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 260, 60));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Shrek 2");
        BACKGROUND.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Megamente");
        BACKGROUND.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        BACKGROUND.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 360, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Batman:The Dark Knight Rises");
        BACKGROUND.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        jPanel3.setBackground(new java.awt.Color(0, 36, 72));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BACKGROUND.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 280, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BACKGROUND, javax.swing.GroupLayout.PREFERRED_SIZE, 1387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BACKGROUND, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        nombre.setText("");
        cantidadboletos.setText("");
    }//GEN-LAST:event_LimpiarActionPerformed
//BOTON SIGUIENTE
    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
         
        if(contador<n){  
            //--------VALIDACION DE ERRORES ---------
            //Trim me ayuda que eliminar los espacios en blanco al inicio y al final de la String
            //Validacion de campo de nombre vacio
            if(nombre.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(null,"Por favor ingresa tu nombre"); //Manda la alerta al user
                return; //Regresa el proceso si esta vacio
            }
            //Validación boletos en 0
            if(cantidadboletos.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(null,"Por favor, selecciona tus boletos"); //Manda la alerta al user
                return;
            }
        }
        else { 
            // Este else es el que le da la cara al usuario cuando ya no hay espacio
            JOptionPane.showMessageDialog(null, "¡Error! El cine está lleno (Límite de 140 alcanzado)");
        }
            
        try{
            // Obtiene los datos y hace las conversiones correspondientes (boletos: string --> int) y los elementos
            // seleccionados a un String
            String nombreCl = nombre.getText().trim();
            int boletos = Integer.parseInt(cantidadboletos.getText().trim());
            String sala = tipoSala.getSelectedItem().toString();
            String pelicula=peli.getSelectedItem().toString();
        
            //Seleccion
            switch(sala){
                case "SalaNormal":
                    String[] Normal = {"Discapacitado","Asiento estandar"};
                    JComboBox jcb1 = new JComboBox(Normal);
                    jcb1.setEditable(true);
                    JOptionPane.showMessageDialog( null, jcb1, "Asiento normal o discapacitado", JOptionPane.QUESTION_MESSAGE, icono("/imgs/normal.png", 40, 40));
                    String disc=jcb1.getSelectedItem().toString();
                    std[contador]=new SalaNormal(nombreCl,pelicula,boletos,disc);
                    contador+=boletos;
                    break;
            
                case "SalaVIP":
                    String[] VIP= {"Cama","Asiento Grande"};
                    JComboBox jcb2 = new JComboBox(VIP);
                    jcb2.setEditable(true);
                    JOptionPane.showMessageDialog( null, jcb2, "Selecciona el tipo de Asiento", JOptionPane.QUESTION_MESSAGE, icono("/imgs/vip.png", 40, 40));
                    String asiento=jcb2.getSelectedItem().toString();
                    std[contador]=new SalaVIP(nombreCl,pelicula,boletos,asiento);
                    contador+=boletos;
                    JOptionPane.showMessageDialog(null,"Registro exitoso");
                    break;
                    
                case "Sala4DX":
                    String[] S4DX = {"Negro","Azul","Rojo","Blanco"};
                    JComboBox jcb3 = new JComboBox(S4DX);
                    jcb3.setEditable(true);
                    JOptionPane.showMessageDialog(null, jcb3, "Selecciona el color", JOptionPane.QUESTION_MESSAGE, icono("/imgs/4dx.png", 40, 40));
                    String color=jcb3.getSelectedItem().toString();
                    std[contador]=new Sala4DX(nombreCl,pelicula,boletos,color);
                    contador+=boletos;    
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Por favor selecciona una sala válida");
                    return;       
        }
            JOptionPane.showMessageDialog(null,"Registro exitoso");
            // Limpiar después de un registro exitoso
            nombre.setText("");
            cantidadboletos.setText("");
        } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Error: En cantidad de boletos solo se admiten números.");
        }
    }//GEN-LAST:event_siguienteActionPerformed

    private void ImpresionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImpresionActionPerformed
         StringBuilder anidador = new StringBuilder(std.length);
        for (int i=0;i<contador;anidador.append(std[i++])) anidador.append("\n");
           
            JDialog reporteclientes = new JDialog((java.awt.Frame) null, true);
            reporteclientes.setTitle("Registro de clientes");
            reporteclientes.setLayout(new BorderLayout());
            
            JTextArea ArregloObj = new JTextArea(anidador.toString());
            Font font = new Font("Dubai", Font.BOLD, 13);
            ArregloObj.setFont(font);
            ArregloObj.setForeground(Color.white);
            ArregloObj.setEditable(false);
            ArregloObj.setColumns(40);
            ArregloObj.setRows(10);
            ArregloObj.setBackground(Color.darkGray);
            
            JScrollPane scroll = new JScrollPane(ArregloObj);
            reporteclientes.add(scroll, BorderLayout.CENTER);
            reporteclientes.revalidate();
            reporteclientes.pack();
            reporteclientes.setVisible(true);
            
    }//GEN-LAST:event_ImpresionActionPerformed

    private void tipoSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoSalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoSalaActionPerformed
    public Icon icono(String path, int width, int heigth) {
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage()
                .getScaledInstance(width, heigth, java.awt.Image.SCALE_SMOOTH));
        return img;
    }

    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(Alta_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alta_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alta_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alta_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alta_Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BACKGROUND;
    private javax.swing.JButton Impresion;
    private javax.swing.JButton Limpiar;
    private javax.swing.JTextField cantidadboletos;
    private javax.swing.JLabel cinepolis;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fondo1;
    private javax.swing.JLabel fondo2;
    private javax.swing.JLabel fondo3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nombre;
    private javax.swing.JComboBox<String> peli;
    private javax.swing.JButton siguiente;
    private javax.swing.JComboBox<String> tipoSala;
    // End of variables declaration//GEN-END:variables
}
