package Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Main extends JFrame {


    public Main(){
        setTitle("Login Window");
        setSize(400,400);
        setResizable(false);
        //setLocation(700,700);
        setLocationRelativeTo(null);
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    JPanel panel = new JPanel();

    public void initComponents()
    {
        JButton Close = new JButton ("Close");
        JButton OkButton = new JButton ("OK");
        JLabel Login= new JLabel("Login: ");
        JLabel Password = new JLabel("Password: ");
        JTextField LoginUser = new JTextField(6);
        JPasswordField PasswordUser = new JPasswordField(6);
        Close.setSize(90, 30);
        OkButton.setSize(90, 30);
        Login.setSize(100,30);
        Password.setSize(100,30);
        LoginUser.setSize(100,30);
        PasswordUser.setSize(100,30);
        Close.setLocation(getWidth()-190,getHeight()-100);
        OkButton.setLocation(getWidth()-310,getHeight()-100);
        Login.setLocation(getWidth()-300,getHeight()-220);
        Password.setLocation(getWidth()-300,getHeight()-180);
        LoginUser.setLocation(getWidth()-250,getHeight()-220);
        PasswordUser.setLocation(getWidth()-250,getHeight()-180);
        panel.setLayout(null);
        panel.add(Close);
        panel.add(OkButton);
        panel.add(Login);
        panel.add(Password);
        panel.add(LoginUser);
        panel.add(PasswordUser);
        Close.setToolTipText("Close Program.");
        OkButton.setToolTipText("Login.");
        LoginUser.setToolTipText("Give your login.");
        PasswordUser.setToolTipText("Give your password.");
        this.getContentPane().add(panel);
        Close.addActionListener(new Close());
        OkButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String user = LoginUser.getText();
                String pass = PasswordUser.getText();
                if(user.equals("admin") && pass.equals("admin")) {
                    System.out.print("Correct");
                }
                else {
                    System.out.print("Error");
                }
            }
        });
    }
    private class Close implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                Main LoginWindow = new Main();
                LoginWindow.setVisible(true);
                Toolkit t = Toolkit.getDefaultToolkit();
                Dimension d = t.getScreenSize();
                LoginWindow.setLocation((d.width/4), (d.height/4));
            }
        });
    }
}
