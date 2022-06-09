package potato.Utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import potato.Daos.EmployeeDAO;
import potato.Daos.EmployeeDaoPostgres;

import javax.servlet.ServletContextListener;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;

public class ContextLoaderListener  implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        final ObjectMapper mapper = new ObjectMapper();
        final EmployeeDAO employeeDAO = new EmployeeDaoPostgres();
        ServletContextListener.super.contextInitialized(sce);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContextListener.super.contextDestroyed(sce);
    }
}
