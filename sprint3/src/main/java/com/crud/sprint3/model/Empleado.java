package com.crud.sprint3.model;


import com.crud.sprint3.enums.EnumTipo;
import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor //Constructor con todos los atributos
@NoArgsConstructor //Constructor vacio
@Getter //Genera los getters
@Setter //Genera los setters
@ToString //Genera el metodo toString
@Table(name = "empleado")
public class Empleado {

    //id long auto
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "email")
    private String email;

    @Column(name = "telefono")
    private String telefono;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo")
    private EnumTipo tipo; //EnumTipo es una clase que creamos en el paquete enums




}
