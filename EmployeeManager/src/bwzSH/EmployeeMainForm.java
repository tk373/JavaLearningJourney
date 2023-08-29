package bwzSH;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;

public class EmployeeMainForm extends JFrame{

   private ArrayList<Employee> employees = new ArrayList<Employee>();



    private JList employeeList;
    private JTextField lastNameTextfield;
    private JTextField firstNameTextfield;
    private JLabel FirstnameLabel;
    private JLabel LastNameLabel;
    private JLabel StreetLabel;
    private JTextField StreetTextfield;
    private JTextField PostalCodeTextfield;
    private JTextField CityTextfield;
    private JTextField phoneTextField;
    private JTextField emailTextField;
    private JLabel PostalCodeLabel;
    private JLabel CityLabel;
    private JLabel PhoneLabel;
    private JLabel emailLabel;
    private JLabel DateofBirthLabel;
    private JTextField dateOfBirthTextField;
    private JLabel AgeLabel;
    private JLabel ageLabelOutputfield;
    private JButton newButton;
    private JButton saveButton;
    private JPanel mainPanel;
    private JButton deleteButton;
    private JButton clearButton;

    private EmployeeModel employeeModel = new EmployeeModel();

    private DefaultListModel employeeListModel = new DefaultListModel(); // benötigt für die JList


    public EmployeeMainForm(){
        super("MycEmployee Form");

        employeeList.setModel(employeeListModel);

        saveButton.setEnabled(false);



        this.employeeModel.setEmployees(LoadEmployees());
        updateEmployeeList();

        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();




        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                        lastNameTextfield.setText("");
                        firstNameTextfield.setText("");
                        StreetTextfield.setText("");
                        PostalCodeTextfield.setText("");
                        CityTextfield.setText("");
                        phoneTextField.setText("");
                        emailTextField.setText("");
                        dateOfBirthTextField.setText("");
                        ageLabelOutputfield.setText("##");
                        updateEmployeeList();
            }
        });


        newButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Employee employee = new Employee(
                        lastNameTextfield.getText(),
                        firstNameTextfield.getText(),
                        StreetTextfield.getText(),
                        PostalCodeTextfield.getText(),
                        CityTextfield.getText(),
                        phoneTextField.getText(),
                        emailTextField.getText(),
                        dateOfBirthTextField.getText()
                );

                employeeModel.addEmployee(employee);
                updateEmployeeList();

            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = employeeList.getSelectedIndex();
                if (selectedIndex >= 0){
                    employees.remove(selectedIndex);
                    updateEmployeeList();
                    employeeList.setSelectedIndex(selectedIndex - 1);
                }

            }
        });

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 int selectedIdex = employeeList.getSelectedIndex();
                if(selectedIdex >= 0){
                    Employee employee = employeeModel.getEmployee(selectedIdex);
                    employee.setLastName(lastNameTextfield.getText());
                    employee.setFirstName(firstNameTextfield.getText());
                    employee.setStreet(StreetTextfield.getText());
                    employee.setPostalCode(PostalCodeTextfield.getText());
                    employee.setCity(CityTextfield.getText());
                    employee.setPhone(phoneTextField.getText());
                    employee.setEmail(emailTextField.getText());
                    employee.setDateOfBirth(LocalDate.parse(dateOfBirthTextField.getText()));
                    ageLabelOutputfield.setText(Integer.toString(employee.getAge())+" Years");
                    updateEmployeeList();

                }

                else{

                }




            }
        });



        employeeList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int selectedIndex = employeeList.getSelectedIndex();

                if(selectedIndex >= 0){
                    Employee employee = employees.get(selectedIndex);
                    lastNameTextfield.setText(employee.getLastName());
                    firstNameTextfield.setText(employee.getFirstName());
                    StreetTextfield.setText(employee.getStreet());
                    PostalCodeTextfield.setText(employee.getPostalCode());
                    CityTextfield.setText(employee.getCity());
                    phoneTextField.setText(employee.getPhone());
                    emailTextField.setText(employee.getEmail());
                    dateOfBirthTextField.setText(employee.getDateOfBirth().toString());
                    ageLabelOutputfield.setText(Integer.toString(employee.getAge())+" Years");
                    saveButton.setEnabled(true);
                }
                else {
                    saveButton.setEnabled(false);
                }
            }
        });
    }

    public static void main(String args[]){
        EmployeeMainForm mainForm = new EmployeeMainForm();
        mainForm.setVisible(true);
    }

    public void updateEmployeeList(){
        employeeListModel.removeAllElements();

        for(Employee employee: employees){
            employeeListModel.addElement(employee.getFirstName() + " " + employee.getLastName());
        }





    }



    public ArrayList<Employee> LoadEmployees() {


      Employee larsHuber = new Employee(
              "huber",
              "lars",
              "seefeldstrasse 10",
              "8853",
              "Lachen",
              "078 238 23 37",
              "lars.huber@hotmail.com",
              "04.12.2005");

        Employee ladyGAGA = new Employee(
                "GAGA",
                "lady",
                "kakapipistrasse 10",
                "8645",
                "jona",
                "079 424 43 37",
                "lady.GAGA@gmail.com",
                "04.05.1999");

        Employee kattyPerry = new Employee(
                "Perry",
                "Katty",
                "Analstreet 169",
                "142525",
                "hashford",
                "2553 928374 294",
                "katy.perry@ahole.com",
                "06.12.2002");

        Employee luisAebi = new Employee(
                "Aebi",
                "luis",
                "Flyhightstreet 100",
                "0000",
                "eternety da hood",
                "1111 111111 11111",
                "luisAebi@daTrain.com",
                "16.08.2004");

        employees.add(larsHuber);
        employees.add(ladyGAGA);
        employees.add(kattyPerry);
        employees.add(luisAebi);


      return  employees;
    }


}
