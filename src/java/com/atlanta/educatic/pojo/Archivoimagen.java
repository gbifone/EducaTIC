package com.atlanta.educatic.pojo;
// Generated 14/01/2016 06:39:31 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Archivoimagen generated by hbm2java
 */
public class Archivoimagen  implements java.io.Serializable {


     private int id;
     private Persona persona;
     private String ruta;
     private String descripcion;
     private String observacion;
     private int idusuario;
     private Date fechaRegistro;

    public Archivoimagen() {
    }

	
    public Archivoimagen(int id, Persona persona, String ruta, int idusuario, Date fechaRegistro) {
        this.id = id;
        this.persona = persona;
        this.ruta = ruta;
        this.idusuario = idusuario;
        this.fechaRegistro = fechaRegistro;
    }
    public Archivoimagen(int id, Persona persona, String ruta, String descripcion, String observacion, int idusuario, Date fechaRegistro) {
       this.id = id;
       this.persona = persona;
       this.ruta = ruta;
       this.descripcion = descripcion;
       this.observacion = observacion;
       this.idusuario = idusuario;
       this.fechaRegistro = fechaRegistro;
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
    public String getRuta() {
        return this.ruta;
    }
    
    public void setRuta(String ruta) {
        this.ruta = ruta;
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
    public int getIdusuario() {
        return this.idusuario;
    }
    
    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }
    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }
    
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }




}


