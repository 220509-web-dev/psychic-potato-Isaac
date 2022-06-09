package potato.Daos;

import potato.entities.Employee;

import java.sql.SQLException;
import java.util.List;
public interface EmployeeDAO {

    Employee createEmployee(Employee employee) throws SQLException;

    Employee getEmployeeById(int id) throws SQLException;

    Employee getEmployeeByUsername(String username);
    List<Employee> getAllEmployee();

    Employee updateEmployee(Employee employee);

    void deleteEmployeeById(int id);

}
