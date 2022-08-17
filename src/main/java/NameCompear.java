import employees.Employees;

public class NameCompear implements EmployeesCompea {
    @Override
    public int compare(Employees o1, Employees o2) {
        return o1.getName().compareTo(o2.getName());
    }


}
