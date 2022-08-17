import employees.Employees;

public class DateCompea implements EmployeesCompea {

    @Override
    public int compare(Employees employees1, Employees employees2) {
        return employees1.getDate_work().compareTo(employees2.getDate_work());
    }
}
