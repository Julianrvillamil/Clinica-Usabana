/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import controlador.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import modelo.*;


public class FrameConsultorio extends javax.swing.JFrame implements ActionListener, ItemListener, MouseListener, KeyListener {


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consultorio");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("Regresar");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Identificación");

        jLabel2.setText("Clave");

        jButton1.setText("Ingresar");

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jPasswordField1)))
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(24, 24, 24))
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
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

//variables de clase
    //metodos
    Entrada entry;
    GestionMedicos GestMed;
    GestionCita GestCit;
    GestionPaciente GestPaci;
    private DefaultTableModel modelo;

    public FrameConsultorio(Entrada entry) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.poneraEscuchar();

        this.modelo = new DefaultTableModel();
        this.GestMed = new GestionMedicos();
        this.GestCit = new GestionCita();
        this.GestPaci = new GestionPaciente();
        this.entry = entry;

        this.llenarComboMedi();
        this.modelarTabla();
    }

    private void poneraEscuchar() {

        this.jButton1.addActionListener(this);
        this.jButton3.addActionListener(this);
        this.jTable1.addMouseListener(this);
        
        this.jTextField1.addKeyListener(this);
        //this.jPasswordField1.addKeyListener(this);
    }

    private void llenarComboMedi() {

        ArrayList<Medico> medicos = this.GestMed.getMedicos();
        this.jComboBox1.addItem("Elija un Medico");
        for (Medico medi : medicos) {
            this.jComboBox1.addItem(medi.getNombres());
        }
    }

    private void validador() {
        String nameMed;

        nameMed = (String) this.jComboBox1.getSelectedItem();
        Medico med = this.GestMed.buscarIdMedico(nameMed);

        if (med.getIdmed().equals(this.jTextField1.getText())) {
            if (med.getPassword().equals(this.jPasswordField1.getText())) {
                //JOptionPane.showMessageDialog(null, "Entro");
                this.verTodos();
                this.limpiarTabla();
                this.verTodos();
            }
        } else {
            JOptionPane.showMessageDialog(null, "El id o contraseña incorrectos ");
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

        String[] titulos = {"ID Citas", "Fecha", "Dia", "Hora", "Paciente"};
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

        String nombreMedi, idMedi;
        nombreMedi = (String) this.jComboBox1.getSelectedItem();
        idMedi = this.GestMed.buscarIdentifiMed(nombreMedi);
        ArrayList<Cita> cit = this.GestCit.filtrarMedicos(idMedi);
        //JOptionPane.showMessageDialog(null, "**************"+idMedi);
        for (Cita cita : cit) {

            this.agregaFila(cita);

        }
    }

    private void agregaFila(Cita cit) {
        //System.err.println(""+medi);
        //JOptionPane.showMessageDialog(null, "**************");

        String codigoMedico;
        String idPaci = cit.getIdPaciente();
        String namePaci = this.GestPaci.buscarNamePaci(idPaci);
        Vector<String> fila = new Vector();
        fila.add(cit.getIdCita());
        fila.add(cit.getFecha());
        //System.err.println(""+cit.getFecha());
        fila.add(cit.getDia());
        fila.add(cit.getHora());
        fila.add(namePaci);
        codigoMedico = cit.getIdMedico();
        //System.err.println(""+codigoMedico);
        Medico medi = this.GestMed.buscarMedico(codigoMedico);
        System.err.println("" + medi);
        if (medi != null) {
            fila.add(medi.getIdmed());
            this.modelo.addRow(fila);
            TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(this.modelo);
            this.jTable1.setRowSorter(elQueOrdena);
        } else {
        }
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
    
    public String pasarNombre(){
    int fila = this.jTable1.getSelectedRow();
    String namePaci = (String) this.jTable1.getValueAt(fila, 4);
    //JOptionPane.showMessageDialog(null , namePaci);
    //String namePaci=this.GestPaci.buscarNamePaci(id);
    return namePaci;
    
    }
    public String pasarDoc(){
        String nomDoc = (String)this.jComboBox1.getSelectedItem();
        return nomDoc;
    }
   

    //ACCIONES
    //=================================================================================
    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == this.jButton3) {
            this.setVisible(false);
            this.entry.setVisible(true);
        }
        if (evento.getSource() == this.jButton1) {
            this.validador();
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
        if (e.getSource() == this.jTable1) {
            int fila = this.jTable1.getSelectedRow();

            if (fila >= 0) {
                String dato = (String) this.jTable1.getValueAt(fila, 0);
                 this.setVisible(false);
                FrameAtencionPaciente atencion = new FrameAtencionPaciente(this);
                
                //JOptionPane.showMessageDialog(null, "El codigo del alumno es: " + dato);
            
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
    }

    @Override
    public void keyPressed(KeyEvent e) {
    
    }

    @Override
    public void keyReleased(KeyEvent e) {
    
    }

}
