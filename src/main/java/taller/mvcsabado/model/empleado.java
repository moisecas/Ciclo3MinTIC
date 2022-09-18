package taller.mvcsabado.model;

import javax.persistence.*;

@Entity
@Table(name="Empleado")
public class empleado {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String name;
    private String email;
    private String rol;
    private String password;
    private String profile;
    private String enterprise;
}
