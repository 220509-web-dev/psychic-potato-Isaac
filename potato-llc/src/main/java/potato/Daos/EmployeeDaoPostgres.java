package potato.Daos;

import potato.entities.Employee;
import java.util.List;
import potato.Utils.ConnectionFactory;
import java.sql.*;

import static potato.Utils.CustomLogger.logError;

public class EmployeeDaoPostgres implements EmployeeDAO {


    @Override
    public Employee createEmployee(Employee employee) throws SQLException {

        try(Connection conn = ConnectionFactory.getInstance().getConnection()){
            String sql = "insert into potato_llc.employees values (default,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);//
            ps.setString(1, employee.getUsername());
            ps.setString(2, employee.getPassword());
            ps.setString(3, employee.getFirst_name());
            ps.setString(4, employee.getLast_name());
            ps.setString(5, employee.getSalary());
            ps.setInt(6, employee.getRole_id());

            ps.execute();

            // getting the generated primary key value
            ResultSet rs = ps.getGeneratedKeys();
            rs.next();
            int generatedId = rs.getInt("id");

            employee.setId(generatedId);
            return employee;
        } catch (SQLException e) {
            logError(e);
            e.printStackTrace();
            throw new SQLException();
        } catch (Throwable t) {
            logError(t);
            t.printStackTrace();
            throw new RuntimeException();
        }
        //return null;
    }

    @Override
    public Employee getEmployeeById(int id) throws SQLException {
        try(Connection conn = ConnectionFactory.getInstance().getConnection()){
            String sql = "select * from potato_llc.employees where id = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            ps.execute();

            ResultSet rs = ps.getResultSet();


            if(rs.next()) {
                return new Employee(
                        rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("salary"),
                        rs.getInt("role_id")
                );
            }
        } catch (SQLException e) {
            logError(e);
            e.printStackTrace();
            throw new SQLException();
        } catch (Throwable t) {
            logError(t);
            t.printStackTrace();
            throw new RuntimeException();
        }
        return null;
    }

    @Override
    public Employee getEmployeeByUsername(String username) {
        return null;
    }

    @Override
    public List<Employee> getAllEmployee() {
        return null;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return null;
    }

    @Override
    public void deleteEmployeeById(int id) {

    }
}
