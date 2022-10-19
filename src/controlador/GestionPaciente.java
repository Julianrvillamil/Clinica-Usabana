/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import modelo.*;


public class GestionPaciente {

    private String ruta;

    public GestionPaciente() {
        this.ruta = "./Archivos/misPacientes.txt";
        this.verificArchivo();

    }

    private void verificArchivo() {
        File filex;
        try {
            filex = new File(this.ruta);
            if (!filex.exists()) {
                filex.createNewFile();
            }
        } catch (IOException xxx) {
            JOptionPane.showMessageDialog(null, "Falla buscando ruta..!!");
        }
    }
    //todos los metodos CRUD

    public void crearPaciente(Paciente paci) {

        File file;
        FileWriter fr;
        PrintWriter pw;

        try {
            file = new File(this.ruta);
            fr = new FileWriter(file, true);
            pw = new PrintWriter(fr);
            pw.println(paci);
            pw.close();
            JOptionPane.showMessageDialog(null, "Operación exitosa..!!");
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo guardando en el archivo..!!");
            //System.exit(1);
        }
    }

    public void eliminarPaciente(String id) {
        boolean existe = false;
        int res = -1;

        ArrayList<Paciente> pacientes = this.getPacientes();

        for (Paciente paci : pacientes) {
            if (paci.getIdPaciente().equals(id)) {
                res = JOptionPane.showConfirmDialog(null, "Está segur@?", "Ojo...", 0);
                if (res == 0) {
                    pacientes.remove(paci);
                    this.recargaArchivo(pacientes);
                    JOptionPane.showMessageDialog(null, "Operacion exitosa");
                }
                existe = true;
                break;
            }
        }
    }

    public Paciente buscaPaciente(String id) {
        FileReader fr;
        BufferedReader br;
        Paciente paci = null;
        String registro;
        try {
            fr = new FileReader(this.ruta);
            br = new BufferedReader(fr);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split(",");
                if ((campos[0].equals(id))) {
                    paci = new Paciente(campos[0], campos[1], campos[2], campos[3], campos[4], campos[5], campos[6].charAt(0));
                    break;
                }
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
            //System.exit(1);
        }

        return paci;
    }

    public ArrayList<Paciente> getPacientes() {

        FileReader fr;
        BufferedReader br;
        Paciente paci = null;
        String registro;
        ArrayList<Paciente> pacientes = new ArrayList();

        try {
            fr = new FileReader(this.ruta);
            br = new BufferedReader(fr);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split(",");
                paci = new Paciente(campos[0], campos[1], campos[2], campos[3], campos[4], campos[5], campos[6].charAt(0));
                pacientes.add(paci);
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
            //System.exit(1);
        }
        return pacientes;
    }

    public boolean pruebaExistencia(String id) {
        boolean yaEsta = false;
        FileReader file;
        BufferedReader br;
        String registro;

        try {
            file = new FileReader(this.ruta);
            br = new BufferedReader(file);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split(",");
                if ((campos[0].equals(id))) {
                    yaEsta = true;
                    break;
                }
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
            //System.exit(1);
        }
        return yaEsta;
    }

    private void recargaArchivo(ArrayList<Paciente> pacientes) {
        File file;
        FileWriter fr;
        PrintWriter pw;

        try {
            file = new File(this.ruta);
            fr = new FileWriter(file, false);
            pw = new PrintWriter(fr);
            for (Paciente paci : pacientes) {
                pw.println(paci);
            }
            pw.close();
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo guardando en el archivo..!!");
            //System.exit(1);
        }
    }

    public void modifiPaciente(Paciente nuevoPaci) {

        ArrayList<Paciente> pacientes = this.getPacientes();

        for (Paciente xxx : pacientes) {

            if (xxx.getIdPaciente().equals(nuevoPaci.getIdPaciente())) {
                JOptionPane.showMessageDialog(null, "Entro al if de modificarMedico en gestion");
                xxx.setIdPaciente(nuevoPaci.getIdPaciente());
                xxx.setNombres(nuevoPaci.getNombres());
                xxx.setApellido1(nuevoPaci.getApellido1());
                xxx.setApellido2(nuevoPaci.getApellido2());
                xxx.setTelefono(nuevoPaci.getTelefono());
                xxx.setNacimiento(nuevoPaci.getNacimiento());
                xxx.setSexo(nuevoPaci.getSexo());

                System.out.println(""+xxx) ;
                this.recargaArchivo(pacientes);
            }
        }

    }
    
    public String buscarIdPaci(String nombrePaci){
        FileReader fr;
        BufferedReader br;
        Paciente paci = null;
        String registro;
        String idPaciente=null;
        try {
            fr = new FileReader(this.ruta);
            br = new BufferedReader(fr);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split(",");
                if ((campos[1].equals(nombrePaci))) {
                   idPaciente=campos[0];
                    break;
                }
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
            //System.exit(1);
        }

        return idPaciente;
    }
    
    public String buscarNamePaci(String idPaci){
        FileReader fr;
        BufferedReader br;
        Paciente paci = null;
        String registro;
        String idPaciente=null;
        try {
            fr = new FileReader(this.ruta);
            br = new BufferedReader(fr);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split(",");
                if ((campos[0].equals(idPaci))) {
                   idPaciente=campos[1];
                    break;
                }
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
            //System.exit(1);
        }

        return idPaciente;
    }
}
