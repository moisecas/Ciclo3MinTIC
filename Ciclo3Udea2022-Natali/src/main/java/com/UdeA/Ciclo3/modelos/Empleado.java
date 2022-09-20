package com.UdeA.Ciclo3.modelos;

import javax.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor //Constructor con todos los atributos
@NoArgsConstructor //Constructor vacio
@Getter //Genera los getters
@Setter //Genera los setters
@ToString //Genera el metodo toString
@Table(name="Empleados")
public class Empleado {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    @Column(name="nombre", nullable=false) //nullable para indicarle que no puede ser nulo
    private String nombre;
    private String correo;
    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;
    private String rol;
    @Column(name="password", nullable=false) //nullable=false para que no se pueda dejar vacio
    private String password;
    private Boolean estado;



}
