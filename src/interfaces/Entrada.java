/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;



public class Entrada extends javax.swing.JFrame implements ActionListener {

    
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Entrada");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("Salir");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("COMPROMETIDOS CONTIGO");

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                        .addContainerGap(28, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(57, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)))
                .addComponent(jButton3)
                .addGap(19, 19, 19))
        );

        jMenu1.setText("Operaciones");

        jMenuItem1.setText("Especialidades");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Medicos");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Pacientes");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Citas");
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Consultorio");
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Me voy");

        jMenuItem6.setText("Salir");
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

//variables de clase
    private String rutaFotos;
    private Timer timer;
    private int Posicion;
    private String fotos[] = {"family1.jpg", "family2.jpg", "family3.jpg"};
    
    //metodos
    public static void main(String args[]) {
        new Entrada();
    }
    
    public Entrada() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.poneraEscuchar();
        
        this.Posicion = 0;
        this.timer = new Timer();
        this.rutaFotos = "./fotos/";
        this.PonerImagenes();
    }

    private void PonerImagenes(){
    
        //Imagen fija
        Toolkit tk=Toolkit.getDefaultToolkit();
        Image imagen = tk.createImage(this.rutaFotos + "family0.jpg");
        ImageIcon imag = new ImageIcon(imagen.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_AREA_AVERAGING));
        this.jLabel1.setIcon(imag);
        
        //Le asignamos la tarea de cambiar imagenes al timer
        this.timer.schedule(new Entrada.RemindTask (),0,3000);
    
    }
    
    
    private void poneraEscuchar(){
    
        this.jButton3.addActionListener(this);
        
        this.jMenuItem1.addActionListener(this);
        this.jMenuItem2.addActionListener(this);
        this.jMenuItem3.addActionListener(this);
        this.jMenuItem4.addActionListener(this);
        this.jMenuItem5.addActionListener(this);
        this.jMenuItem6.addActionListener(this);
    }
    
    private void limpiador(){
        
    }
   
    
    
    //ACCIONES
    //=================================================================================
    @Override
    public void actionPerformed(ActionEvent evento) {
        
        if(evento.getSource()==this.jButton3){
        System.exit(0);
        }
        
        if (evento.getSource() == this.jMenuItem1) {
             this.setVisible(false);
             FrameEspecialidad espe = new FrameEspecialidad(this);
        }
        if (evento.getSource() == this.jMenuItem2) {
             this.setVisible(false);
             FrameMedico medic = new FrameMedico(this);
        }
        if (evento.getSource() == this.jMenuItem3) {
             this.setVisible(false);
             FramePacientes pacien = new FramePacientes(this);
        }
        if (evento.getSource() == this.jMenuItem4) {
             this.setVisible(false);
             FrameCitas cit = new FrameCitas(this);
        }
        if (evento.getSource() == this.jMenuItem5) {
             this.setVisible(false);
             FrameConsultorio consu = new FrameConsultorio(this);
        }
    }
    
    class RemindTask extends TimerTask
  {
   public void run()
    {
       jLabel3.setIcon(new ImageIcon(rutaFotos+fotos[Posicion]));
       Posicion++;
       if (Posicion==3)
           Posicion=0;
    }
  }

    
    

}
