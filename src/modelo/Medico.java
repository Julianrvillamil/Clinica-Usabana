/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


public class Medico {
    //variables de clase
    private String idmed;
    private String idespec;
    private String nombres;
    private String apellido1;
    private String apellido2;
    private String telefono;
    private String foto;
    private String password;

    public Medico() {
        this.idmed = "";
        this.idespec = "";
        this.nombres = "";
        this.apellido1 = "";
        this.apellido2 = "";
        this.telefono = "";
        this.foto = "";
        this.password = "";
    }
    public Medico(String idmed, String idespec, String nombres, String apellido1, String apellido2, String telefono, String foto, String password) {
        this.idmed = idmed;
        this.idespec = idespec;
        this.nombres = nombres;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.telefono = telefono;
        this.foto = foto;
        this.password = password;
    }

    public String getIdmed() {
        return idmed;
    }

    public void setIdmed(String idmed) {
        this.idmed = idmed;
    }

    public String getIdespec() {
        return idespec;
    }

    public void setIdespec(String idespec) {
        this.idespec = idespec;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return  this.idmed + "," + this.idespec + "," + this.nombres + "," + this.apellido1 + "," + this.apellido2 + "," + this.telefono + "," + this.foto + "," + this.password;
    }
    
    
    
    
}
