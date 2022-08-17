import employees.Employees;

import java.util.Comparator;

public interface EmployeesCompea extends Comparator<Employees> {
    int compare(Employees employees1, Employees employees2);
}
