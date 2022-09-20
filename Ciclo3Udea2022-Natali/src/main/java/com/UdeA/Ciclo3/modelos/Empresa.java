package com.UdeA.Ciclo3.modelos;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor //Constructor con todos los atributos
@NoArgsConstructor //Constructor vacio
@Getter //Genera los getters
@Setter //Genera los setters
@ToString //Genera el metodo toString
@Table(name="Empresa")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="nombre", nullable=false)
    private String nombre;
    private String direccion;
    private String telefono;
    private String NIT;


}


