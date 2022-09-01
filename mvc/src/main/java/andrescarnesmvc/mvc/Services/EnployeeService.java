package andrescarnesmvc.mvc.Services;

//importacion employee entties
import andrescarnesmvc.mvc.Entities.Employee;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EnployeeService {
    Employee employee1;
    Employee employee2;
    List<Employee> employeeList;

    public EnployeeService() {

        this.employee1 = new Employee (10,"Andres", "Andres@gmail.com", new Date(), new Date(),2.566);
        this.employee2= new Employee(20,"Maria", "Maria@gmail.com", new Date(), new Date(),3.568);
        this.employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);

    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
}
