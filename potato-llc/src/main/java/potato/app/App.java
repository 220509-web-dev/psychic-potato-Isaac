package potato.app;

import potato.Daos.EmployeeDAO;
import potato.Daos.EmployeesDAOPostgres;
import potato.entities.Employees;
import potato.entities.Roles;
import potato.entities.Departments;
import potato.entities.Salaries;



public class App {
    public static void main(String[] args) {
        Employees getEmployeesById;
        EmployeeDAO employeesDAO = new EmployeesDAOPostgres();
        //Employees employees = EmployeeDAO.getEmployeesById(1);
        //System.out.println(employees.toString());

    }
}
