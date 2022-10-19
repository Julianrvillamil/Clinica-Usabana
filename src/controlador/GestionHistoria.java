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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.*;


public class GestionHistoria {

    private String ruta;

    public GestionHistoria() {
        this.ruta = "./Archivos/misHistorias.txt";
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

    public void guardaHistoria(Historia hist) {
        //guardar al estudiante en el archivo....
        File file;
        FileWriter fr;
        PrintWriter pw;

        try {
            file = new File(this.ruta);
            fr = new FileWriter(file, true);
            pw = new PrintWriter(fr);
            pw.println(hist);
            pw.close();
            JOptionPane.showMessageDialog(null, "Operación exitosa..!!");
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo guardando en el archivo..!!");
            //System.exit(1);
        }
    }

    public void crearHistoria(Historia hist) {

        ArrayList<Historia> todos = this.getTodos();
        Historia historia = new Historia(hist.getIdPaciente(), hist.getIdCita(), hist.getDiagnostico(), hist.getPrescripcion(), hist.getExamenes(), hist.isAtendido());
        this.guardaHistoria(historia);

    }

    public ArrayList<Historia> getTodos() {
        ArrayList<Historia> todos = new ArrayList();
        FileReader file;
        BufferedReader br;
        String registro;
        try {
            file = new FileReader(this.ruta);
            br = new BufferedReader(file);
            while ((registro = br.readLine()) != null) {
                //rompre el registro
                String campo[] = registro.split(",");
                //crea el producto
                Historia hist = new Historia(campo[0], campo[1], campo[2], campo[3], campo[4],  Boolean.parseBoolean(campo[5]));
                //lo guarda en el contenedor
                todos.add(hist);
            }

        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Error...buscando cita");
        }
        return todos;
    }

    public ArrayList<Cita> filtrarMedicos(String idMedico) {
        ArrayList<Cita> todos = new ArrayList();
        FileReader file;
        BufferedReader br;
        String registro;
        try {
            file = new FileReader(this.ruta);
            br = new BufferedReader(file);
            while ((registro = br.readLine()) != null) {
                //rompre el registro
                String campo[] = registro.split(",");
                //crea el producto
                if (campo[1].equals(idMedico)) {
                    Cita cit = new Cita(campo[0], campo[1], campo[2], campo[3], campo[4], campo[5]);
                    //lo guarda en el contenedor
                    todos.add(cit);
                }
            }

        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Error...buscando cita");
        }
        return todos;
    }

    public ArrayList<Cita> filtrarPacientes(String idPaciente) {
        ArrayList<Cita> todos = new ArrayList();
        FileReader file;
        BufferedReader br;
        String registro;
        try {
            file = new FileReader(this.ruta);
            br = new BufferedReader(file);
            while ((registro = br.readLine()) != null) {
                //rompre el registro
                String campo[] = registro.split(",");
                //crea el producto
                //JOptionPane.showMessageDialog(null, "*-*-*-*-*"+idPaciente);
                if (campo[2].equals(idPaciente)) {
                    
                    Cita cit = new Cita(campo[0], campo[1], campo[2], campo[3], campo[4], campo[5]);
                    //lo guarda en el contenedor
                    todos.add(cit);
                }
            }

        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Error...buscando cita");
        }
        return todos;
    }
    
    public Historia buscarHistoria(String idPaci){
        FileReader fr;
        BufferedReader br;
        Historia histo = null;
        String registro;
        try {
            fr = new FileReader(this.ruta);
            br = new BufferedReader(fr);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split(",");
                if ((campos[0].equals(idPaci))) {
                    histo = new Historia(campos[0], campos[1], campos[2], campos[3], campos[4],  Boolean.parseBoolean(campos[5]));
                    break;
                }
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
            //System.exit(1);
        }

        return histo;
    
    }

   /* public void borrarEspecialidad(String espe) {

        int confirmacion = 0;
        boolean existe = false;
        ArrayList<Cita> todos = this.getTodos();

        for (Cita xxx : todos) {
            //if (xxx.getEspecialidad().equals(espe)) {
            confirmacion = JOptionPane.showConfirmDialog(null, "Esta segur@?");
            if (confirmacion == 0) {
                todos.remove(xxx);
                this.remplazArchivo(todos);
                existe = true;
                JOptionPane.showMessageDialog(null, "Operacion exitosa..!!");
                break;
            }
            //}

        }
        if (existe = false) {
            JOptionPane.showMessageDialog(null, "Esa especialidad NO existe..!!");
        }

    }

    private void remplazArchivo(ArrayList<Cita> cit) {
        try {
            File file = new File(this.ruta);
            FileWriter fr = new FileWriter(file, false);
            PrintWriter ps = new PrintWriter(fr);
            for (Cita xxx : cit) {
                ps.println(xxx);
            }
            ps.close();

        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Error...La cita no fue guardada guardada");
        }

    }
    
    public String getIdCita( String idPaci){
    
        ArrayList<Cita> todos = new ArrayList();
        FileReader file;
        BufferedReader br;
        String registro;
        String idCita="";
        try {
            file = new FileReader(this.ruta);
            br = new BufferedReader(file);
            while ((registro = br.readLine()) != null) {
                //rompre el registro
                String campo[] = registro.split(",");
                //crea el producto
                //JOptionPane.showMessageDialog(null, "*-*-*-*-*"+idPaciente);
                if (campo[2].equals(idPaci)) {
                    idCita=campo[0];
                }
            }

        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Error...buscando cita");
        }
        return idCita;
    
    }
*/
}
