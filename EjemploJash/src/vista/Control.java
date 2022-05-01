package vista;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Luis Fernando Paxel
 */
public class Control extends javax.swing.JFrame {

    HashMap<String, String> hashTable;
   
    public Control() {
        initComponents();
        setLocationRelativeTo(null);
        hashTable = new HashMap();
        txtkey.setText("0");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtkey = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaResultado = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Areajash = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Llave: ");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(90, 70, 70, 20);

        txtkey.setEditable(false);
        txtkey.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtkey.setForeground(new java.awt.Color(0, 0, 0));
        txtkey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkeyActionPerformed(evt);
            }
        });
        jPanel2.add(txtkey);
        txtkey.setBounds(170, 60, 140, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Valor:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(360, 70, 56, 20);

        txtValor.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtValor.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtValor);
        txtValor.setBounds(420, 60, 140, 30);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Insertar Valores");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(240, 10, 290, 30);

        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Agregar.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregar);
        btnAgregar.setBounds(40, 130, 130, 50);

        btnModificar.setForeground(new java.awt.Color(0, 0, 0));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Actualizar2.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificar);
        btnModificar.setBounds(490, 130, 140, 48);

        btnMostrar.setForeground(new java.awt.Color(0, 0, 0));
        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Files.png"))); // NOI18N
        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnMostrar);
        btnMostrar.setBounds(190, 130, 130, 48);

        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        jPanel2.add(btnEliminar);
        btnEliminar.setBounds(340, 130, 130, 50);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 80, 680, 190);

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Opciones");

        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnSalir.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(62, 62, 62))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnLimpiar)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(730, 80, 210, 190);

        AreaResultado.setBackground(new java.awt.Color(204, 255, 255));
        AreaResultado.setColumns(20);
        AreaResultado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        AreaResultado.setForeground(new java.awt.Color(0, 0, 0));
        AreaResultado.setRows(5);
        AreaResultado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jScrollPane1.setViewportView(AreaResultado);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 290, 340, 400);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel4.setText("Tabla Hash");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(390, 10, 320, 60);

        Areajash.setBackground(new java.awt.Color(204, 255, 255));
        Areajash.setColumns(20);
        Areajash.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Areajash.setForeground(new java.awt.Color(0, 0, 0));
        Areajash.setRows(5);
        Areajash.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jScrollPane2.setViewportView(Areajash);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(380, 290, 560, 400);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtkeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkeyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkeyActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        AreaResultado.setText("");
        Areajash.setText("");
        hashTable.clear();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        /*
        String key = txtkey.getText();
        String valor = txtValor.getText();
        int lleva = 0;
        ArrayList<String> arr = new ArrayList<>();
        String datos[] = new String[1];

        if (hashTable.isEmpty()) {
            AreaResultado.append("El valor es nullo\n");
            hashTable.put(this.txtkey.getText(), valor);
            //     AreaResultado.append("" + lleva);

        } else {
            lleva = valor.length();
            auto = lleva + auto;
            AreaResultado.append("" + auto);
            hashTable.put(String.valueOf(auto), this.txtValor.getText());

        }

        //   limpiar();
        txtkey.setText("" + String.valueOf(auto));
         */
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        String Token1, test = this.AreaResultado.getText();
        String[] splitString = test.split("\n");// Separa la cadena si encuentra un salto de linea
        int i = -1; //Contador
        System.out.println("CLAVE\tTOKEN");
        for (String s : splitString) {
            i++; //Contado de variable fila  //PARA LOS TOKEN, FALSE ELIMINA LA PALABRA, TRUE FORMA EL TOKEN A PARTIR DE LA PALABRA
            StringTokenizer token = new StringTokenizer(s, " " + "\n", false); //Primer token separamos los espacios y saltos de lineas

            while (token.hasMoreElements()) {
                Object elemento = token.nextElement(); //Creamos un objeto para alamacenar el primer  vuelta token
                Token1 = elemento.toString();

                StringTokenizer token2 = new StringTokenizer(Token1, ";", true);//Segundo token, separando el punto y coma
                while (token2.hasMoreElements()) {
                    Object elemento2 = token2.nextElement(); //Guardamos el ultimo token
                    System.out.println("|" + String.valueOf(i) + String.valueOf(s.indexOf(elemento2.toString())) + "\t|" + elemento2);
                    hashTable.put(String.valueOf(i) + String.valueOf(s.indexOf(elemento2.toString())), elemento2.toString());
                }
            }
        }
        System.out.println("\nDatos Insertados: \n" + hashTable);//Mostrando los datos insertados en la tabla jash
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnModificarActionPerformed

    public void limpiar() {
        AreaResultado.setText("");
        txtkey.setText("");
        txtValor.setText("");
        hashTable.clear();
    }

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
            java.util.logging.Logger.getLogger(Control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Control().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaResultado;
    private javax.swing.JTextArea Areajash;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextField txtkey;
    // End of variables declaration//GEN-END:variables
}
