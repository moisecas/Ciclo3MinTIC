package mvc.movimiento.Entities;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name= "movimiento")
public class Movimiento {
    //Atributos de la class Movimiento financiero id long, concept string, amount double, user string, createAt date, updateAt date
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Long id; //id de la tabla en la base de datos para la clase Movimiento


    @Column(name = "concepto")
    private String concept;

    @Column(name = "monto")
    private double amount;

    @Column(name = "usuario")
    private String user;

    //Getters y setters de la class Movimiento financiero

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
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


}
