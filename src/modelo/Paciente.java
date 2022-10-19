/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


public class Paciente {

    //variables de clase
    private String idPaciente;
    private String nombres;
    private String apellido1;
    private String apellido2;
    private String telefono;
    private String nacimiento;
    private char sexo;

    

    public Paciente() {
        this.apellido1="";
        this.apellido2="";
        this.idPaciente="";
        this.nacimiento="";
        this.nombres="";
        this.sexo=' ';
        this.telefono="";
    }
    
     public Paciente(String idPaciente, String nombres, String apellido1, String apellido2, String telefono, String nacimiento, char sexo) {
        this.apellido1=apellido1;
        this.apellido2=apellido2;
        this.idPaciente=idPaciente;
        this.nacimiento=nacimiento;
        this.nombres=nombres;
        this.sexo=sexo;
        this.telefono=telefono;
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
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

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return  this.idPaciente + "," + this.nombres + "," + this.apellido1 + "," + this.apellido2 + "," + this.telefono + "," + this.nacimiento + "," + this.sexo ;
    }
    

}
