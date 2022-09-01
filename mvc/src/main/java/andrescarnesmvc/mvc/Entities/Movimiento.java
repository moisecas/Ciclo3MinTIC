package andrescarnesmvc.mvc.Entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Movimiento")
public class Movimiento {
    //Atributos de la class Movimiento financiero id long, concept string, amount double, user string, createAt date, updateAt date
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "concept")
    private String concept;
    @Column(name = "amount")
    private double amount;
    @Column(name = "user")
    private String user;
    @Column(name = "createAt")
    private Date createAt;
    @Column(name = "updateAt")
    private Date updateAt;


    public Movimiento() {
    }

    //Constructor de la class Movimiento financiero
    public Movimiento(long id, String concept, double amount, String user, Date createAt, Date updateAt) {
        this.id = id;
        this.concept = concept;
        this.amount = amount;
        this.user = user;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    //Getters y setters de la class Movimiento financiero
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getConcept() {
        return concept;
    }
    public void setConcept(String concept) {
        this.concept = concept;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
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





    /*
    //Solicitar datos por consola para crear un movimiento financiero
    public static Movimiento crearMovimiento(){
        System.out.println("Ingrese el concepto del movimiento");
        String concept = System.console().readLine();
        System.out.println("Ingrese el monto del movimiento");
        double amount = Double.parseDouble(System.console().readLine());
        System.out.println("Ingrese el usuario del movimiento");
        String user = System.console().readLine();
        return new Movimiento(0, concept, amount, user, new Date(), new Date());
    }
    //Metodo para imprimir los datos de un movimiento financiero
    public void imprimirMovimiento(){
        System.out.println("Concepto: " + concept);
        System.out.println("Monto: " + amount);
        System.out.println("Usuario: " + user);
    }
    //MODIFICAR MOVIMIENTO FINANCIERO POR CONSOLA
    public static Movimiento modificarMovimiento(Movimiento movimiento){
        System.out.println("Ingrese el concepto del movimiento");
        String concept = System.console().readLine();
        System.out.println("Ingrese el monto del movimiento");
        double amount = Double.parseDouble(System.console().readLine());
        System.out.println("Ingrese el usuario del movimiento");
        String user = System.console().readLine();
        return new Movimiento(0, concept, amount, user, new Date(), new Date());
    }
*/



}
