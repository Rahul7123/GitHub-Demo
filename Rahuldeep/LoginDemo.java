import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginDemo extends JFrame implements ActionListener {
    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginDemo() {
        // Create the form
        setTitle("Login Form");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create email and password fields
        emailField = new JTextField(20);
        passwordField = new JPasswordField(20);
        loginButton = new JButton("Login");

        // Add action listener for login
        loginButton.addActionListener(this);

        // Arrange components in a panel
        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(new JLabel("Email:"));
        panel.add(emailField);
        panel.add(new JLabel("Password:"));
        panel.add(passwordField);
        panel.add(loginButton);


        add(panel, BorderLayout.CENTER);

        // Finalize and show the form
        pack();
        setVisible(true);
    }

    // Action performed on login click
    public void actionPerformed(ActionEvent e) {
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());

        if ("admin@example.com".equals(email) && "password".equals(password)) {
            JOptionPane.showMessageDialog(this, "Login Successful!");
        } else {
            JOptionPane.showMessageDialog(this, "Login Failed!");
        }
    }

    public static void main(String[] args) {
        new LoginDemo();
    }
}
