package bwz;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class EmployeeMainForm extends JFrame {
    private JList employeeList;
    private JTextField lastnameTextField;
    private JTextField firstnameTextField;
    private JTextField streetTextField;
    private JTextField postalCodeTextField;
    private JTextField cityTextField;
    private JTextField phoneTextField;
    private JTextField emailTextField;
    private JTextField dateOfBirthTextField;
    private JButton newButton;
    private JButton saveButton;
    private JLabel ageLabel;
    private JPanel mainPanel;
    private JButton deleteButton;

    // private ArrayList<Employee> employees = new ArrayList<>();
    private EmployeeModel employeeModel = new EmployeeModel();

    private DefaultListModel employeeListModel = new DefaultListModel(); // benötigt für die JList



    public EmployeeMainForm() {
        super("My Employee Manager");

        employeeList.setModel(employeeListModel);

        saveButton.setEnabled(false);

       // this.employeeModel.setEmployees(LoadEmployees());
        updateEmployeeList();

        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        // Vorgehensweise um einen Employee zu löschen
        // -------------------------------------------
        // 1. Delete Button hinzufügen
        // 2. Actionlistener zum Delete Button hinzufügen
        // 3. den Index des selektierten Employee ermitteln
        // 4. Wenn der SelectedIndex >= 0 ist, dann Employee an dieser Stelle löschen
        // 5. Update Employee List auf GUI

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = employeeList.getSelectedIndex();

                if (selectedIndex >= 0) {
                    employeeModel.removeEmployee(selectedIndex);
                    updateEmployeeList();
                    employeeList.setSelectedIndex(selectedIndex - 1);
                }
            }
        });



        newButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Employee employee = new Employee(
                        lastnameTextField.getText(),
                        firstnameTextField.getText(),
                        streetTextField.getText(),
                        postalCodeTextField.getText(),
                        cityTextField.getText(),
                        phoneTextField.getText(),
                        emailTextField.getText(),
                        dateOfBirthTextField.getText()
                );

                employeeModel.addEmployee(employee);
                updateEmployeeList();
            }
        });

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                int selectedIndex = employeeList.getSelectedIndex();

                if (selectedIndex >= 0) {
                    Employee employee = employeeModel.getEmployee(selectedIndex);
                    employee.setLastname(lastnameTextField.getText());
                    employee.setFirstname(firstnameTextField.getText());
                    employee.setStreet(streetTextField.getText());
                    employee.setPostalCode(postalCodeTextField.getText());
                    employee.setCity(cityTextField.getText());
                    employee.setPhone(phoneTextField.getText());
                    employee.setEmail(emailTextField.getText());
                    employee.setDateOfBirthAsString(dateOfBirthTextField.getText());
                    employeeModel.updateEmployee(selectedIndex, employee);
                    updateEmployeeList();
                }
            }
        });

        employeeList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int selectedIndex = employeeList.getSelectedIndex();

                if (selectedIndex >= 0) {
                    Employee employee = employeeModel.getEmployee(selectedIndex);
                    lastnameTextField.setText(employee.getLastname());
                    firstnameTextField.setText(employee.getFirstname());
                    streetTextField.setText(employee.getStreet());
                    postalCodeTextField.setText(employee.getPostalCode());
                    cityTextField.setText(employee.getCity());
                    phoneTextField.setText(employee.getPhone());
                    emailTextField.setText(employee.getEmail());
                    dateOfBirthTextField.setText(employee.getDateOfBirthAsString());
                    ageLabel.setText(Integer.toString(employee.getAge()) + " years");
                    saveButton.setEnabled(true);
                }
                else {
                    saveButton.setEnabled(false);
                }
            }
        });
    }

    public static void main(String[] args) {
        EmployeeMainForm mainForm = new EmployeeMainForm();
        mainForm.setVisible(true);
    }

    private void updateEmployeeList() {
        employeeListModel.removeAllElements();

        for(Employee employee: employeeModel.getEmployees()) {
            employeeListModel.addElement(employee.getLastname() + " " + employee.getFirstname());
        }
    }

    public ArrayList<Employee> LoadEmployees() {
        ArrayList<Employee> employeeArrayList = new ArrayList<>();

        Employee lara = new Employee(
                "Croft",
                "Lara",
                "Albisstr. 1",
                "8001",
                "Zürich"
                , "043 222 00 99",
                "lara.croft@gmail.com",
                "04.12.2001");

        Employee luke = new Employee(
                "Skywalker",
                "Luke",
                "Galaxystreet 4",
                "8001",
                "Zürich"
                , "043 444 00 99",
                "luke.skywalker@gmail.com",
                "01.11.1998");

        Employee solo = new Employee(
                "Solo",
                "Han",
                "Falconstreet 99",
                "8001",
                "Zürich"
                , "043 999 00 99",
                "han.solo@gmail.com",
                "09.10.1996");

        employeeArrayList.add(lara);
        employeeArrayList.add(luke);
        employeeArrayList.add(solo);

        return employeeArrayList;
    }
}
