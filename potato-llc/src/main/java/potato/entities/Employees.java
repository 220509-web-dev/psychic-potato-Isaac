package potato.entities;

public class Employees {
    private String id;
    private String name;
    private String department;
    private String salaries;
    private String roles;

    public Employees(String id, String name, String department, String salaries, String roles){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salaries = salaries;
        this.roles = roles;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public  String getSalaries() {
        return salaries;
    }

    public void setSalaries(String salaries) {
        this.salaries = salaries;
    }

    public String setRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salaries='" + salaries + '\'' +
                ", roles='" + roles + '\'' +
                '}';
    }
}
