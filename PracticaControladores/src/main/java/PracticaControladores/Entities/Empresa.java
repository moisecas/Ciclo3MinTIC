package PracticaControladores.Entities;

import javax.persistence.*;

@Entity //permite crear una tabla en la base de datos o entidad
@Table(name = "empresa") //nombre de la tabla en la base de datos para la clase Empresa
public class Empresa  {
    //atributos
    @Id //indica que es el id de la tabla en la base de datos para la clase Empresa
    private Long id;
    private String nit;

    //llaves foraneas
    @OneToMany(mappedBy = "empresa") //indica que es una relacion de uno a muchos con la clase Empleado
    @JoinColumn(name = "id_empresa") //nombre de la columna en la tabla en la base de datos para la llave foranea
    private Long id_ciudad;


}
