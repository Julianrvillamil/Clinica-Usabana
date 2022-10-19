/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import static com.sun.scenario.effect.impl.prism.PrEffectHelper.render;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import modelo.*;
import controlador.*;
import java.util.ArrayList;
import java.util.Vector;
import sun.swing.table.DefaultTableCellHeaderRenderer;


public class FrameGestionDispM extends javax.swing.JFrame implements ActionListener, ItemListener, MouseListener, KeyListener {


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion Disponibilidad");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("Regresar");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Dia", "Desde", "Hasta"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("Agregar");

        jButton2.setText("Eliminar");

        jButton4.setText("Guardar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(64, 64, 64)
                        .addComponent(jButton4)
                        .addGap(41, 41, 41))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton4)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

//variables de clase
    private DefaultTableModel modelo;

    Entrada entry;
    private FrameMedico medi;
    private GestionDispoM GestDis;
    
    private String dia;

    //metodos
    public FrameGestionDispM(FrameMedico medi) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.poneraEscuchar();
        
        this.GestDis = new GestionDispoM();
        
        this.medi = medi;
        this.modelo = new DefaultTableModel();
        this.jTable1.setModel(this.modelo);
        //this.IdMedi = new FrameMedico(entry);
        this.modelaTablaC0();
        this.modelaTablaC1();
        this.modelaTablaC2();
        ponerIdMedico();
        
        this.dia="";
        this.filtrarIdMedico();
    }

    private void poneraEscuchar() {

        this.jButton1.addActionListener(this);
        this.jButton2.addActionListener(this);
        this.jButton3.addActionListener(this);
        this.jButton4.addActionListener(this);
    }

    private void limpiador() {

    }
    
    public ArrayList<Disponibilidad>mandarDisponibles(String idMedi){
        
        String filtrador,comparador;
        
        filtrador = idMedi;
        ArrayList<Disponibilidad> disponibles = this.GestDis.getTodos();
         ArrayList<Disponibilidad> disp = new ArrayList();
        System.out.print(""+disponibles);
        for(Disponibilidad dispo : disponibles){
            comparador= dispo.getIdmedico();
            if(comparador.equals(filtrador)){
              disp.add(dispo);
            }
        }
        return disp;
    }
    

    private void ponerIdMedico() {
        String idMedic = this.medi.pasarIdMedico();
        this.jLabel1.setText(idMedic);
    }

    ////////////////////TABLA/////////////////
    private void modelaTablaC0() {

        //this.jTable1.setModel(this.modelo);
        this.modelo = new DefaultTableModel() {
            @Override
            public Class getColumnClass(int c) {
                return getValueAt(0, c).getClass();
            }
        };
        //..............................................................................
        jTable1.setModel(modelo);

        String[] titulos = {"Dia", "Desde", "Hasta"};
        this.modelo.setDataVector(null, titulos);

        //Poner un combobox en la columna 2
        TableColumn columna = null;
        columna = jTable1.getColumnModel().getColumn(0);

        columna.setMinWidth(92);
        columna.setMaxWidth(92);

        DefaultTableCellHeaderRenderer renderer = new DefaultTableCellHeaderRenderer();
        renderer.setToolTipText("Click para desplegar");
        columna.setCellRenderer(renderer);
        JComboBox comboBox = new JComboBox();
        comboBox.addItem("Lunes");
        comboBox.addItem("Martes");
        comboBox.addItem("Miercoles");
        comboBox.addItem("Jueves");
        comboBox.addItem("Viernes");

        comboBox.setSelectedIndex(0);
        this.dia=(String)comboBox.getSelectedItem();
        columna.setCellEditor(new DefaultCellEditor(comboBox));

    }
   
    private void modelaTablaC1() {

        //Poner un combobox en la columna 2
        TableColumn columna = null;
        columna = jTable1.getColumnModel().getColumn(1);

        columna.setMinWidth(92);
        columna.setMaxWidth(92);

        DefaultTableCellHeaderRenderer renderer = new DefaultTableCellHeaderRenderer();
        renderer.setToolTipText("Click para desplegar");
        columna.setCellRenderer(renderer);
        JComboBox comboBox = new JComboBox();
        comboBox.addItem("07:00");
        comboBox.addItem("08:00");
        comboBox.addItem("09:00");
        comboBox.addItem("10:00");
        comboBox.addItem("11:00");
        comboBox.addItem("12:00");
        comboBox.addItem("13:00");
        comboBox.addItem("14:00");
        comboBox.addItem("15:00");
        comboBox.addItem("16:00");
        comboBox.addItem("17:00");
        comboBox.addItem("18:00");

        comboBox.setSelectedIndex(0);
        columna.setCellEditor(new DefaultCellEditor(comboBox));

    }

    private void modelaTablaC2() {

        //Poner un combobox en la columna 2
        TableColumn columna = null;
        columna = jTable1.getColumnModel().getColumn(2);

        columna.setMinWidth(92);
        columna.setMaxWidth(92);

        DefaultTableCellHeaderRenderer renderer = new DefaultTableCellHeaderRenderer();
        renderer.setToolTipText("Click para desplegar");
        columna.setCellRenderer(renderer);
        JComboBox comboBox = new JComboBox();
        comboBox.addItem("07:00");
        comboBox.addItem("08:00");
        comboBox.addItem("09:00");
        comboBox.addItem("10:00");
        comboBox.addItem("11:00");
        comboBox.addItem("12:00");
        comboBox.addItem("13:00");
        comboBox.addItem("14:00");
        comboBox.addItem("15:00");
        comboBox.addItem("16:00");
        comboBox.addItem("17:00");
        comboBox.addItem("18:00");

        comboBox.setSelectedIndex(0);
        columna.setCellEditor(new DefaultCellEditor(comboBox));

    }

    
    private void eliminarFila() {
        int fila = this.jTable1.getSelectedRow();

        if (fila >= 0) {
            this.modelo.removeRow(fila);
            JOptionPane.showMessageDialog(null, "Operacion exitosa");
            //this.hacer();
        } else {
            JOptionPane.showMessageDialog(null, "debe seleccionar fila");
        }
    }
    private void cargaVacia() {
        Object[] datos = {"", "", ""};
        modelo.addRow(datos);

    }
    private void hacer(){
        TableColumn columna = null;
        String idMedico,dia, desde, hasta;
        //columna = jTable1.getColumnModel().getColumn(0);
        
        DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
        //String dato=String.valueOf(tm.getValueAt(jTable1.getSelectedRow(),0));
        //System.err.println(""+dato);
        
        
        idMedico=this.jLabel1.getText();
        //System.err.println(""+idMedico);
        
        dia=String.valueOf(tm.getValueAt(jTable1.getSelectedRow(),0));
        //System.out.println(""+dia);
        
        desde=String.valueOf(tm.getValueAt(jTable1.getSelectedRow(),1));
        //System.out.println(""+desde);
        
        hasta=String.valueOf(tm.getValueAt(jTable1.getSelectedRow(),2));
        //System.out.println(""+hasta);
        
        Disponibilidad dispo = new Disponibilidad(idMedico,dia,desde,hasta);
        this.GestDis.crearDisponibilidad(dispo);
        
    }
    private void cargarDatos(Disponibilidad dispo){
        Vector<String> fila = new Vector();
        fila.add(dispo.getDia());
        fila.add(dispo.getHora1());
        fila.add(dispo.getHora2());
        this.modelo.addRow(fila);
    }
    
    private void filtrarIdMedico(){
        String filtrador,comparador;
        
        filtrador = this.jLabel1.getText();
        ArrayList<Disponibilidad> disponibles = this.GestDis.getTodos();
        System.out.print(""+disponibles);
        for(Disponibilidad dispo : disponibles){
            comparador= dispo.getIdmedico();
            if(comparador.equals(filtrador)){
                this.cargarDatos(dispo);
            }
        }
    }

    //ACCIONES
    //=================================================================================
    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == this.jButton1) {
            this.cargaVacia();
        }
        if (evento.getSource() == this.jButton2) {
            this.eliminarFila();
        }

        if (evento.getSource() == this.jButton3) {
            this.setVisible(false);
            this.medi.setVisible(true);
        }

        if (evento.getSource() == this.jButton4) {
            this.hacer();
        }

    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == this.jTable1) {
            int fila = this.jTable1.getSelectedRow();

            if (fila >= 0) {
                String dato = (String) this.jTable1.getValueAt(fila, 0);
                JOptionPane.showMessageDialog(null, "El codigo del alumno es: " + dato);
            }
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

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
