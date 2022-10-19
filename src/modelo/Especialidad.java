/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


public class Especialidad {
    private String idEspecialidad;
    private String especialidad;

    public Especialidad() {
        this.idEspecialidad = "";
        this.especialidad = "";
    }
    public Especialidad(String especialidad, String idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
        this.especialidad = especialidad;
    }

    public String getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(String idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return  this.especialidad + "," + this.idEspecialidad;
    }
    
    
}
