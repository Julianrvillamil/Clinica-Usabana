/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import controlador.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.*;


public class FrameEspecialidad extends javax.swing.JFrame implements ActionListener, KeyListener {


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Especialidades");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("Regresar");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setText("OK");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jComboBox1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton2.setText("OK");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton4.setText("Nueva");

        jButton5.setText("Modificar");

        jButton6.setText("Eliminar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addGap(5, 5, 5)
                                .addComponent(jTextField2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

//variables de clase
    //metodos
    /*public static void main(String args[]) {
        new FrameEspecialidad();
    }*/
    private Entrada entry;
    private GestionEspecialidades GestEsp;

    private String espec;

    public FrameEspecialidad(Entrada entry) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.poneraEscuchar();
        this.entry = entry;
        this.GestEsp = new GestionEspecialidades();
        llenarCombo();

        this.jButton1.setEnabled(false);
        this.jButton2.setEnabled(false);
        this.jTextField1.setEnabled(false);
        this.jComboBox1.setEnabled(true);

        this.espec = (String) jComboBox1.getSelectedItem();

    }

    public void poneraEscuchar() {

        this.jButton1.addActionListener(this);
        this.jButton2.addActionListener(this);
        this.jButton3.addActionListener(this);
        this.jButton4.addActionListener(this);
        this.jButton5.addActionListener(this);
        this.jButton6.addActionListener(this);
        //this.jComboBox1.addItemListener(this);

        this.jTextField1.addKeyListener(this);
        this.jTextField2.addKeyListener(this);
    }

    private void llenarCombo() {
        this.jComboBox1.addItem("Elija una especialidad");

        ArrayList<Especialidad> especialidades = this.GestEsp.getTodos();

        for (Especialidad especialidad : especialidades) {
            this.jComboBox1.addItem(especialidad.getEspecialidad());
        }

    }

    private void borrarCombo() {

        ArrayList<Especialidad> especialidades = this.GestEsp.getTodos();

        for (Especialidad especialidad : especialidades) {
            this.jComboBox1.removeAllItems();
        }

    }

    private void hacer() {
        String especialidadN;
        boolean existe;

        especialidadN = this.jTextField1.getText();

        if (!(especialidadN.length() == 0)) {
            //int num = (int) Math.floor(Math.random() * (99 - 10) + 10);
            //String idespecialidad = "" + especialidadN.charAt(0) + especialidadN.charAt(1) + especialidadN.charAt(2) + num;

            existe = this.GestEsp.pruebaExistencia(especialidadN);

            if (existe) {
                JOptionPane.showMessageDialog(null, "esa especialidad ya existe!!!");
            }

            if (!existe) {
                String idEspecialidad = this.GestEsp.hacerID(this.jTextField1.getText());
                Especialidad espe = new Especialidad(especialidadN, idEspecialidad);
                this.GestEsp.crearEspecialid(espe);
                //this.limpiar();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Tiene que poner una especialidad");
        }
    }

    private void hacerModifi() {

        String nuevaEspe, viejaEspe;
        boolean existe;

        nuevaEspe = this.jTextField2.getText();
        viejaEspe = (String) this.jComboBox1.getSelectedItem();

        existe = this.GestEsp.existeEspecialidad(nuevaEspe);

        //System.err.println(""+existe);
        
        if (existe==true) {
            JOptionPane.showMessageDialog(null, "Esa especialidad ya existe");
        }else{
            
            String idEspecialidad = this.GestEsp.hacerID(this.jTextField2.getText());
            Especialidad nueva = new Especialidad (nuevaEspe,idEspecialidad);
            
            this.GestEsp.modificarEspecialidad(nueva,viejaEspe);

            //this.GestEsp.modificarEspecialidad(viejaEspe, nuevaEspe);
        }
        
        

    }
    

    //ACCIONES
    //=================================================================================
    @Override
    public void actionPerformed(ActionEvent evento) {
        //salir
        if (evento.getSource() == this.jButton3) {
            this.entry.setVisible(true);
            this.setVisible(false);
        }

        ///////////////HABILOTACIONES/////////////////
        //habilitar escribir una nueva especialidad  
        if (evento.getSource() == this.jButton4) {
            this.jTextField1.setEnabled(true);
            this.jButton1.setEnabled(true);
        }
        if (evento.getSource() == this.jButton5) {
            this.jTextField2.setEnabled(true);
            this.jButton2.setEnabled(true);
        }
        //Habilitar boton "OK"

        ///////////////Operaciones CRUD////////////////
        //Crear una nueva
        if (evento.getSource() == this.jButton1) {
            //Especialidad = new Especialidad ();CREAR EL OBJETO DE TIPO ESPECIALIDAD
            hacer();
            this.jTextField1.setText("");
            this.jButton1.setEnabled(false);
            borrarCombo();
            llenarCombo();
        }

        //Modificar 
        if (evento.getSource() == this.jButton2) {
            /*this.espec=(String)jComboBox1.getSelectedItem();
            GestionEspecialidades gestoresp = new GestionEspecialidades();
            gestoresp.modificarEspecialidad((String) this.jComboBox1.getSelectedItem(), this.jTextField2.getText());
            this.jTextField2.setText("");*/
            this.hacerModifi();
            this.jButton2.setEnabled(false);
            this.jTextField2.setText("");
            borrarCombo();
            llenarCombo();
        }
        //Borrar
        if (evento.getSource() == this.jButton6) {
            GestionEspecialidades gestoresp = new GestionEspecialidades();
            gestoresp.borrarEspecialidad((String) this.jComboBox1.getSelectedItem());
            borrarCombo();
            llenarCombo();
        }
        //Mostrar

    }

    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        if (e.getSource() == this.jTextField1) {
            if (!(Character.isLetter(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
                getToolkit().beep();
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

    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
