package bwzSH;
import java.util.ArrayList;

public class EmployeeModel {
    private ArrayList<Employee> employees = new ArrayList<>();
    private PersistenceService persistenceService = new PersistenceService();


   public EmployeeModel(){

   }


    public void addEmployee(Employee employee) {
        employees.add(employee);
        persistenceService.saveEmployees(employees);
    }

    public void updateEmployee(int index, Employee employee) {
        employees.set(index, employee);
        persistenceService.saveEmployees(employees);
    }

    public void removeEmployee(int index) {
        employees.remove(index);
        persistenceService.saveEmployees(employees);
    }

    public Employee getEmployee(int index) {
        return employees.get(index);
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

}
