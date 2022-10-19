
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


public class Cita {
   private String idCita;
   private String idMedico;
   private String idPaciente;
   private String fecha;
   private String dia;
   private String hora;
   //private boolean atendido;

   public Cita() {
        this.idCita = "";
        this.idMedico = "";
        this.idPaciente = "";
        this.fecha = "";
        this.dia = "";
        this.hora = "";
        //this.atendido = false;
    } 
   
   public Cita(String idCita, String idMedico, String idPaciente, String fecha, String dia, String hora) {
        this.idCita = idCita;
        this.idMedico = idMedico;
        this.idPaciente = idPaciente;
        this.fecha = fecha;
        this.dia = dia;
        this.hora = hora;
        //this.atendido = atendido;
    }
    

    public String getIdCita() {
        return idCita;
    }

    public void setIdCita(String idCita) {
        this.idCita = idCita;
    }

    public String getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(String idMedico) {
        this.idMedico = idMedico;
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

   /* public boolean isAtendido() {
        return atendido;
    }

    public void setAtendido(boolean atendido) {
        this.atendido = atendido;
    }*/

    @Override
    public String toString() {
        return this.idCita + "," + this.idMedico + "," + this.idPaciente + "," + this.fecha + "," + this.dia + "," + this.hora ;
    }
   
   
}
