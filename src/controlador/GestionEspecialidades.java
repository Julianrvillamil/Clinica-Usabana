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


public class GestionEspecialidades {

    private String ruta;

    public GestionEspecialidades() {
        this.ruta = "./Archivos/misEspecialidades.txt";
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

    public void guardaEspecialidad(Especialidad espe) {
        //guardar al estudiante en el archivo....
        File file;
        FileWriter fr;
        PrintWriter pw;

        try {
            file = new File(this.ruta);
            fr = new FileWriter(file, true);
            pw = new PrintWriter(fr);
            pw.println(espe);
            pw.close();
            JOptionPane.showMessageDialog(null, "Operación exitosa..!!");
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo guardando en el archivo..!!");
            //System.exit(1);
        }
    }

    /* public void modificarEspecialidad(Especialidad espe) {
        boolean existe = false;
        ArrayList<Especialidad> todos = this.getTodos();
        for (Especialidad xxx : todos) {

            if (xxx.getEspecialidad().equals(espe.getEspecialidad())) {
                JOptionPane.showMessageDialog(null, "Esa especialidad ya existe...!!");
            } else {
                xxx.setEspecialidad(espe.getEspecialidad());
                this.remplazArchivo(todos);
                JOptionPane.showMessageDialog(null, "La especialidad fue modificada");
                existe = true;
            }

        }
        if (existe == false) {
            JOptionPane.showMessageDialog(null, "Esa especialidad NO existe..!!");
        }
    }*/
    public String hacerID(String idEspecialidad) {
        String id = "";
        int num = (int) Math.floor(Math.random() * (99 - 10) + 10);
        if(idEspecialidad.length()>2){
        id = "" + idEspecialidad.charAt(0) + idEspecialidad.charAt(1) + idEspecialidad.charAt(2) + num;
        }else{JOptionPane.showMessageDialog(null, "La especialidad debe tener por lo menos 3 letras");
        }
        return id;
        
    }

    public void crearEspecialid(Especialidad especialidad) {

        ArrayList<Especialidad> todos = this.getTodos();
        boolean validacion = this.existeEspecialidad(especialidad.getEspecialidad());

        if (especialidad.getEspecialidad().length() == 0) {
            JOptionPane.showMessageDialog(null, "No escribio ninguna especialidad");
        } else {
            if (validacion == true) {
                JOptionPane.showMessageDialog(null, "Esa especialidad ya existe...!!");
            } else {
                //int num = (int) Math.floor(Math.random() * (99 - 10) + 10);
                //String idespecialidad = "" + especialidad.charAt(0) + especialidad.charAt(1) + especialidad.charAt(2) + num;
                Especialidad espe = new Especialidad(especialidad.getEspecialidad(), especialidad.getIdEspecialidad());
                this.guardaEspecialidad(espe);

            }
        }
    }

    public void modificarEspecialidad(Especialidad especialidad, String viejaEspe) {

        ArrayList<Especialidad> todos = this.getTodos();
        //boolean validacion = this.existeEspecialidad(especialidad.getEspecialidad());
        boolean existe = false;
        for (Especialidad xxx : todos) {
            if (!(xxx.getEspecialidad().equals(especialidad.getEspecialidad()))) {
                if (xxx.getEspecialidad().equals(viejaEspe)) {

                    xxx.setEspecialidad(especialidad.getEspecialidad());
                    xxx.setIdEspecialidad(especialidad.getIdEspecialidad());
                    this.remplazArchivo(todos);
                    JOptionPane.showMessageDialog(null, "La especialidad fue modificada");
                    JOptionPane.showMessageDialog(null, "Solo deberia entrar 1 vez"+xxx);
                    existe = true;
                }
            }
        }
        if (existe = false) {
            JOptionPane.showMessageDialog(null, "Esa especialidad ya existe..!!");
        }

    }

    /* private boolean existeViejaEspe(String viejaEspe) {
        ArrayList<Especialidad> todos = this.getTodos();
        boolean existe = false;
        for (Especialidad xxx : todos) {
            if (xxx.getEspecialidad().equals(viejaEspe)) {
                existe=true;
            }
        }

        return existe;
    }*/

 /*public boolean verificarViejaEspe(String viejaEspe) {

        ArrayList<Especialidad> todos = this.getTodos();
        boolean existe = false;

        for (Especialidad xxx : todos) {
            if (xxx.getEspecialidad().equals(viejaEspe)) {
                existe = true;    
            }
        }
        return existe;
    }*/
    public void borrarEspecialidad(String espe) {

        int confirmacion = 0;
        boolean existe = false;
        ArrayList<Especialidad> todos = this.getTodos();

        for (Especialidad xxx : todos) {
            if (xxx.getEspecialidad().equals(espe)) {
                confirmacion = JOptionPane.showConfirmDialog(null, "Esta segur@?");
                if (confirmacion == 0) {
                    todos.remove(xxx);
                    this.remplazArchivo(todos);
                    existe = true;
                    JOptionPane.showMessageDialog(null, "Operacion exitosa..!!");
                    break;
                }
            }

        }
        if (existe = false) {
            JOptionPane.showMessageDialog(null, "Esa especialidad NO existe..!!");
        }

    }

    /*public void modificarEspecialidad(Especialidad nueva) {
        //String code, newdato;
        boolean existe = false;
        ArrayList<Especialidad> todos = this.getTodos();

        for (Especialidad xxx : todos) {
            if (xxx.getEspecialidad().equals(nueva.getEspecialidad())) {
                if (this.existeEspecialidad(nueva.getEspecialidad()) == true) {
                    JOptionPane.showMessageDialog(null, "Esa especialidad ya existe...!!");
                } else {
                    xxx.setEspecialidad(nueva.getEspecialidad());
                    xxx.setIdEspecialidad(nueva.getIdEspecialidad());
                    this.remplazArchivo(todos);
                    JOptionPane.showMessageDialog(null, "La especialidad fue modificada");
                    existe = true;
                }
            }
        }
        if (existe == false) {
            JOptionPane.showMessageDialog(null, "Esa especialidad NO existe..!!");
        }
    }*/

 /*public void modificarEspecialidad(String ViejaEspecialidad, String NuevaEspecialidad) {
        String code, newdato;
        boolean existe = false;
        ArrayList<Especialidad> todos = this.getTodos();

        for (Especialidad xxx : todos) {
            if (xxx.getEspecialidad().equals(ViejaEspecialidad)) {
                if (this.existeEspecialidad(NuevaEspecialidad) == true) {
                    JOptionPane.showMessageDialog(null, "Esa especialidad ya existe...!!");
                } else {
                    xxx.setEspecialidad(NuevaEspecialidad);
                    this.remplazArchivo(todos);
                    JOptionPane.showMessageDialog(null, "La especialidad fue modificada");
                    existe = true;
                }
            }
        }
        if (existe == false) {
            JOptionPane.showMessageDialog(null, "Esa especialidad NO existe..!!");
        }
    }*/
 /*public void borrarEspecialidad(String ViejaEspecialidad) {

        int confirmacion = 0;
        boolean existe = false;
        ArrayList<Especialidad> todos = this.getTodos();

        for (Especialidad xxx : todos) {
            if (xxx.getEspecialidad().equals(ViejaEspecialidad)) {
                confirmacion = JOptionPane.showConfirmDialog(null, "Esta segur@?");
                if (confirmacion == 0) {
                    todos.remove(xxx);
                    this.remplazArchivo(todos);
                    existe = true;
                    JOptionPane.showMessageDialog(null, "Operacion exitosa..!!");
                    break;
                }
            }

        }
        if (existe = false) {
            JOptionPane.showMessageDialog(null, "Esa especialidad NO existe..!!");
        }

    }*/

 /*private void guardaEspecialidad(Especialidad laEspecialidad) {
        try {
            File file = new File(this.ruta);
            FileWriter fr = new FileWriter(file, true);
            PrintWriter ps = new PrintWriter(fr);
            ps.println(laEspecialidad);
            ps.close();
            JOptionPane.showMessageDialog(null, "La especialidad ha sido guardado en la base");
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Error...La especialidad no fue guardado");
        }

    }*/
    public ArrayList<Especialidad> getTodos() {
        ArrayList<Especialidad> todos = new ArrayList();
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
                Especialidad produ = new Especialidad(campo[0], campo[1]);
                //lo guarda en el contenedor
                todos.add(produ);
            }

        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Error...buscando especialidad");
        }
        return todos;
    }

    public boolean existeEspecialidad(String especialidad) {
        boolean existeEsp = false;
        ArrayList<Especialidad> todos = this.getTodos();
        for (Especialidad xxx : todos) {
            if (xxx.getEspecialidad().equals(especialidad)) {

                existeEsp = true;
            }

        }
        return existeEsp;
    }

    private void remplazArchivo(ArrayList<Especialidad> espe) {
        try {
            File file = new File(this.ruta);
            FileWriter fr = new FileWriter(file, false);
            PrintWriter ps = new PrintWriter(fr);
            for (Especialidad xxx : espe) {
                ps.println(xxx);
            }
            ps.close();

        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Error...La especialidad no fue guardada guardada");
        }

    }

    public Especialidad buscarEspecialidades(String IdEspe) {
        //System.out.println("" + IdEspe);
        Especialidad especi = null;
        ArrayList<Especialidad> todos = this.getTodos();
        for (Especialidad xxx : todos) {
            if (xxx.getIdEspecialidad().equals(IdEspe)) {
                especi = new Especialidad(xxx.getEspecialidad(), xxx.getIdEspecialidad());
            }
        }
        if (especi == null) {
            JOptionPane.showMessageDialog(null, "No haynada igual");
        }
        return especi;
    }

    /* public Especialidad buscarEspecialidades(String viejaEspe) {
        FileReader fr;
        BufferedReader br;
        Especialidad espe = null;
        String registro;
        try {
            fr = new FileReader(this.ruta);
            br = new BufferedReader(fr);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split(",");
                if ((campos[0].equals(viejaEspe))) {
                    espe = new Especialidad(campos[0], campos[1]);
                    break;
                }
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
        }

        return espe;
    }*/
    public boolean pruebaExistencia(String nuevaEspe) {

        boolean existe = false;
        ArrayList<Especialidad> todos = this.getTodos();

        for (Especialidad xxx : todos) {
            if (xxx.getEspecialidad().equals(nuevaEspe)) {
                existe = true;
            }
        }
        return existe;
        /*boolean yaEsta = false;
        FileReader file;
        BufferedReader br;
        String registro;

        try {
            file = new FileReader(this.ruta);
            br = new BufferedReader(file);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split(",");
                if ((campos[0].equals(codigo))) {
                    yaEsta = true;
                    break;
                }
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
            //System.exit(1);
        }
        return yaEsta;*/
    }

    public String buscarIdEspecialidad(String nombreEspecialidad) {
        String especialidad = null;
        FileReader fr;
        BufferedReader br;
        String registro;

        try {
            fr = new FileReader(this.ruta);
            br = new BufferedReader(fr);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split(",");
                if ((campos[0].equals(nombreEspecialidad))) {
                    especialidad = campos[1];
                    break;
                }
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
        }

        return especialidad;
    }

}
