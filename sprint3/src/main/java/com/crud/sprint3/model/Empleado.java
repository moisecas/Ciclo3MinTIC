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
public class Empleado {

    //id long auto
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo")
    private EnumTipo tipo; //EnumTipo es una clase que creamos en el paquete enums




}
