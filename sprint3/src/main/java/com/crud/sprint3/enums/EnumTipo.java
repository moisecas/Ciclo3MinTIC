package com.crud.sprint3.enums;

import javax.persistence.Table;

@Table(name = "tipo") //Nombre de la tabla en la base de datos
public enum EnumTipo {
    ADMINISTRADOR, USUARIO
}
