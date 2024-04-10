package org.ravindupriyankara;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class userprofile extends JFrame implements ActionListener {

    private JLabel usernameLabel;
    private JTextField usernameField;
    private JLabel emailLabel;
    private JTextField emailField;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JButton saveButton;
    private JButton changePasswordButton;

    public userprofile() {
        super("Furniture Design App - User Profile");
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        // Username
        usernameLabel = new JLabel("Username:");
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(10, 10, 0, 10);
        add(usernameLabel, c);

        usernameField = new JTextField(20);
        usernameField.setEditable(false); // Editability based on your requirement
        c.gridx = 1;
        c.gridy = 0;
        c.weightx = 1.0;
        c.insets = new Insets(10, 0, 0, 10);
        add(usernameField, c);

        // Email
        emailLabel = new JLabel("Email:");
        c.gridx = 0;
        c.gridy = 1;
        c.weighty = 1.0;
        c.insets = new Insets(10, 10, 0, 10);
        add(emailLabel, c);

        emailField = new JTextField(20);
        emailField.setEditable(false); // Editability based on your requirement
        c.gridx = 1;
        c.gridy = 1;
        c.weightx = 1.0;
        c.insets = new Insets(10, 0, 0, 10);
        add(emailField, c);

        // Password
        passwordLabel = new JLabel("Password:");
        c.gridx = 0;
        c.gridy = 2;
        c.weighty = 1.0;
        c.insets = new Insets(10, 10, 0, 10);
        add(passwordLabel, c);

        passwordField = new JPasswordField(20);
        passwordField.setEditable(false); // Editability based on your requirement
        c.gridx = 1;
        c.gridy = 2;
        c.weightx = 1.0;
        c.insets = new Insets(10, 0, 0, 10);
        add(passwordField, c);

        // Buttons
        saveButton = new JButton("Save");
        saveButton.addActionListener(this);
        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 2;
        c.weightx = 1.0;
        c.insets = new Insets(10, 10, 10, 10);
        add(saveButton, c);

        changePasswordButton = new JButton("Change Password");
        changePasswordButton.addActionListener(this);
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 2;
        c.weightx = 1.0;
        c.insets = new Insets(10, 10, 10, 10);
        add(changePasswordButton, c);

        setSize(400, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Closes only the profile window
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("Save")) {
            // Implement logic to save any editable profile information
            JOptionPane.showMessageDialog(this, "Profile information saved successfully!");
        } else if (command.equals("Change Password")) {
            // Implement logic to open a password change dialog
            JOptionPane.showMessageDialog(this, "Password change functionality coming soon!");
        }
    }

    public static void main(String[] args) {
        new userprofile();
    }
}
