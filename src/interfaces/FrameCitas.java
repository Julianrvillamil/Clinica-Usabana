/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import controlador.GestionMedicos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.*;
import controlador.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DateFormat;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class FrameCitas extends javax.swing.JFrame implements ActionListener, ItemListener, MouseListener, KeyListener {


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Citas");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("Regresar");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("ID Paciente:");

        jLabel2.setText("Programacion de cita: ");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Citas", "Fecha", "Dia", "Hora", "Paciente"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Guardar");

        jButton4.setText("Modificar");

        jButton5.setText("Eliminar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(27, 27, 27))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton3))
                .addContainerGap(19, Short.MAX_VALUE))
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
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox8;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

//variables de clase
    //metodos
    private FrameGestionDispM dispo;
    private GestionDispoM GestDispM;
    private GestionMedicos GestMed;
    private GestionPaciente GestPaci;
    private GestionCita GestCit;
    private DefaultTableModel modelo;
    private DateFormat df;

    public FrameCitas(Entrada entry) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.poneraEscuchar();

        this.modelo = new DefaultTableModel();

        this.GestMed = new GestionMedicos();
        this.GestPaci = new GestionPaciente();
        this.GestDispM = new GestionDispoM();
        this.GestCit = new GestionCita();
        this.df = DateFormat.getDateInstance();
        this.llenaComboDoc();
        this.llenaComboPaci();
        this.modelarTabla();
        //this.llenarComboDia();
    }

    private String EncuentraIdMedico() {
        String mediName, mediId;

        mediName = (String) this.jComboBox1.getSelectedItem();
        Medico medi = this.GestMed.buscarIdMedico(mediName);
        return medi.getIdmed();

    }

    private ArrayList<String> horasDispo(String idMedi) {
        ArrayList<Disponibilidad> disponibles = this.GestDispM.buscarHora(this.EncuentraIdMedico(), (String) this.jComboBox2.getSelectedItem());
        ArrayList<String> horas = new ArrayList();

        Disponibilidad disponi = null;

        return horas;

    }

    private void llenaComboPaci() {
        ArrayList<Paciente> pacientes = this.GestPaci.getPacientes();
        this.jComboBox3.addItem("Elija un ID paciente");
        for (Paciente paci : pacientes) {
            this.jComboBox3.addItem(paci.getIdPaciente());
        }
    }

    private void llenarComboDia() {
        ArrayList<Disponibilidad> disponibles = this.GestDispM.buscarDia(this.EncuentraIdMedico());
        this.jComboBox2.addItem("Elija un ID paciente");
        //System.err.println("*"+this.GestDispM.buscarDia(this.EncuentraIdMedico()));
        for (Disponibilidad dispony : disponibles) {
            //System.err.println("*"+dispony.getDia());
            this.jComboBox2.addItem(dispony.getDia());
        }

    }

    private void llenarComboHora() {

        ArrayList<Disponibilidad> disponibles = this.GestDispM.buscarHora(this.EncuentraIdMedico(), (String) this.jComboBox2.getSelectedItem());

        this.jComboBox8.addItem("Elija una hora");
        //System.err.println("*"+this.GestDispM.buscarDia(this.EncuentraIdMedico()));
        for (Disponibilidad dispony : disponibles) {

            String hor1 = "" + dispony.getHora1().charAt(0) + dispony.getHora1().charAt(1);
            int hora1 = Integer.parseInt(hor1);
            //System.err.println(""+hora1);
            String hor2 = "" + dispony.getHora2().charAt(0) + dispony.getHora2().charAt(1);
            int hora2 = Integer.parseInt(hor2);
            //System.err.println(""+hora2);
            int deltaHora = hora2 - hora1;
            int[] horas = new int[deltaHora + 1];

            for (int i = 0; i <= deltaHora; i++) {

                horas[i] = hora1++;
                System.err.println("" + horas[i]);
                this.jComboBox8.addItem("" + horas[i] + ":00");
            }

            //System.err.println("*"+dispony.getDia());
        }

    }

    private void borrarComboDia() {
        this.jComboBox2.removeAllItems();
    }

    private void borrarComboHora() {
        this.jComboBox8.removeAllItems();

    }

    private void llenaComboDoc() {

        ArrayList<Medico> medicos = this.GestMed.getMedicos();
        this.jComboBox1.addItem("Elija un Medico");
        for (Medico medi : medicos) {
            this.jComboBox1.addItem(medi.getNombres());
        }
    }

    private void buscarPaciente() {

        String iDPaciente;
        iDPaciente = (String) this.jComboBox3.getSelectedItem();

        Paciente paci = this.GestPaci.buscaPaciente(iDPaciente);
        this.jTextField2.setText(paci.getNombres());
        this.jTextField3.setText(paci.getApellido1() + " " + paci.getApellido2());
    }

    private void poneraEscuchar() {

        this.jButton3.addActionListener(this);

        this.jButton2.addActionListener(this);

        this.jComboBox3.addItemListener(this);
        this.jComboBox1.addItemListener(this);
        this.jComboBox2.addItemListener(this);
        
        this.jTextField2.addKeyListener(this);
        this.jTextField3.addKeyListener(this);
    }

    /////////CRUD////////////
    private void hacer() {

        String idCit, idPaci, idMedi, fecha, dia, hora;
        String nombrePaci, nombreMedi;

        dia = (String) this.jComboBox2.getSelectedItem();
        hora = (String) this.jComboBox8.getSelectedItem();
        nombrePaci = (String) this.jComboBox3.getSelectedItem();
        idPaci = (String) this.jComboBox3.getSelectedItem();
        nombreMedi = (String) this.jComboBox1.getSelectedItem();
        idMedi = this.GestMed.buscarIdentifiMed(nombreMedi);
        fecha = this.df.format(this.jDateChooser1.getDate());

        idCit = "" + fecha + hora + idPaci + idMedi;

        Cita cit = new Cita(idCit, idMedi, idPaci, fecha, dia, hora);
        this.GestCit.crearCita(cit);

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

    //ACCIONES
    //=================================================================================
    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == this.jButton3) {
            this.setVisible(false);
            new Entrada();
        }

        if (evento.getSource() == this.jButton2) {
            this.hacer();
            this.limpiarTabla();
            this.verTodos();
            //this.verDate();
        }

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == jComboBox3) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                int index = this.jComboBox3.getSelectedIndex();
                String item = (String) this.jComboBox3.getSelectedItem();
                if (index > 0) {

                    this.buscarPaciente();

                } else {
                    //this.jButton1.setEnabled(false);
                }
            }
        }
        if (e.getSource() == jComboBox1) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                int index = this.jComboBox1.getSelectedIndex();
                String item = (String) this.jComboBox1.getSelectedItem();
                if (index > 0) {
                    this.borrarComboHora();
                    this.borrarComboDia();
                    this.llenarComboDia();
                    this.limpiarTabla();
                    this.verTodos();
                } else {
                    //this.jButton1.setEnabled(false);
                }
            }
        }
        if (e.getSource() == jComboBox2) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                int index = this.jComboBox2.getSelectedIndex();
                String item = (String) this.jComboBox2.getSelectedItem();
                if (index > 0) {
                    //this.borrarComboDia();
                    this.borrarComboHora();
                    this.llenarComboHora();

                } else {
                    //this.jButton1.setEnabled(false);
                }
            }
        }
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
        char c=e.getKeyChar();
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
            if(!(Character.isLetter(c) || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_SPACE || c == KeyEvent.VK_BACK_SPACE))
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
