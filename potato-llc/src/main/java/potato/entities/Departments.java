package potato.entities;

public class Departments {

    private String departments;

    private String id;

    public Departments(String id, String departments) {

        this.id = id;
        this.departments =departments;

    }

    public Departments(String departments) {
        this.departments = departments;
    }

    public String getDepartments() {
        return departments;
    }

    public void setDepartments(String departments) {
        this.departments = departments;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Departments{" +
                "departments='" + departments + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}


