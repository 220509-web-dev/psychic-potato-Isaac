package potato.services;

import potato.Daos.EmployeeDAO;
import potato.Daos.EmployeeDaoPostgres;
import potato.entities.Employee;
import potato.exceptions.NoEmployeesFound;

import java.sql.SQLException;

public class ServiceGetById {
    public static Employee getUserById(String id_maybe) throws SQLException {
        Employee employee;
        int id;
        try {
            id = Integer.parseInt(id_maybe);
        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        } catch (Throwable t) {
            throw new RuntimeException();
        }
        try {
            EmployeeDAO employeeDAO = new EmployeeDaoPostgres();
            employee = employeeDAO.getEmployeeById(id);
        } catch (SQLException e) {
            throw new SQLException(e);
        } catch (Throwable t) {
            throw new RuntimeException();
        }

        if (employee == null) {
            throw new NoEmployeesFound();
        }
        return employee;
    }
}
