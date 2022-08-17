import employees.Employees;
import employees.Manager;
import employees.Woker;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Catalog {
    List<Employees> employeesList;

    public Catalog() {
        employeesList = new ArrayList<>();
    }

    public void addEmployees(Employees employees) {
        employeesList.add(employees);
    }

    public void removeEmployees(Employees employees) {
        employeesList.remove(employees);
    }

    public void changeEmployees(Employees employeesOld, Employees employeesNew) {
        employeesNew.setDate_r(employeesOld.getDate_r());
        employeesNew.setDate_work(employeesOld.getDate_work());
        employeesNew.setName(employeesOld.getName());
        employeesList.remove(employeesOld);
        employeesList.add(employeesNew);
    }

    public List<Employees> sortedName() {
        return employeesList.stream().sorted(new NameCompear()).collect(Collectors.toList());
    }

    public List<Employees> sortDateWork() {
        return employeesList.stream().sorted(new DateCompea()).collect(Collectors.toList());
    }

}
