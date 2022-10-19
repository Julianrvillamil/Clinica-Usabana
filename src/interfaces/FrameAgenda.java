/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

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
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import modelo.*;
import controlador.*;
import javax.swing.table.DefaultTableModel;


public class FrameAgenda extends javax.swing.JFrame implements ActionListener, ItemListener, MouseListener, KeyListener {

    
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("Regresar");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Filtrar por Fecha:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Fecha", "Dia", "Hora", "Paciente"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

//variables de clase
    private GestionCita GestCit;
    private GestionMedicos GestMed;
    private FrameMedico medi;
    private GestionPaciente GestPas;
    
    
    private DefaultTableModel modelo;
    //metodos
  //FrameMedico medi;
    
    public FrameAgenda(FrameMedico medi) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.poneraEscuchar();
        
        this.modelo = new DefaultTableModel();
        
        this.GestCit = new GestionCita();
        this.GestMed = new GestionMedicos();
        this.GestPas = new GestionPaciente();
        this.medi = medi;
        
        
        //this.ponerIdMedico();
        this.llenarCombo();
        this.modelarTabla();
    }

    
    private void poneraEscuchar(){
    
        
        this.jButton3.addActionListener(this);
    }
    
    private void limpiador(){
        
    }
    
    private String elIdMedico() {
        String idMedic = this.medi.pasarIdMedico();
        //this.jLabel1.setText(idMedic);
        return idMedic;
    }
    
    
    ///////////////TABLA/////////////
    
    private void llenarCombo() {

        this.jComboBox1.addItem("TODOS");
        ArrayList<Cita> citas = this.GestCit.filtrarMedicos(elIdMedico());
        for (Cita cit : citas) {
            this.jComboBox1.addItem(cit.getFecha());
        }
    }

    private void modelarTabla() {

        this.jTable1.setModel(this.modelo);

        String[] titulos = {"Fecha", "Dia", "Hora", "Paciente"};
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

    private void agregaFila(Cita cit) {
        //System.err.println(""+medi);
        //JOptionPane.showMessageDialog(null, "**************");

        String codigoMedico;
        String idPaci = cit.getIdPaciente();
        String namePaci = this.GestPas.buscarNamePaci(idPaci);
        Vector<String> fila = new Vector();
        fila.add(cit.getFecha());
        //System.err.println(""+cit.getFecha());
        fila.add(cit.getDia());
        fila.add(cit.getHora());
        fila.add(namePaci);
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

    private void filtrarTabla() {

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
        //JOptionPane.showMessageDialog(null, "**************");
        ArrayList<Cita> cit = this.GestCit.filtrarMedicos(this.elIdMedico());
        for (Cita cita : cit) {
            this.agregaFila(cita);
        }
    }
    
    
    
    
    
   
    
    
    //ACCIONES
    //=================================================================================
    @Override
    public void actionPerformed(ActionEvent evento) {
        
        if(evento.getSource()==this.jButton3){
        this.setVisible(false);
        this.medi.setVisible(true);
        }
    
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    

}
