package potato.Daos;

import potato.entities.Employees;
import java.util.List;
import potato.Utils.ConnectionFactory;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import static potato.Utils.CustomLogger.logError;

public class EmployeesDAOPostgres  implements EmployeeDAO {

    @Override
    public Employees createEmployee(Employees employee) {

        try{Connection conn = ConnectionFactory.getInstance().getConnection();
            String sql = "insert into football_app.app_users values (default,?,?, ?,?)";
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);//
            ps.setString(1, employee.getDepartment());
            ps.setString(2, employee.getFirstName());
            ps.setString(3, employee.getSalaries());
            ps.setString(4, employee.getId());


            ps.execute();

            // getting the generated primary key value
            ResultSet rs = ps.getGeneratedKeys();
            rs.next();
            int generatedId = rs.getInt("id");

            employee.setEmployeeid(generatedId);
            return employee;
        } catch (SQLException e) {
            logError(e);
            e.printStackTrace();
        } catch (Throwable t) {
            logError(t);
            t.printStackTrace();
        }
        return null;
    }

    @Override
    public Employees getEmployeesById(int id) {
        return null;
    }

    @Override
    public List<Employees> getAllEmployees() {
        return null;
    }

    @Override
    public Employees updateEmployees(Employees employee) {
        return null;
    }

    @Override
    public void deleteEmployeesById(int id) {

    }
}
