package potato.entities;

public class Employees {
    private String id;

    private String firstname;

    private String lastname;
    private String department;
    private String salaries;
    private String roles;

    public Employees(String id, String firstname, String lastname, String department, String salaries, String roles){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
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

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String name) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", department='" + department + '\'' +
                ", salaries='" + salaries + '\'' +
                ", roles='" + roles + '\'' +
                '}';
    }
}
