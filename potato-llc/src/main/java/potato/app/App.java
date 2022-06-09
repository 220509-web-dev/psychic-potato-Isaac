package potato.app;


import potato.Daos.EmployeeDAO;
import potato.Daos.EmployeeDaoPostgres;
import potato.Utils.ConnectionFactory;
import potato.entities.Employee;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    final private static EmployeeDAO employeeDAO = new EmployeeDaoPostgres();
    public static void main(String[] args) throws SQLException {

        //testCreate();
        testGetById();

    }
    private static void testCreate() throws SQLException {
        int min = 0;
        int max = 2147000000;
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);

        String username = "Ttester"+randomNum +"@revature.net";

        Employee employee = new Employee(0, username,
                "password","Tester","McTesterson","1,000,000",1);


        employee = employeeDAO.createEmployee(employee);
        System.out.println(employee);
    }

    private static void testGetById() throws SQLException {
        Employee employee = employeeDAO.getEmployeeById(22);
        System.out.println(employee);

    }
}
