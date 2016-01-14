package com.atlanta.educatic.pojo;
// Generated 14/01/2016 06:39:31 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Tablamaestra generated by hbm2java
 */
public class Tablamaestra  implements java.io.Serializable {


     private int id;
     private int idTabla;
     private int idItem;
     private String denominacion;
     private String estado;
     private String abreviatura;
     private Integer orden;
     private Set matriculas = new HashSet(0);
     private Set usuarios = new HashSet(0);
     private Set cursosForEstado = new HashSet(0);
     private Set estudiantes = new HashSet(0);
     private Set institucions = new HashSet(0);
     private Set permisos = new HashSet(0);
     private Set vinculos = new HashSet(0);
     private Set rendimientos = new HashSet(0);
     private Set usuarioPermisos = new HashSet(0);
     private Set docentes = new HashSet(0);
     private Set apoderados = new HashSet(0);
     private Set tutors = new HashSet(0);
     private Set modalidadingresos = new HashSet(0);
     private Set personas = new HashSet(0);
     private Set cursosForTipoCurso = new HashSet(0);
     private Set grados = new HashSet(0);
     private Set tareas = new HashSet(0);

    public Tablamaestra() {
    }

	
    public Tablamaestra(int id, int idTabla, int idItem, String denominacion) {
        this.id = id;
        this.idTabla = idTabla;
        this.idItem = idItem;
        this.denominacion = denominacion;
    }
    public Tablamaestra(int id, int idTabla, int idItem, String denominacion, String estado, String abreviatura, Integer orden, Set matriculas, Set usuarios, Set cursosForEstado, Set estudiantes, Set institucions, Set permisos, Set vinculos, Set rendimientos, Set usuarioPermisos, Set docentes, Set apoderados, Set tutors, Set modalidadingresos, Set personas, Set cursosForTipoCurso, Set grados, Set tareas) {
       this.id = id;
       this.idTabla = idTabla;
       this.idItem = idItem;
       this.denominacion = denominacion;
       this.estado = estado;
       this.abreviatura = abreviatura;
       this.orden = orden;
       this.matriculas = matriculas;
       this.usuarios = usuarios;
       this.cursosForEstado = cursosForEstado;
       this.estudiantes = estudiantes;
       this.institucions = institucions;
       this.permisos = permisos;
       this.vinculos = vinculos;
       this.rendimientos = rendimientos;
       this.usuarioPermisos = usuarioPermisos;
       this.docentes = docentes;
       this.apoderados = apoderados;
       this.tutors = tutors;
       this.modalidadingresos = modalidadingresos;
       this.personas = personas;
       this.cursosForTipoCurso = cursosForTipoCurso;
       this.grados = grados;
       this.tareas = tareas;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public int getIdTabla() {
        return this.idTabla;
    }
    
    public void setIdTabla(int idTabla) {
        this.idTabla = idTabla;
    }
    public int getIdItem() {
        return this.idItem;
    }
    
    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }
    public String getDenominacion() {
        return this.denominacion;
    }
    
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getAbreviatura() {
        return this.abreviatura;
    }
    
    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }
    public Integer getOrden() {
        return this.orden;
    }
    
    public void setOrden(Integer orden) {
        this.orden = orden;
    }
    public Set getMatriculas() {
        return this.matriculas;
    }
    
    public void setMatriculas(Set matriculas) {
        this.matriculas = matriculas;
    }
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }
    public Set getCursosForEstado() {
        return this.cursosForEstado;
    }
    
    public void setCursosForEstado(Set cursosForEstado) {
        this.cursosForEstado = cursosForEstado;
    }
    public Set getEstudiantes() {
        return this.estudiantes;
    }
    
    public void setEstudiantes(Set estudiantes) {
        this.estudiantes = estudiantes;
    }
    public Set getInstitucions() {
        return this.institucions;
    }
    
    public void setInstitucions(Set institucions) {
        this.institucions = institucions;
    }
    public Set getPermisos() {
        return this.permisos;
    }
    
    public void setPermisos(Set permisos) {
        this.permisos = permisos;
    }
    public Set getVinculos() {
        return this.vinculos;
    }
    
    public void setVinculos(Set vinculos) {
        this.vinculos = vinculos;
    }
    public Set getRendimientos() {
        return this.rendimientos;
    }
    
    public void setRendimientos(Set rendimientos) {
        this.rendimientos = rendimientos;
    }
    public Set getUsuarioPermisos() {
        return this.usuarioPermisos;
    }
    
    public void setUsuarioPermisos(Set usuarioPermisos) {
        this.usuarioPermisos = usuarioPermisos;
    }
    public Set getDocentes() {
        return this.docentes;
    }
    
    public void setDocentes(Set docentes) {
        this.docentes = docentes;
    }
    public Set getApoderados() {
        return this.apoderados;
    }
    
    public void setApoderados(Set apoderados) {
        this.apoderados = apoderados;
    }
    public Set getTutors() {
        return this.tutors;
    }
    
    public void setTutors(Set tutors) {
        this.tutors = tutors;
    }
    public Set getModalidadingresos() {
        return this.modalidadingresos;
    }
    
    public void setModalidadingresos(Set modalidadingresos) {
        this.modalidadingresos = modalidadingresos;
    }
    public Set getPersonas() {
        return this.personas;
    }
    
    public void setPersonas(Set personas) {
        this.personas = personas;
    }
    public Set getCursosForTipoCurso() {
        return this.cursosForTipoCurso;
    }
    
    public void setCursosForTipoCurso(Set cursosForTipoCurso) {
        this.cursosForTipoCurso = cursosForTipoCurso;
    }
    public Set getGrados() {
        return this.grados;
    }
    
    public void setGrados(Set grados) {
        this.grados = grados;
    }
    public Set getTareas() {
        return this.tareas;
    }
    
    public void setTareas(Set tareas) {
        this.tareas = tareas;
    }




}


