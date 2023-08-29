package bwzSH;

import javax.swing.*;

public class LoginDialog {
    public static void main(String args[]){
        //neues Fenster, neuer Dialog
        JFrame frame = new JFrame("Login");
        frame.setSize(300, 180);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);

        InitializeComponents(panel);

        frame.setVisible(true);

    }

    private static void InitializeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel labelUser = new JLabel("User");
        labelUser.setBounds(10,20,80,23);
        panel.add(labelUser);

        JTextField userTextfield = new JTextField();
        userTextfield.setBounds(100, 20, 165, 25 );
        panel.add(userTextfield);

        JLabel passwortLabel = new JLabel("Passwort");
        passwortLabel.setBounds(10, 50 , 80, 25);
        panel.add(passwortLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(100, 50, 165, 25);
        panel.add(passwordField);

        JButton submitButton = new JButton("Login");
        submitButton.setBounds(100, 90, 100, 25);
        panel.add(submitButton);



    }
}
