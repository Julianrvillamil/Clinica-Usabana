
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


public class GestionDispoM {

    private String ruta;

    public GestionDispoM() {
        this.ruta = "./Archivos/misDisponibilidadesM.txt";
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

    public void guardaDisponibilidad(Disponibilidad dispo) {
        //guardar al estudiante en el archivo....
        File file;
        FileWriter fr;
        PrintWriter pw;

        try {
            file = new File(this.ruta);
            fr = new FileWriter(file, true);
            pw = new PrintWriter(fr);
            pw.println(dispo);
            pw.close();
            JOptionPane.showMessageDialog(null, "Operación exitosa..!!");
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo guardando en el archivo..!!");
            //System.exit(1);
        }
    }

    public void crearDisponibilidad(Disponibilidad disponibilidad) {

        ArrayList<Disponibilidad> todos = this.getTodos();
        Disponibilidad dispo = new Disponibilidad(disponibilidad.getIdmedico(), disponibilidad.getDia(), disponibilidad.getHora1(), disponibilidad.getHora2());
        this.guardaDisponibilidad(dispo);

    }

    public ArrayList<Disponibilidad> getTodos() {
        ArrayList<Disponibilidad> todos = new ArrayList();
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
                Disponibilidad dispo = new Disponibilidad(campo[0], campo[1], campo[2], campo[3]);
                //lo guarda en el contenedor
                todos.add(dispo);
            }

        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Error...buscando disponibilidad");
        }
        return todos;
    }

    public ArrayList<Disponibilidad> buscarDia(String IdMedico) {
        ArrayList<Disponibilidad> todos = new ArrayList();
        //Disponibilidad dispo=null;
        FileReader file;
        BufferedReader br;
        String registro;
        try {
            file = new FileReader(this.ruta);
            br = new BufferedReader(file);
            while ((registro = br.readLine()) != null) {
                //rompre el registro
                String campo[] = registro.split(",");

                if ((campo[0].equals(IdMedico))) {
                    //JOptionPane.showMessageDialog(null," Entro!!!");
                    Disponibilidad dispo = new Disponibilidad(campo[0], campo[1], campo[2], campo[3]);

                    todos.add(dispo);
                    //System.err.println("//"+todos);

                }
            }

        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Error...buscando disponibilidad");
        }
        return todos;
    }

    public ArrayList<Disponibilidad> buscarHora(String IdMedico, String Dia) {
        ArrayList<Disponibilidad> todos = new ArrayList();
        //Disponibilidad dispo=null;
        FileReader file;
        BufferedReader br;
        String registro;
        try {
            file = new FileReader(this.ruta);
            br = new BufferedReader(file);
            while ((registro = br.readLine()) != null) {
                //rompre el registro
                String campo[] = registro.split(",");
                if ((campo[0].equals(IdMedico))) {
                    if ((campo[1].equals(Dia))) {
                        //JOptionPane.showMessageDialog(null," Entro!!!");
                        Disponibilidad dispo = new Disponibilidad(campo[0], campo[1], campo[2], campo[3]);

                        todos.add(dispo);
                        //System.err.println("//"+todos);

                    }
                }
            }

        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Error...buscando disponibilidad");
        }
        return todos;
    }

    public void borrarEspecialidad(String espe) {

        int confirmacion = 0;
        boolean existe = false;
        ArrayList<Disponibilidad> todos = this.getTodos();

        for (Disponibilidad xxx : todos) {
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

    private void remplazArchivo(ArrayList<Disponibilidad> dispo) {
        try {
            File file = new File(this.ruta);
            FileWriter fr = new FileWriter(file, false);
            PrintWriter ps = new PrintWriter(fr);
            for (Disponibilidad xxx : dispo) {
                ps.println(xxx);
            }
            ps.close();

        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Error...La disponibilidad no fue guardada guardada");
        }

    }

}
