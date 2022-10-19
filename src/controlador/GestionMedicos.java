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


public class GestionMedicos {

    private String ruta;

    public GestionMedicos() {
        this.ruta = "./Archivos/misMedicos.txt";
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

    public void crearMedico(Medico medi) {

        File file;
        FileWriter fr;
        PrintWriter pw;

        try {
            file = new File(this.ruta);
            fr = new FileWriter(file, true);
            pw = new PrintWriter(fr);
            pw.println(medi);
            pw.close();
            JOptionPane.showMessageDialog(null, "Operación exitosa..!!");
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo guardando en el archivo..!!");
            //System.exit(1);
        }
    }

    /* public void crearMedico(Medico medi) {

        boolean validacion = this.existeIDmedico(medi.getIdmed());
        if (medi.getIdmed().length() == 0) {
            JOptionPane.showMessageDialog(null, "No escribio ningun id");
        } else {
            if (validacion == true) {
                JOptionPane.showMessageDialog(null, "Ese id ya existe...!!");
            } else {
                //int num = (int) Math.floor(Math.random() * (99 - 10) + 10);
                //String idespecialidad = "" + especialidad.charAt(0) + especialidad.charAt(1) + especialidad.charAt(2) + num;

                Medico medic = new Medico(idmed, idespec, nombres, apellido1, apellido2, telefono, foto, password);
                this.guardaMedico(medic);

            }
        }
    }*/
    public void modificarIDmedico(String ViejoID, String NuevoID) {
        String code, newdato;
        boolean existe = false;
        ArrayList<Medico> todos = this.getTodos();

        for (Medico xxx : todos) {
            if (xxx.getIdmed().equals(ViejoID)) {
                if (this.existeIDmedico(NuevoID) == true) {
                    JOptionPane.showMessageDialog(null, "Ese ID ya existe...!!");
                } else {
                    xxx.setIdmed(NuevoID);
                    this.remplazArchivo(todos);
                    JOptionPane.showMessageDialog(null, "El id fue modificado");
                    existe = true;
                }
            }
        }
        if (existe == false) {
            JOptionPane.showMessageDialog(null, "Ese id NO existe..!!");
        }
    }

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
            
        }if (existe=false) {
                JOptionPane.showMessageDialog(null, "Esa especialidad NO existe..!!");
            }

    }*/
    private void guardaMedico(Medico elMedico) {
        try {
            File file = new File(this.ruta);
            FileWriter fr = new FileWriter(file, true);
            PrintWriter ps = new PrintWriter(fr);
            ps.println(elMedico);
            ps.close();
            JOptionPane.showMessageDialog(null, "La especialidad ha sido guardado en la base");
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Error...La especialidad no fue guardado");
        }

    }

    public ArrayList<Medico> getTodos() {
        ArrayList<Medico> todos = new ArrayList();
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
                Medico produ = new Medico(campo[0], campo[1], campo[2], campo[3], campo[4], campo[5], campo[6], campo[7]);
                //lo guarda en el contenedor
                todos.add(produ);
            }

        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Error...buscando especialidad");
        }
        return todos;
    }

    public int pos(int contador) {
        ArrayList<Medico> todos = new ArrayList();
        FileReader file;
        BufferedReader br;
        String registro;
        int a = 0;
        try {
            file = new FileReader(this.ruta);
            br = new BufferedReader(file);

            for (int i = 0; i < todos.size(); i++) {
                if (contador == i) {
                    a = i;
                }
            }

        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Error...buscando especialidad");
        }
        return a;
    }

    public String[] recorrerMedicos(int num) {

        String Medico = this.toString();
        String campo[] = Medico.split(",");

        return campo;
    }

    public boolean existeIDmedico(String nuevoIDmedico) {
        boolean existeIdmedic = false;
        ArrayList<Medico> todos = this.getTodos();
        for (Medico xxx : todos) {
            if (xxx.getIdmed().equals(nuevoIDmedico)) {

                existeIdmedic = true;
            }

        }
        return existeIdmedic;
    }

    private void remplazArchivo(ArrayList<Medico> espe) {
        try {
            File file = new File(this.ruta);
            FileWriter fr = new FileWriter(file, false);
            PrintWriter ps = new PrintWriter(fr);
            for (Medico xxx : espe) {
                ps.println(xxx);
            }
            ps.close();

        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Error...El id no fue guardado");
        }

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

    public ArrayList<Medico> getMedicos() {

        FileReader fr;
        BufferedReader br;
        Medico med = null;
        String registro;
        ArrayList<Medico> medicos = new ArrayList();

        try {
            fr = new FileReader(this.ruta);
            br = new BufferedReader(fr);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split(",");
                med = new Medico(campos[0], campos[1], campos[2], campos[3], campos[4], campos[5], campos[6], campos[7]);
                medicos.add(med);
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
            //System.exit(1);
        }
        return medicos;
    }

    public void eliminarMedico(String id) {
        boolean existe = false;
        int res = -1;

        ArrayList<Medico> medicos = this.getMedicos();

        for (Medico medi : medicos) {
            if (medi.getIdmed().equals(id)) {
                res = JOptionPane.showConfirmDialog(null, "Está segur@?", "Ojo...", 0);
                if (res == 0) {
                    medicos.remove(medi);
                    this.recargaArchivo(medicos);
                    JOptionPane.showMessageDialog(null, "Operacion exitosa");
                }
                existe = true;
                break;
            }
        }
    }

    private void recargaArchivo(ArrayList<Medico> medicos) {
        File file;
        FileWriter fr;
        PrintWriter pw;

        try {
            file = new File(this.ruta);
            fr = new FileWriter(file, false);
            pw = new PrintWriter(fr);
            for (Medico medi : medicos) {
                pw.println(medi);
            }
            pw.close();
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo guardando en el archivo..!!");
            //System.exit(1);
        }
    }

    public String buscarPorEspecialidad(String codigo) {
        String nuevoCodigo = "";
        FileReader fr;
        BufferedReader br;
        Paciente paci = null;
        String registro;
        try {
            fr = new FileReader(this.ruta);
            br = new BufferedReader(fr);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split(",");
                if ((campos[3].equals(codigo))) {
                    nuevoCodigo = campos[3];
                    break;
                }
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
            //System.exit(1);
        }

        return nuevoCodigo;
    }
    public Medico buscarIdMedico(String nombreMedi){
        FileReader fr;
        BufferedReader br;
        Medico medi = null;
        String registro;
        try {
            fr = new FileReader(this.ruta);
            br = new BufferedReader(fr);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split(",");
                if ((campos[2].equals(nombreMedi))) {
                    medi = new Medico(campos[0], campos[1], campos[2], campos[3], campos[4], campos[5], campos[6], campos[7]);
                    break;
                }
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
            //System.exit(1);
        }

        return medi;
    }

    public Medico buscarMedico(String id) {
        FileReader fr;
        BufferedReader br;
        Medico medi = null;
        String registro;
        try {
            fr = new FileReader(this.ruta);
            br = new BufferedReader(fr);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split(",");
                if ((campos[0].equals(id))) {
                    medi = new Medico(campos[0], campos[1], campos[2], campos[3], campos[4], campos[5], campos[6], campos[7]);
                    break;
                }
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
            //System.exit(1);
        }

        return medi;
    }

    public void modificarMedico(Medico nuevoMedi) {

        ArrayList<Medico> medicos = this.getMedicos();

        for (Medico xxx : medicos) {
           
            if (xxx.getIdmed().equals(nuevoMedi.getIdmed())) {
                 //JOptionPane.showMessageDialog(null, "Entro al if de modificarMedico en gestion");
                xxx.setIdmed(nuevoMedi.getIdmed());
                xxx.setIdespec(nuevoMedi.getIdespec());
                xxx.setNombres(nuevoMedi.getNombres());
                xxx.setApellido1(nuevoMedi.getApellido1());
                xxx.setApellido2(nuevoMedi.getApellido2());
                xxx.setTelefono(nuevoMedi.getTelefono());
                xxx.setFoto(nuevoMedi.getFoto());
                xxx.setPassword(nuevoMedi.getPassword());
                 
                //System.out.println(""+xxx) ;
                this.remplazArchivo(medicos);
            }
        }

    }
    public String buscarIdentifiMed(String nombreMed){
        FileReader fr;
        BufferedReader br;
        Paciente paci = null;
        String registro;
        String idMed=null;
        try {
            fr = new FileReader(this.ruta);
            br = new BufferedReader(fr);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split(",");
                if ((campos[2].equals(nombreMed))) {
                   idMed=campos[0];
                    break;
                }
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
            //System.exit(1);
        }

        return idMed;
    }
    public String buscarNameMed(String idMedi){
        FileReader fr;
        BufferedReader br;
        Paciente paci = null;
        String registro;
        String idMed=null;
        try {
            fr = new FileReader(this.ruta);
            br = new BufferedReader(fr);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split(",");
                if ((campos[0].equals(idMedi))) {
                   idMed=campos[2]+" "+campos[3]+" "+campos[4];
                    break;
                }
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
            //System.exit(1);
        }

        return idMed;
    }

}
