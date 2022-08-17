package employees;

public class Other extends Employees {

    private String description;

    public Other() {
        description = "";
    }

    public String getDescription() {
        return description;
    }

    public Other setDescription(String description) {
        this.description = description;
        return this;
    }
}
