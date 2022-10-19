/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import controlador.GestionPaciente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import modelo.*;
import controlador.*;


public class FramePacientes extends javax.swing.JFrame implements ActionListener, ItemListener, MouseListener, KeyListener {


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion Pacientes");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("Regresar");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel3.setBackground(new java.awt.Color(0, 0, 153));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Fecha", "Día", "Hora", "Doctor"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton7.setText("Detalles Pacientes");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("ID");

        jButton4.setText("Modificar");

        jButton5.setText("Eliminar");

        jButton6.setText("Historial");

        jLabel2.setText("Identificacion:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Apellido1:");

        jLabel5.setText("Apellido 2:");

        jLabel6.setText("Telefono:");

        jLabel7.setText("Nacimiento:");

        jRadioButton1.setText("Hombre");

        jRadioButton2.setText("Mujer");

        jLabel8.setText("Genero:");

        jRadioButton3.setText("Nuevo");

        jRadioButton4.setText("Guardar");

        jButton1.setText("Guardar modificacion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2))
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton4)
                        .addGap(16, 16, 16)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton1))
                        .addGap(30, 30, 30)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1)
                    .addComponent(jLabel8))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 615, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLayeredPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables

//variables de clase
    private Entrada entry;
    private ButtonGroup bqGenero;
    private ButtonGroup bqGestion;

    private GestionPaciente GestPas;
    private GestionCita GestCit;
    private GestionMedicos GestMed;
    private DateFormat df;
    
     private DefaultTableModel modelo;
    //metodos

    public FramePacientes(Entrada entry) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.poneraEscuchar();

        this.bqGenero = new ButtonGroup();
        this.bqGestion = new ButtonGroup();
        this.modelo = new DefaultTableModel();
        this.GestPas = new GestionPaciente();
        this.GestCit = new GestionCita();
        this.GestMed = new GestionMedicos();
        this.df = DateFormat.getDateInstance();

        this.paraNoModifi();
        this.llenarCombo();
        this.analizaOpcion1();
        this.inscribirRBGenero();
        this.inscribirRBGest();
        this. modelarTabla();

    }

    private void poneraEscuchar() {

        this.jRadioButton1.addActionListener(this);
        this.jRadioButton2.addActionListener(this);
        this.jRadioButton3.addActionListener(this);
        this.jRadioButton4.addActionListener(this);

        this.jButton1.addActionListener(this);
        this.jButton3.addActionListener(this);
        this.jButton4.addActionListener(this);
        this.jButton5.addActionListener(this);
        this.jButton6.addActionListener(this);
        this.jButton7.addActionListener(this);

        this.jComboBox1.addItemListener(this);

        this.jTable1.addMouseListener(this);
        
        this.jTextField1.addKeyListener(this);
        this.jTextField2.addKeyListener(this);
        this.jTextField3.addKeyListener(this);
        this.jTextField4.addKeyListener(this);
        this.jTextField5.addKeyListener(this);
    }

    private void analizaOpcion1() {

        this.jPanel3.setVisible(false);
        this.jPanel1.setVisible(true);
        this.jPanel1.setBounds(5, 5, 596, 332);
        this.jLayeredPane1.add(this.jPanel1, new Integer(0), 0);

    }

    private void analizaOpcion2() {

        this.jPanel1.setVisible(false);
        this.jPanel3.setVisible(true);
        this.jPanel3.setBounds(5, 5, 608, 356);

        this.jLayeredPane1.add(this.jPanel3, new Integer(1), 0);

    }

    private void limpiador() {

        this.jTextField1.setText("");
        this.jTextField2.setText("");
        this.jTextField3.setText("");
        this.jTextField4.setText("");
        this.jTextField5.setText("");
        this.jRadioButton1.setSelected(false);
        this.jRadioButton1.setSelected(false);
    }

    private void inscribirRBGenero() {

        this.bqGenero.add(this.jRadioButton1);
        this.bqGenero.add(this.jRadioButton2);

    }

    private void inscribirRBGest() {

        this.bqGestion.add(this.jRadioButton3);
        this.bqGestion.add(this.jRadioButton4);

    }

    private void analizaOpcionNuevoGuard() {
        //RADIO BOTON DE NUEVO

        if (this.jRadioButton3.isSelected()) {

        }
        //RADIO BOTON DE GUARDAR
        if (this.jRadioButton4.isSelected()) {

        }
    }

    private void llenarCombo() {

        this.jComboBox1.addItem("Elija un id de paciente");
        ArrayList<Paciente> pacientes = this.GestPas.getPacientes();

        for (Paciente paciente : pacientes) {
            this.jComboBox1.addItem(paciente.getIdPaciente());
        }

    }

    private void paraModifi() {
        this.jButton1.setEnabled(true);
        this.jTextField1.setEnabled(true);
        this.jTextField2.setEnabled(true);
        this.jTextField3.setEnabled(true);
        this.jTextField4.setEnabled(true);
        this.jTextField5.setEnabled(true);
        this.jDateChooser1.setEnabled(true);
        this.jRadioButton1.setEnabled(true);
        this.jRadioButton2.setEnabled(true);

    }

    private void paraNoModifi() {
        
        this.jButton1.setEnabled(true);
        
        this.jTextField1.setEnabled(false);
        this.jTextField2.setEnabled(false);
        this.jTextField3.setEnabled(false);
        this.jTextField4.setEnabled(false);
        this.jTextField5.setEnabled(false);
        this.jDateChooser1.setEnabled(false);
        this.jRadioButton1.setEnabled(false);
        this.jRadioButton2.setEnabled(false);

    }
    
    private void borraCombo() {

        ArrayList<Paciente> pacientes = this.GestPas.getPacientes();

        for (Paciente paci : pacientes) {
            this.jComboBox1.removeAllItems();
        }

    }

    //////////////CRUD//////////////
    private void hacer() {
//|| this.jTextField3.getText().length() == 0 || this.jTextField4.getText().length() == 0 || this.jTextField5.getText().length() == 0) || !(this.jRadioButton1.isSelected() && this.jRadioButton2.isSelected())
        if (!(this.jTextField1.getText().length() == 0 || this.jTextField3.getText().length() == 0 || this.jTextField4.getText().length() == 0 || this.jTextField5.getText().length() == 0 )) {
            JOptionPane.showMessageDialog(null, "Entro!!!");
            String idPaci, nombre, ape1, ape2, tel, nacimiento, fecha;
            char genero = ' ';
            int año, mes, dia;
            boolean existe = false;
            fecha = this.df.format(this.jDateChooser1.getDate());
            idPaci = this.jTextField1.getText();
            nombre = this.jTextField2.getText();
            ape1 = this.jTextField3.getText();
            ape2 = this.jTextField4.getText();
            tel = this.jTextField5.getText();
            nacimiento = (fecha);
            //año = jCalendar1.getCalendar().get(Calendar.YEAR);
            //mes = jCalendar1.getCalendar().get(Calendar.MONTH);
            //dia = jCalendar1.getCalendar().get(Calendar.DAY_OF_MONTH);
            //nacimiento = "" + dia + "/" + mes + "/" + año;

            if (this.jRadioButton1.isSelected()) {
                genero = 'M';
            }
            if (this.jRadioButton2.isSelected()) {
                genero = 'F';
            }

            existe = this.GestPas.pruebaExistencia(idPaci);
            if (existe) {
                JOptionPane.showMessageDialog(null, "ese id ya existe!!!");
            }
            if (!existe) {
                Paciente paci = new Paciente(idPaci, nombre, ape1, ape2, tel, nacimiento, genero);
                this.GestPas.crearPaciente(paci);
                this.limpiador();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Dejo algo en blanco");
        }

    }

    private void eliminar() {

        String codigo;
        boolean existe = false;

        codigo = (String) this.jComboBox1.getSelectedItem();
        existe = this.GestPas.pruebaExistencia(codigo);
        if (!existe) {
            JOptionPane.showMessageDialog(null, "Esa identificacion no existe!!!");
        } else {
            this.GestPas.eliminarPaciente(codigo);
        }

    }

    private void buscarPaciente() {

        String iDPaciente, nacimiento, fecha;
        boolean existe;

        iDPaciente = (String) this.jComboBox1.getSelectedItem();

        existe = this.GestPas.pruebaExistencia(iDPaciente);

        if (!existe) {
            JOptionPane.showMessageDialog(null, "Ese id no existe...");
        }
        if (existe) {
            Paciente paci = this.GestPas.buscaPaciente(iDPaciente);
            this.jTextField1.setText(paci.getIdPaciente());
            this.jTextField2.setText(paci.getNombres());
            this.jTextField3.setText(paci.getApellido1());
            this.jTextField4.setText(paci.getApellido2());
            this.jTextField5.setText(paci.getTelefono());
            //this.jDateChooser1.setDate(paci.getNacimiento());

            SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MM/yyy");
            String strFecha = paci.getNacimiento();
            Date fechi = null;
            try {

                fechi = formatoDelTexto.parse(strFecha);

            } catch (ParseException ex) {

                ex.printStackTrace();

            }
            this.jDateChooser1.setDate(fechi);
            //System.out.println(fechi.toString());

            /*while (nacimiento  != null) {
                String[] campos = nacimiento.split("/");
                campos[0]= dia;
                campos[1]= mes;
                campos[2]= año;
            }*/
            //año = jCalendar1.setCalendar().set(Calendar.YEAR);
            //mes = jCalendar1.getCalendar().get(Calendar.MONTH);
            //dia = jCalendar1.getCalendar().get(Calendar.DAY_OF_MONTH);
            if (paci.getSexo() == 'M') {
                this.jRadioButton1.setSelected(true);
            }
            if (paci.getSexo() == 'F') {
                this.jRadioButton2.setSelected(true);

            }

        }

    }
    
    private void guardaModifi(){
    if (!(this.jTextField1.getText().length() == 0 || this.jTextField3.getText().length() == 0 || this.jTextField4.getText().length() == 0 || this.jTextField5.getText().length() == 0 )) {
            //JOptionPane.showMessageDialog(null, "Entro!!!");
            String idPaci, nombre, ape1, ape2, tel, nacimiento, fecha;
            char genero = ' ';
            int año, mes, dia;
            boolean existe = false;
            fecha = this.df.format(this.jDateChooser1.getDate());
            idPaci = this.jTextField1.getText();
            System.err.println(""+idPaci);
            nombre = this.jTextField2.getText();
            ape1 = this.jTextField3.getText();
            ape2 = this.jTextField4.getText();
            tel = this.jTextField5.getText();
            nacimiento = (fecha);
            //año = jCalendar1.getCalendar().get(Calendar.YEAR);
            //mes = jCalendar1.getCalendar().get(Calendar.MONTH);
            //dia = jCalendar1.getCalendar().get(Calendar.DAY_OF_MONTH);
            //nacimiento = "" + dia + "/" + mes + "/" + año;

            if (this.jRadioButton1.isSelected()) {
                genero = 'M';
            }
            if (this.jRadioButton2.isSelected()) {
                genero = 'F';
            }

            //existe = this.GestPas.pruebaExistencia(idPaci);
            
                Paciente paci = new Paciente(idPaci, nombre, ape1, ape2, tel, nacimiento, genero);
                this.GestPas.modifiPaciente(paci);
                this.limpiador();
            
        } else {
            JOptionPane.showMessageDialog(null, "Dejo algo en blanco");
        }

    }

    
    
    ///////////////TABLA/////////////
    
   /* private void llenarCombo() {

        this.jComboBox1.addItem("TODOS");
        ArrayList<Cita> citas = this.GestCit.filtrarMedicos(elIdMedico());
        for (Cita cit : citas) {
            this.jComboBox1.addItem(cit.getFecha());
        }
    }*/

    private void modelarTabla() {

        this.jTable1.setModel(this.modelo);

        String[] titulos = {"Fecha", "Dia", "Hora", "Doctor"};
        this.modelo.setDataVector(null, titulos);

        TableColumn columna = null;
        /*columna = this.jTable1.getColumnModel().getColumn(0);
        columna.setMinWidth(80);
        columna.setMaxWidth(80);

        columna = this.jTable1.getColumnModel().getColumn(3);
        columna.setMinWidth(80);
        columna.setMaxWidth(80);*/
        this.verTodos();

    }
    
    public void verTodos() {
        
        ArrayList<Cita> cit = this.GestCit.filtrarPacientes((String)this.jComboBox1.getSelectedItem());
        //System.err.println(""+this.GestCit.filtrarPacientes((String)this.jComboBox1.getSelectedItem()));
        //JOptionPane.showMessageDialog(null, "**************"+cit);
        for (Cita cita : cit) {
            
            this.agregaFila(cita);
        }
    }

    private void agregaFila(Cita cit) {
        //System.err.println(""+medi);
        //JOptionPane.showMessageDialog(null, "**************");

        String codigoMedico;
        String codMed = cit.getIdMedico();
        String nomMedi= this.GestMed.buscarNameMed(codMed);
        Vector<String> fila = new Vector();
        fila.add(cit.getFecha());
        //System.err.println(""+cit.getFecha());
        fila.add(cit.getDia());
        fila.add(cit.getHora());
        fila.add(nomMedi);
        codigoMedico = cit.getIdMedico();
        //System.err.println(""+codigoMedico);
        Medico medi = this.GestMed.buscarMedico(codigoMedico);
        System.err.println(""+medi);
        if(medi!=null){
        fila.add(medi.getIdmed());
        this.modelo.addRow(fila);
        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(this.modelo);
        this.jTable1.setRowSorter(elQueOrdena);
    }else{}
    }

   /* private void filtrarTabla() {

        String filtrador, especialidad, comparador, codigo;
        this.limpiarTabla();
        filtrador = (String) this.jComboBox1.getSelectedItem();
        ArrayList<Cita> citas = this.GestCit.getTodos();
        for (Cita cit : citas) {
            comparador = cit.getFecha();
            //System.out.println(""+comparador);
            //especialidad = this.GestEsp.buscarIdEspecialidad(filtrador);
            //System.err.println(""+especialidad);
            //codigo = this.GestMed.buscarPorEspecialidad(especialidad);
            //System.err.println(""+codigo);
            if (comparador.equals(filtrador)) {

                this.agregaFila(cit);
            }
        }

    }*/
   
    private void limpiarTabla() {
        int filas = this.jTable1.getRowCount();
        if (filas > 0) {
            for (int i = 0; i < filas; i++) {
                this.modelo.removeRow(0);
            }
        }

    }


    
    
    
    
    
   
    
    

    

    //ACCIONES
    //=================================================================================
    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == this.jButton1) {
            this.guardaModifi();
        }
        
        if (evento.getSource() == this.jButton3) {
            //System.exit(0);
            this.setVisible(false);
            new Entrada();
        }
        if (evento.getSource() == this.jButton4) {
            this.paraModifi();
        }
        if (evento.getSource() == this.jButton5) {
            this.eliminar();
        }
        if (evento.getSource() == this.jButton6) {
            this.analizaOpcion2();
        }

        if (evento.getSource() == this.jButton7) {
            this.analizaOpcion1();
            this.limpiarTabla();

        }
        if (evento.getSource() == this.jComboBox1) {

        }

        //////////RADIO BOTONES//////////
        if (evento.getSource() == this.jRadioButton3) {

            this.limpiador();
            this.paraModifi();
        }
        if (evento.getSource() == this.jRadioButton4) {

            this.hacer();
            this.borraCombo();
            this.llenarCombo();
            this.jRadioButton4.setSelected(false);
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == jComboBox1) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                int index = this.jComboBox1.getSelectedIndex();
                String item = (String) this.jComboBox1.getSelectedItem();
                if (index > 0) {
                    this.jRadioButton3.setSelected(false);
                    this.jRadioButton4.setSelected(false);
                    this.paraNoModifi();
                    this.buscarPaciente();
                    this.verTodos();
                } else {
                    //this.jButton1.setEnabled(false);
                }
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

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
        char c=e.getKeyChar();
        if(e.getSource()==this.jTextField1)
        {
            if(!(Character.isDigit(c) || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_BACK_SPACE))
            {
                getToolkit().beep();//sonido
                JOptionPane.showMessageDialog(null,"Digito no valido");
                e.consume();
            }
        }
        if(e.getSource()==this.jTextField2)
        {
            if(!(Character.isLetter(c) || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_SPACE || c == KeyEvent.VK_BACK_SPACE))
            {
                getToolkit().beep();//sonido
                JOptionPane.showMessageDialog(null,"Digito no valido");
                e.consume();
            }
        }
        if(e.getSource()==this.jTextField3)
        {
            if(!(Character.isLetter(c) || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_BACK_SPACE))
            {
                getToolkit().beep();//sonido
                JOptionPane.showMessageDialog(null,"Digito no valido");
                e.consume();
            }
        }
        if(e.getSource()==this.jTextField4)
        {
            if(!(Character.isLetter(c) || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_BACK_SPACE))
            {
                getToolkit().beep();//sonido
                JOptionPane.showMessageDialog(null,"Digito no valido");
                e.consume();
            }
        }
        if(e.getSource()==this.jTextField5)
        {
            if(!(Character.isDigit(c) || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_BACK_SPACE))
            {
                getToolkit().beep();//sonido
                JOptionPane.showMessageDialog(null,"Digito no valido");
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
