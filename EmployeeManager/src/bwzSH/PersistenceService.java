package bwzSH;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersistenceService {
    private String filename = "employees.json";
    private ObjectMapper mapper;

    public PersistenceService() {
        mapper = new ObjectMapper();
    }

    public List<Employee> loadEmployees() {
        List<Employee> employees = new ArrayList<>();
        try {
            File jsonFile = new File(filename);
            if (jsonFile.exists()) {
                Employee[] employeeArray = mapper.readValue(jsonFile, Employee[].class);

                for (Employee emp: employeeArray) {
                    employees.add(emp);
                }
            }
        }
        catch (IOException exception) {
            exception.printStackTrace();
        }
        return employees;
    }

    public void saveEmployees(List<Employee> employees) {
        try {
            File jsonFile = new File(filename);
            mapper.writerWithDefaultPrettyPrinter().writeValue(jsonFile, employees);
        }
        catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
