package andrescarnesmvc.mvc.Services;

//import service entties
import andrescarnesmvc.mvc.Entities.Movimiento;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MovimientoService {

        Movimiento movimiento1;
        Movimiento movimiento2;
        List<Movimiento> movimientoList;

        //constructor MovimientoService
        public MovimientoService() {
            //long id, String concept, double amount, String user, Date createAt, Date updateAt
            this.movimiento1 = new Movimiento(100, "AndresCarnes", 100.0, "Andres", new Date(), new Date());
            this.movimiento2 = new Movimiento(158, "AndresCarnes2", 200.0, "Andres", new Date(), new Date());
            this.movimientoList = new ArrayList<>();
            movimientoList.add(movimiento1);
            movimientoList.add(movimiento2);



        }


        public List<Movimiento> getMovimientoList() {
            return movimientoList;
        }
}
