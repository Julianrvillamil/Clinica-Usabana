/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import controlador.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import modelo.*;


public class FrameMedico extends javax.swing.JFrame implements ActionListener, ItemListener, MouseListener, KeyListener {


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Medico");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));

        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("Regresar");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jRadioButton1.setText("Detalles");

        jRadioButton2.setText("Nuevo");

        jRadioButton3.setText("Ver Todos");

        jPanel3.setBackground(new java.awt.Color(0, 51, 255));

        jLabel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setText("Filtrar:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        jLabel2.setText("Especialidad");

        jLabel3.setText("Nombres");

        jLabel4.setText("Apellido1");

        jLabel5.setText("Apellido2");

        jLabel6.setText("Telefono");

        jLabel7.setText("Pasword");

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton2.setText("Buscar Foto");

        jButton4.setText("<<<");

        jButton5.setText(">>>");

        jButton6.setText("Modificar");

        jButton7.setText("Eliminar");

        jButton8.setText("Gestion de Disponibilidad");

        jButton9.setText("Ver Agenda");

        jLabel1.setText("Identificación:");

        jPasswordField1.setText("jPasswordField1");

        jToggleButton1.setText("Buscar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField1)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                        .addComponent(jTextField5)
                                        .addComponent(jTextField4))
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jToggleButton1)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                        .addGap(45, 45, 45))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jButton4)
                                    .addGap(76, 76, 76)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton8)
                                .addGap(18, 18, 18)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jToggleButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addComponent(jButton4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(101, 101, 101))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRadioButton3)
                                .addComponent(jRadioButton2)
                                .addComponent(jRadioButton1))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton3)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 462, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLayeredPane1)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables

//variables de clase
    private Entrada entry;
    private String rutaFotos;
    private String nombrefoto;
    private ButtonGroup bq;
    private GestionEspecialidades GestEsp;
    private GestionMedicos GestMed;
    private int numero;
    private int numeroDMed;
    private boolean buscaGuarda;
    private String nombrefotoX;

    private boolean modifiguarda;

    private DefaultTableModel modelo;
    //private String Medicos[];

    //metodos
    public FrameMedico(Entrada entry) {

        initComponents();

        this.setVisible(true);
        this.setLocationRelativeTo(null);

        //////PARA RADIOBOTONES////
        this.GestEsp = new GestionEspecialidades();
        this.GestMed = new GestionMedicos();
        this.entry = entry;

        this.modelo = new DefaultTableModel();

        this.bq = new ButtonGroup();
        this.inscribirRB();

        ///////PARA PANELES/////
        this.jPanel2.setVisible(false);

        this.jPanel2.setBounds(5, 5, 428, 411);
        this.jPanel2.setVisible(true);
        this.jLayeredPane1.add(this.jPanel2, new Integer(0), 0);

        this.jPanel3.setBounds(5, 5, 428, 411);
        this.jPanel3.setVisible(false);
        this.jLayeredPane1.add(this.jPanel3, new Integer(1), 0);

        this.modifiguarda = false;
        this.buscaGuarda = false;
        this.numero = 0;
        this.numeroDMed = this.numeroDMed + this.numero + 1;
        this.rutaFotos = "./fotos/";
        this.nombrefoto = "";
        this.nombrefotoX = "sinFoto.jpg";
        this.validarBotonDCarga();
        this.ponerImagen();
        this.poneraEscuchar();
        this.llenarCombo();
        this.llenarCombo2();
        this.modelarTabla();
        this.jTextField1.setEditable(true);
        this.jTextField2.setEditable(false);
        this.jTextField3.setEditable(false);
        this.jTextField4.setEditable(false);
        this.jTextField5.setEditable(false);
        this.jTextField6.setEditable(false);
        this.jPasswordField1.setEnabled(false);
        this.jComboBox1.setEnabled(false);
        this.jButton2.setEnabled(false);
        this.jRadioButton1.setSelected(true);

        this.jTextField2.setText(this.numeroDM(this.numero));

        this.cargarMedico(this.numero);

        //this.cargarMedico(this.contador);
        /////////COMBO///////////
        //llenarCombo();
        ///////PARA FOTOS///////
        //this.PonerSinFoto();
    }

    private void poneraEscuchar() {

        this.jRadioButton1.addActionListener(this);
        this.jRadioButton2.addActionListener(this);
        this.jRadioButton3.addActionListener(this);

        this.jTextField1.addKeyListener(this);
        this.jTextField3.addKeyListener(this);
        this.jTextField4.addKeyListener(this);
        this.jTextField5.addKeyListener(this);
        this.jTextField6.addKeyListener(this);

        this.jToggleButton1.addActionListener(this);
        this.jButton2.addActionListener(this);
        this.jButton3.addActionListener(this);
        this.jButton4.addActionListener(this);
        this.jButton5.addActionListener(this);
        this.jButton6.addActionListener(this);
        this.jButton7.addActionListener(this);
        this.jButton8.addActionListener(this);
        this.jButton9.addActionListener(this);

        this.jComboBox1.addItemListener(this);
        this.jComboBox2.addItemListener(this);

        this.jTable1.addMouseListener(this);

    }

    private void PonerSinFoto() {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Image sinFoto = tk.createImage(this.rutaFotos + "sinFoto.jpg");
        ImageIcon sinF = new ImageIcon(sinFoto.getScaledInstance(jLabel8.getWidth(), jLabel8.getHeight(), Image.SCALE_AREA_AVERAGING));
        this.jLabel8.setIcon(sinF);
    }

    private void validarBotonDCarga() {
        ArrayList<Medico> medicos = this.GestMed.getMedicos();
        if (this.numero == 0) {
            this.jButton4.setEnabled(false);
        } else {
            this.jButton4.setEnabled(true);
        }
        if (this.numero + 1 == medicos.size()) {
            this.jButton5.setEnabled(false);
        } else {
            this.jButton5.setEnabled(true);
        }
    }

    public String pasarIdMedico() {
        ArrayList<Medico> medicos = this.GestMed.getMedicos();
        String IdMedico;
        IdMedico = medicos.get(numero).getIdmed();

        return IdMedico;
    }

    private void cargarMedico(int numero) {

        String id, codigoEspe, nombre, ape1, ape2, tel, contra;

        ArrayList<Medico> medicos = this.GestMed.getMedicos();
        id = medicos.get(numero).getIdmed();
        nombre = medicos.get(numero).getNombres();
        ape1 = medicos.get(numero).getApellido1();
        ape2 = medicos.get(numero).getApellido2();
        tel = medicos.get(numero).getTelefono();
        contra = medicos.get(numero).getPassword();
        this.jTextField1.setText(id);
        this.jTextField3.setText(nombre);
        this.jTextField4.setText(ape1);
        this.jTextField5.setText(ape2);
        this.jTextField6.setText(tel);
        this.jPasswordField1.setText(contra);

        codigoEspe = medicos.get(numero).getIdespec();
        //System.err.println(""+codigoEspe);
        Especialidad especial = this.GestEsp.buscarEspecialidades(codigoEspe);
        //System.out.println(""+especial);
        if(especial!=null){
        this.jComboBox1.setSelectedItem(especial.getEspecialidad());

        ImageIcon image = new ImageIcon(this.rutaFotos + medicos.get(numero).getFoto());
        this.jLabel8.setIcon(image);
        //System.err.println("" + image);
        //System.err.println(""+this.jLabel8.getIcon());
        }else{this.jComboBox1.setSelectedItem("Especialidad no encontrada");}
    }

    private void inscribirRB() {

        this.bq.add(this.jRadioButton1);
        this.bq.add(this.jRadioButton2);
        this.bq.add(this.jRadioButton3);

    }

    private void analizaOpcion() {

        if (this.jRadioButton1.isSelected()) {

            this.buscaGuarda = false;
            cargarMedico(this.numero);
            this.jToggleButton1.setEnabled(true);
            this.jTextField2.setText(this.numeroDM(this.numero));
            this.jToggleButton1.setText("Buscar");
            this.jTextField1.setEditable(true);
            this.jTextField2.setEditable(false);
            this.jTextField3.setEditable(false);
            this.jTextField4.setEditable(false);
            this.jTextField5.setEditable(false);
            this.jTextField6.setEditable(false);
            this.jPasswordField1.setEnabled(false);
            this.jComboBox1.setEnabled(false);
            this.jButton2.setEnabled(false);

            this.jPanel2.setVisible(true);
            this.jButton4.setEnabled(true);
            this.jButton5.setEnabled(true);
            this.jButton6.setEnabled(true);
            this.jButton7.setEnabled(true);
            this.jButton8.setEnabled(true);
            this.jButton9.setEnabled(true);

            this.jPanel2.setVisible(true);
            this.jPanel2.setBounds(5, 5, 428, 411);
            this.jLayeredPane1.add(this.jPanel2, new Integer(0), 0);

            this.jPanel3.setBounds(5, 5, 428, 411);
            this.jPanel3.setVisible(false);
            this.jLayeredPane1.add(this.jPanel3, new Integer(1), 0);
            this.jPanel2.setVisible(true);

        }
        if (this.jRadioButton2.isSelected()) {
            this.buscaGuarda = true;
            this.jToggleButton1.setText("Guardar");
            this.jTextField1.setEditable(true);
            this.jTextField2.setEditable(true);
            this.jTextField3.setEditable(true);
            this.jTextField4.setEditable(true);
            this.jTextField5.setEditable(true);
            this.jTextField6.setEditable(true);
            this.jPasswordField1.setEnabled(true);
            this.jComboBox1.setEnabled(true);
            this.jButton2.setEnabled(true);

            this.jButton4.setEnabled(false);
            this.jButton5.setEnabled(false);
            this.jButton6.setEnabled(false);
            this.jButton7.setEnabled(false);
            this.jButton8.setEnabled(false);
            this.jButton9.setEnabled(false);
            this.jToggleButton1.setEnabled(false);

            this.jPanel2.setVisible(true);
            this.jPanel2.setBounds(5, 5, 428, 411);
            this.jLayeredPane1.add(this.jPanel2, new Integer(0), 0);

            this.jPanel3.setBounds(5, 5, 428, 411);
            this.jPanel3.setVisible(false);
            this.jLayeredPane1.add(this.jPanel3, new Integer(1), 0);
            this.jPanel2.setVisible(true);

        }
        if (this.jRadioButton3.isSelected()) {

            this.jPanel2.setBounds(5, 5, 428, 411);
            this.jPanel2.setVisible(false);
            this.jLayeredPane1.add(this.jPanel2, new Integer(0), 0);

            this.jPanel3.setBounds(5, 5, 428, 411);
            this.jPanel3.setVisible(true);
            this.jLayeredPane1.add(this.jPanel3, new Integer(1), 0);
        }

    }

    private void Paramodifi() {

        String nuevoId, nuevoNombreEsp, nuevoIdEsp, nuevoNombre, nuevoApe1, nuevoApe2, nuevoTel, nuevoPasword, nuevaFoto;
        String viejoId = jTextField1.getText();
        //this.jTextField1.setEditable(true);
        //this.PonerSinFoto();
        this.jTextField2.setEditable(true);
        this.jTextField3.setEditable(true);
        this.jTextField4.setEditable(true);
        this.jTextField5.setEditable(true);
        this.jTextField6.setEditable(true);
        this.jPasswordField1.setEnabled(true);
        this.jComboBox1.setEnabled(true);
        this.jButton2.setEnabled(true);
        this.jToggleButton1.setText("Guardar");
        this.modifiguarda = true;
        //nuevoId=jTextField1.getText();
    }

    private void guardarModifi() {

        //JOptionPane.showMessageDialog(null, "Entro!!!!!");
        String nuevoId, nuevoNombreEsp, nuevoIdEsp, nuevoNombre, nuevoApe1, nuevoApe2, nuevoTel, nuevoPasword, nuevaFoto;
        String viejoId = jTextField1.getText();
        String foti = "";
        boolean existe;

        existe = this.GestMed.existeIDmedico(viejoId);

        nuevoId = jTextField1.getText();
        nuevoNombreEsp = (String) this.jComboBox1.getSelectedItem();
        nuevoIdEsp = this.GestEsp.buscarIdEspecialidad(nuevoNombreEsp);

        nuevoNombre = jTextField3.getText();
        nuevoApe1 = jTextField4.getText();
        nuevoApe2 = jTextField5.getText();
        nuevoTel = jTextField6.getText();
        nuevoPasword = jPasswordField1.getText();
        foti = "" + this.jLabel8.getIcon();
        nuevaFoto = "" + foti.charAt(8) + foti.charAt(9) + foti.charAt(10)
                + foti.charAt(11) + foti.charAt(12) + foti.charAt(13)
                + foti.charAt(14) + foti.charAt(15) + foti.charAt(16)
                + foti.charAt(17) + foti.charAt(18);

        //nuevaFoto = this.nombrefotoX;
        System.err.println("" + nuevaFoto);
        //System.err.println("" + nuevoNombre);

        Medico nuevo = new Medico(nuevoId, nuevoIdEsp, nuevoNombre, nuevoApe1, nuevoApe2, nuevoTel, nuevaFoto, nuevoPasword);
        this.GestMed.modificarMedico(nuevo);
    }

    private void ponerImagen() {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Image imagen = tk.createImage(this.rutaFotos + "Doctores.jpg");
        ImageIcon imag = new ImageIcon(imagen.getScaledInstance(jLabel9.getWidth(), jLabel9.getHeight(), Image.SCALE_AREA_AVERAGING));
        this.jLabel9.setIcon(imag);
    }

    private void limpiador() {
        this.jTextField1.setText("");
        this.jTextField2.setText("");
        this.jTextField3.setText("");
        this.jTextField4.setText("");
        this.jTextField5.setText("");
        this.jTextField6.setText("");
        this.jPasswordField1.setText("");
        this.PonerSinFoto();
        this.jTextField1.requestFocus();
    }

    private void llenarCombo() {

        this.jComboBox1.addItem("Elija una especialidad");
        ArrayList<Especialidad> especialidades = this.GestEsp.getTodos();

        for (Especialidad especialidad : especialidades) {
            this.jComboBox1.addItem(especialidad.getEspecialidad());
        }

    }

    private void hacer() {

        String id, nombreEspecialidad, especiali, nombres, ape1, ape2, tel, foto, pasword;
        boolean existe;

        id = jTextField1.getText();
        nombreEspecialidad = (String) jComboBox1.getSelectedItem();
        especiali = this.GestEsp.buscarIdEspecialidad(nombreEspecialidad);
        nombres = jTextField3.getText();
        ape1 = jTextField4.getText();
        ape2 = jTextField5.getText();
        tel = jTextField6.getText();

        if (!(jTextField1.getText().length() == 0 || jTextField3.getText().length() == 0 || jTextField4.getText().length() == 0 || jTextField5.getText().length() == 0 || jTextField6.getText().length() == 0 || this.jPasswordField1.getText().length()==0)) {
            existe = this.GestMed.pruebaExistencia(id);
            pasword = jPasswordField1.getText();
            foto =  this.nombrefotoX;
            System.err.println(""+foto);
            if (existe) {
                JOptionPane.showMessageDialog(null, "ese id ya existe!!!");
            }
            if (!existe) {
                Medico medi = new Medico(id, especiali, nombres, ape1, ape2, tel, foto, pasword);
                this.GestMed.crearMedico(medi);
                this.limpiador();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Dejo un espacio vacio");
        }
    }

    private void eliminar() {

        String codigo;
        boolean existe = false;
        
        codigo = this.jTextField1.getText();
        existe = this.GestMed.pruebaExistencia(codigo);
        if (!existe) {
            JOptionPane.showMessageDialog(null, "Esa identificacion no existe!!!");
        } else {
            this.GestMed.eliminarMedico(codigo);
        }

    }

    private String numeroDM(int numero) {
        int numeroDmedico = 0;
        String numDM = "";
        numeroDmedico = numeroDmedico + numero + 1;
        numDM = "" + numeroDmedico;
        return numDM;
    }

    private void buscarMedico() {
        String iDMedico, iDEspecialidad;
        boolean existe;

        iDMedico = jTextField1.getText();
        existe = this.GestMed.pruebaExistencia(iDMedico);

        if (!existe) {
            JOptionPane.showMessageDialog(null, "Ese id no existe...");
        }
        if (existe) {
            Medico medi = this.GestMed.buscarMedico(iDMedico);
            this.jTextField3.setText(medi.getNombres());
            this.jTextField4.setText(medi.getApellido1());
            this.jTextField5.setText(medi.getApellido2());
            this.jTextField6.setText(medi.getTelefono());
            this.jPasswordField1.setText(medi.getPassword());
            iDEspecialidad=medi.getIdespec();
            Especialidad espe =this.GestEsp.buscarEspecialidades(iDEspecialidad);
            if(espe!=null){
            this.jComboBox1.setSelectedItem(espe.getEspecialidad());
            ImageIcon image=new ImageIcon(this.rutaFotos+medi.getFoto());
            this.jLabel8.setIcon(image);
            }else{this.jComboBox1.setSelectedItem("Especialidad no encontrada");}
            //this.filtrarTabla(medi.getIdmed());
        }

    }

    ///////////////TABLA/////////////
    private void llenarCombo2() {

        this.jComboBox2.addItem("TODOS");
        ArrayList<Especialidad> especialidades = this.GestEsp.getTodos();
        for (Especialidad espec : especialidades) {
            this.jComboBox2.addItem(espec.getEspecialidad());
        }
    }

    private void modelarTabla() {

        this.jTable1.setModel(this.modelo);

        String[] titulos = {"Identificación", "Nombres", "Apellidos", "Telefono"};
        this.modelo.setDataVector(null, titulos);

        TableColumn columna = null;
        columna = this.jTable1.getColumnModel().getColumn(0);
        columna.setMinWidth(80);
        columna.setMaxWidth(80);

        columna = this.jTable1.getColumnModel().getColumn(3);
        columna.setMinWidth(80);
        columna.setMaxWidth(80);
        this.verTodos();

    }

    private void agregaFila(Medico medi) {
        
        String codigoMedico;
        Vector<String> fila = new Vector();
        fila.add(medi.getIdmed());
        fila.add(medi.getNombres());
        fila.add(medi.getApellido1() + " " + medi.getApellido2());
        fila.add(medi.getTelefono());
        codigoMedico = medi.getIdespec();
        Especialidad espe = this.GestEsp.buscarEspecialidades(codigoMedico);
        if(espe!=null){
        fila.add(espe.getEspecialidad());
        this.modelo.addRow(fila);
        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(this.modelo);
        this.jTable1.setRowSorter(elQueOrdena);
    }else{}
    }

    private void filtrarTabla() {

        String filtrador, especialidad, comparador, codigo;
        this.limpiarTabla();
        filtrador = (String) this.jComboBox2.getSelectedItem();
        ArrayList<Medico> medicos = this.GestMed.getMedicos();
        for (Medico medico : medicos) {
            comparador = medico.getIdespec();
            //System.out.println(""+comparador);
            especialidad = this.GestEsp.buscarIdEspecialidad(filtrador);
            //System.err.println(""+especialidad);
            //codigo = this.GestMed.buscarPorEspecialidad(especialidad);
            //System.err.println(""+codigo);
            if (comparador.equals(especialidad)) {

                this.agregaFila(medico);
            }
        }

    }
   
    private void limpiarTabla() {
        int filas = this.jTable1.getRowCount();
        if (filas > 0) {
            for (int i = 0; i < filas; i++) {
                this.modelo.removeRow(0);
            }
        }

    }

    public void verTodos() {

        ArrayList<Medico> medicos = this.GestMed.getMedicos();
        for (Medico medi : medicos) {
            this.agregaFila(medi);
        }
    }

    //ACCIONES
    //=================================================================================
    @Override
    public void actionPerformed(ActionEvent evento) {
        int a = 0;
        //this.jToggleButton1.setText("Buscar");
        //this.jToggleButton1.setText("Mostrar");
        if (evento.getSource() == this.jToggleButton1) {
            if (this.buscaGuarda == false && this.modifiguarda == true) {

                this.guardarModifi();
                //this.modifiguarda = false;

                this.jTextField2.setEditable(false);
                this.jTextField3.setEditable(false);
                this.jTextField4.setEditable(false);
                this.jTextField5.setEditable(false);
                this.jTextField6.setEditable(false);
                this.jPasswordField1.setEnabled(false);
                this.jComboBox1.setEnabled(false);
                this.jButton2.setEnabled(false);
                this.jToggleButton1.setText("Buscar");
                this.modifiguarda = false;
                
                this.verTodos();
            }

            if (this.buscaGuarda == true) {
                this.hacer();
            } else {
                //metodo para buscar
                this.buscarMedico();
            }

        }
        if (evento.getSource() == this.jButton3) {
            this.setVisible(false);
            this.entry.setVisible(true);
        }
        ////PARA BUSCAR FOTO/////
        if (evento.getSource() == this.jButton2) {
            //this.elegirFoto();
            //this.ponerFoto();
            //this.buscarFoto();

            JFileChooser jfc = new JFileChooser();
            //String nombrefotoX;

            int rta = jfc.showSaveDialog(null);

            if (rta == JFileChooser.APPROVE_OPTION) {
                this.nombrefotoX = jfc.getSelectedFile().getName();
                ImageIcon lafoto = new ImageIcon(this.rutaFotos + this.nombrefotoX);
                jLabel8.setIcon(lafoto);
                this.jToggleButton1.setEnabled(true);
            } else {
                this.nombrefotoX = "sinFoto.jpg";
            }
            //return nombrefoto;
        }
        if (evento.getSource() == this.jButton7) {
            this.eliminar();
            this.numero = 0;
            this.cargarMedico(this.numero);
            this.jTextField2.setText(this.numeroDM(this.numero));
        }

        if (evento.getSource() == this.jButton4) {
            if (this.numero > 0) {
                this.numero = this.numero - 1;
                this.cargarMedico(this.numero);
                this.validarBotonDCarga();
                this.jTextField2.setText(this.numeroDM(this.numero));

            }
        }
        if (evento.getSource() == this.jButton5) {
            ArrayList<Medico> medicos = this.GestMed.getMedicos();
            if (this.numero < medicos.size() - 1) {
                this.numero = this.numero + 1;
                this.cargarMedico(this.numero);
                this.validarBotonDCarga();
                this.jTextField2.setText(this.numeroDM(this.numero));

            }
        }

        if (evento.getSource() == this.jButton6) {
            this.Paramodifi();

        }

        ////////RADIO BOTONES///////////////////////////
        if (evento.getSource() == this.jRadioButton1) {
            this.analizaOpcion();
            this.jRadioButton2.setSelected(false);
            this.jRadioButton3.setSelected(false);
        }

        //this.jPasswordField1.getText()
        if (evento.getSource() == this.jRadioButton2) {
            this.jRadioButton1.setSelected(false);
            this.jRadioButton3.setSelected(false);
            this.analizaOpcion();
            limpiador();
            /////GUARDAR MEDICO//////

        }
        if (evento.getSource() == this.jRadioButton3) {
            this.jRadioButton3.setSelected(true);
            this.jRadioButton1.setSelected(false);
            this.jRadioButton2.setSelected(false);
            this.analizaOpcion();

        }

        if (evento.getSource() == this.jButton9) {
            this.setVisible(false);
            FrameAgenda agenda = new FrameAgenda(this);

        }
        if (evento.getSource() == this.jButton8) {
            this.setVisible(false);
            FrameGestionDispM gestDispM = new FrameGestionDispM(this);

        }

    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        if (e.getSource() == this.jComboBox2) {
            if (e.getStateChange() == ItemEvent.SELECTED)//Si se seleccionó algun item
            {
                int index = this.jComboBox2.getSelectedIndex();
                String item = (String) this.jComboBox2.getSelectedItem();
                if (index > 0) {
                    this.filtrarTabla();
                }
                if (index == 0) {
                    this.verTodos();
                    this.limpiarTabla();
                    this.verTodos();
                }
            }
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {

        if (e.getSource() == this.jTable1) {
            int seleccionada = this.jTable1.getSelectedRow();
            String codigo = (String) this.jTable1.getValueAt(seleccionada, 0);
            Medico medi = this.GestMed.buscarMedico(codigo);

        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();

        if (e.getSource() == this.jTextField1) {
            if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
                getToolkit().beep();//sonido
                JOptionPane.showMessageDialog(null, "Caracter no valido");
                e.consume();
            }
        }
        if (e.getSource() == this.jTextField2) {
            if (!(Character.isLetter(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Caracter no valido");
                e.consume();
            }
        }
        if (e.getSource() == this.jTextField3) {
            if (!(Character.isLetter(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_SPACE)) {
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Caracter no valido");
                e.consume();
            }
        }
        if (e.getSource() == this.jTextField4) {
            if (!(Character.isLetter(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Caracter no valido");
                e.consume();
            }
        }
        if (e.getSource() == this.jTextField5) {
            if (!(Character.isLetter(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Caracter no valido");
                e.consume();
            }
        }
        if (e.getSource() == this.jTextField6) {
            if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Caracter no valido");
                e.consume();
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
