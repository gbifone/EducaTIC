package com.atlanta.educatic.pojo;
// Generated 14/01/2016 06:39:31 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Estudiante generated by hbm2java
 */
public class Estudiante  implements java.io.Serializable {


     private int id;
     private Persona persona;
     private Tablamaestra tablamaestra;
     private Date fechaIngresa;
     private String descripcion;
     private String observacion;
     private Set matriculas = new HashSet(0);

    public Estudiante() {
    }

	
    public Estudiante(int id, Persona persona) {
        this.id = id;
        this.persona = persona;
    }
    public Estudiante(int id, Persona persona, Tablamaestra tablamaestra, Date fechaIngresa, String descripcion, String observacion, Set matriculas) {
       this.id = id;
       this.persona = persona;
       this.tablamaestra = tablamaestra;
       this.fechaIngresa = fechaIngresa;
       this.descripcion = descripcion;
       this.observacion = observacion;
       this.matriculas = matriculas;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public Tablamaestra getTablamaestra() {
        return this.tablamaestra;
    }
    
    public void setTablamaestra(Tablamaestra tablamaestra) {
        this.tablamaestra = tablamaestra;
    }
    public Date getFechaIngresa() {
        return this.fechaIngresa;
    }
    
    public void setFechaIngresa(Date fechaIngresa) {
        this.fechaIngresa = fechaIngresa;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getObservacion() {
        return this.observacion;
    }
    
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    public Set getMatriculas() {
        return this.matriculas;
    }
    
    public void setMatriculas(Set matriculas) {
        this.matriculas = matriculas;
    }




}


