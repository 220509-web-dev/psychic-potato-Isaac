package potato.servlets;

import com.fasterxml.jackson.databind.ObjectMapper;
import potato.dtos.Message;
import potato.entities.Employee;
import potato.exceptions.NoEmployeesFound;
import potato.services.ServiceGetById;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;


import static potato.services.ServiceGetById.getUserById;

public class EmployeeServlet extends HttpServlet {
    private static ObjectMapper mapper = new ObjectMapper();

    @Override
    public void init() throws ServletException {
        System.out.println("[LOG} - EmployeeServlet initialized at " + System.currentTimeMillis()/1000);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String username = req.getParameter("username");
        String message;

        if (id != null) {
            Employee employee = new Employee();
            try {
                employee = getUserById(id);
            } catch (SQLException e) {
                resp.setStatus(500);
                message = "Database Error";
                resp.getWriter().write(mapper.writeValueAsString(new Message(message)));
                return;
            } catch (NumberFormatException e) {
                resp.setStatus(400);
                message = "Invalid Input";
                resp.getWriter().write(mapper.writeValueAsString(new Message(message)));
                return;
            } catch (NoEmployeesFound e) {
                resp.setStatus(404);
                message = "No employee found with ID "+id;
                resp.getWriter().write(mapper.writeValueAsString(new Message(message)));
                return;
            } catch (Throwable t) {
                resp.setStatus(500);
                message = "An internal error occurred";
                resp.getWriter().write(mapper.writeValueAsString(new Message(message)));
                return;
            }
            resp.setStatus(200);
            resp.getWriter().write(mapper.writeValueAsString(employee));
        }
    }
}
