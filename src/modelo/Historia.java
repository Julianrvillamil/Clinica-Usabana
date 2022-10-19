/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


public class Historia {
    //variables de clase
    private String idPaciente;
    private String idCita;
    private String diagnostico;
    private String prescripcion;
    private String examenes;
    private boolean atendido;

    

    public Historia() {
        this.idPaciente = "";
        this.idCita = "";
        this.diagnostico = "";
        this.prescripcion = "";
        this.examenes = "";
        this.atendido = false;
    }
    public Historia(String idPaciente, String idCita, String diagnostico, String prescripcion, String examenes, boolean atendido) {
        this.idPaciente = idPaciente;
        this.idCita = idCita;
        this.diagnostico = diagnostico;
        this.prescripcion = prescripcion;
        this.examenes = examenes;
        this.atendido = atendido;
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getIdCita() {
        return idCita;
    }

    public void setIdCita(String idCita) {
        this.idCita = idCita;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getPrescripcion() {
        return prescripcion;
    }

    public void setPrescripcion(String prescripcion) {
        this.prescripcion = prescripcion;
    }

    public String getExamenes() {
        return examenes;
    }

    public void setExamenes(String examenes) {
        this.examenes = examenes;
    }

    public boolean isAtendido() {
        return atendido;
    }

    public void setAtendido(boolean atendido) {
        this.atendido = atendido;
    }

    

    @Override
    public String toString() {
        return  this.idPaciente + "," + this.idCita + "," + this.diagnostico + "," + this.prescripcion + "," + this.examenes + "," + this.atendido ;
    }
    
    
    
}
