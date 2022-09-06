package mvc.movimiento.Entities;

import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name= "empresas")
public class Empresa {
    //Atributos de la class Empresa id long, name string, rfc string, address string, phone string, email string, createAt date, updateAt date
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //autoincremental
    @Column(name = "id")
    private Long id; //id de la tabla en la base de datos para la clase Empresa

    @Column(name = "name")
    private String name;

    @Column(name = "nit")
    private String nit;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "createAt")
    private Date createAt;

    @Column(name = "updateAt")
    private Date updateAt;

    //Getters y setters de la class Empresa

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNit() {
        return nit;
    }
    public void setNit(String nit) {
        this.nit = nit;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getCreateAt() {
        return createAt;
    }
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
    public Date getUpdateAt() {
        return updateAt;
    }
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }


}
