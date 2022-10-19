
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


public class GestionCita {

    private String ruta;

    public GestionCita() {
        this.ruta = "./Archivos/misCitas.txt";
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

    public void guardaCita(Cita cit) {
        //guardar al estudiante en el archivo....
        File file;
        FileWriter fr;
        PrintWriter pw;

        try {
            file = new File(this.ruta);
            fr = new FileWriter(file, true);
            pw = new PrintWriter(fr);
            pw.println(cit);
            pw.close();
            JOptionPane.showMessageDialog(null, "Operación exitosa..!!");
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo guardando en el archivo..!!");
            //System.exit(1);
        }
    }

    public void crearCita(Cita cita) {

        ArrayList<Cita> todos = this.getTodos();
        Cita cit = new Cita(cita.getIdCita(), cita.getIdMedico(), cita.getIdPaciente(), cita.getFecha(), cita.getDia(), cita.getHora());
        this.guardaCita(cit);

    }

    public ArrayList<Cita> getTodos() {
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
                Cita cit = new Cita(campo[0], campo[1], campo[2], campo[3], campo[4], campo[5]);
                //lo guarda en el contenedor
                todos.add(cit);
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

    public void borrarEspecialidad(String espe) {

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

}
