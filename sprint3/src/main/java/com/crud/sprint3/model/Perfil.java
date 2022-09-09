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
@Table(name = "perfil")
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "image")
    private String image;

    @Column(name = "phone")
    private String phone;

    @Column(name = "createAt")
    private Date createAt;

    @Column(name = "updateAt")
    private Date updateAt;
}
