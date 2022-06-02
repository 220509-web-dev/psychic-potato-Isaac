package potato.entities;

public class Roles {

    private String id;

    private String roles;

    public Roles( String id, String roles) {
        this.id = id;
        this.roles = roles;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Roles{" +
                "id='" + id + '\'' +
                ", roles='" + roles + '\'' +
                '}';
    }
}
