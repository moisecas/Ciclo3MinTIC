package andrescarnesmvc.mvc.Entities;

import javax.persistence.*;
import java.util.Date;


//Creacion de la tabla Empresa
@Entity
@Table(name="Empresas")
public class Empresa {
    //atributos id long, name string, nit string, phone string, address string, createdAt date, updatedAt date

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "nit")
    private String nit;
    @Column(name = "phone")
    private String phone;
    @Column(name = "address")
    private String address;
    @Column(name = "createdAt")
    private Date createdAt;
    @Column(name = "updatedAt")
    private Date updatedAt;

    //Instancia de la clase Employee para la relacion
    @Column(name="Employee")
    private String employee; //Relacion con la tabla Employee



    //constructor tabla
    public Empresa() {}

    //constructor de la class Empresa
    public Empresa(long id, String name, String nit, String phone, String address, Date createdAt, Date updatedAt,String employee) {
        this.id = id;
        this.name = name;
        this.nit = nit;
        this.phone = phone;
        this.address = address;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.employee  = employee;
    }

    //getters y setters de la class Empresa
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
    public String getNit() {
        return nit;
    }
    public void setNit(String nit) {
        this.nit = nit;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    //Geter y Seter de Employee
    public String getEmployee() {return employee;}
    public void setEmployee(Employee employee) {this.employee = String.valueOf(employee);}
/*
    //metodos
    //crear empresa
    public void createEmpresa(long id, String name, String nit, String phone, String address, Date createdAt, Date updatedAt) {
        this.id = id;
        this.name = name;
        this.nit = nit;
        this.phone = phone;
        this.address = address;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    //modificar empresa
    public void updateEmpresa(long id, String name, String nit, String phone, String address, Date createdAt, Date updatedAt) {
        this.id = id;
        this.name = name;
        this.nit = nit;
        this.phone = phone;
        this.address = address;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
*/

}
