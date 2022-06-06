package potato.Daos;

import potato.entities.Employees;

import java.util.List;
public interface EmployeeDAO {

    Employees createEmployee(Employees employee);
    Employees getEmployeesById(int id);

    List<Employees> getAllEmployees();

    Employees updateEmployees(Employees employee);

    void deleteEmployeesById(int id);
    
}
