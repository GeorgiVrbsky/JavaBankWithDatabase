import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginScreen implements ActionListener {

    JFrame frame;

    JLabel loginText;

    JTextField username, password;

    JButton login;

    JPanel panel;

    Font text_Font = new Font("Monospaced", Font.BOLD,30);
    Font login_Font = new Font("Monospaced", Font.ITALIC,30);

    //private int password;

    public loginScreen() {
        //Frame
        frame = new JFrame("Bank Interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(380,450);
        frame.setBackground(Color.gray);
        frame.setResizable(false);
        frame.setLayout(null);
        //




        //loginText
        loginText = new JLabel("HomeCredit");
        loginText.setBounds(90, 10, 300, 60);
        loginText.setFont(text_Font);
        //

        //username
        username = new JTextField("username");
        username.setBounds(30,80,300,60);
        username.setEditable(true);
        username.setFont(login_Font);

        //password
        password = new JTextField("password");
        password.setBounds(30,150,300,60);
        password.setEditable(true);
        password.setFont(login_Font);

        //login button

        login = new JButton("Login");
        login.setFont(text_Font);
        login.setBackground(Color.white);
        login.addActionListener(this);
        login.setFocusable(false);
        login.setBounds(90,320,167,55);

        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBounds(0,0,380,450);
        panel.add(loginText);
        panel.add(username);
        panel.add(password);
        panel.add(login);





        //frame.add(loginText);
        //frame.add(username);
        //frame.add(password);
        //frame.add(login);
        frame.add(panel);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == login) {
            frame.setVisible(false);
            Menu menu = new Menu();
        }
    }


}
