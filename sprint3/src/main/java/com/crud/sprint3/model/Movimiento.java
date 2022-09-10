package com.crud.sprint3.model;

import com.crud.sprint3.enums.EnumTipo;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor //Constructor con todos los atributos
@NoArgsConstructor //Constructor vacio
@Getter //Genera los getters
@Setter //Genera los setters
@ToString //Genera el metodo toString
@Table(name = "movimiento")
public class Movimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "concept")
    private String concept;

    @Column(name = "amount")
    private double amount;

    @Column(name = "createAt")
    private Date createAt;

    @Column(name = "updateAt")
    private Date updateAt;

    //relacion con la tabla empresa una empresa puede tener muchos movimientos



    @Column(name = "empresa_id")
    private Long empresaId;


}
