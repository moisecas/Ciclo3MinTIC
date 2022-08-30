package com.example.demo1.models;

import javax.persistence.*; 
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario") // nombre de la tabla en la base de datos para la clase UsuarioModel
public class UsuarioModel {
    @Id // indica que es el id de la tabla en la base de datos para la clase UsuarioModel
    @GeneratedValue(strategy = GenerationType.IDENTITY) // indica que el id de la tabla en la base de datos es autoincremental
    private long id;
    private String nombre;
    private String email;
    private int prioridad;  

    //getters and setters
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

}
