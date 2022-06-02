package potato.entities;

public class Salaries {

    private String salaries;

    public Salaries( String salaries) {

        this.salaries =salaries;
    }

    public String getSalaries() {
        return salaries;
    }

    public void setSalaries(String salaries) {
        this.salaries = salaries;
    }

    @Override
    public String toString() {
        return "Salaries{" +
                "salaries='" + salaries + '\'' +
                '}';
    }
}
