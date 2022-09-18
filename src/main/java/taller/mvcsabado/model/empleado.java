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

    public empleado() {
    }

    public empleado(String name, String email, String rol, String password, String profile, String enterprise) {
        this.name = name;
        this.email = email;
        this.rol = rol;
        this.password = password;
        this.profile = profile;
        this.enterprise = enterprise;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }



}
