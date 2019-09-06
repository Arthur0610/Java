/*
  ZxIE0018
  Sep 05 20
  5136 S.E. project PrimeEvent 1.0.1
*/

import java.awt.*;
import javax.swing.*;


// • Login 1
// • Register 1
// • Search a hall
// • Request quotation for a hall
// • Book a hall
// • Create a hall
// • Edit a hall
// • Logout


public class PrimeEventUI
{
    public static void main(String[] args) {
        welcomeUI();
        registerUI();
        // ownerUI();
        adminUI();
        // customerUI();
    }

    //welcome and login page
    //two
    public static void welcomeUI() {
        //create a frame called welFrame
        JFrame welFrame = new JFrame();
        welFrame.setSize(300, 400);
        welFrame.setTitle("Welcome to Prime Event System!");
        welFrame.setLocationRelativeTo(null);
        welFrame.setLayout(new FlowLayout());

        JLabel usrname = new JLabel("Username");
        JLabel psw = new JLabel("Password");
        JTextField usrField = new JTextField(18);
        JPasswordField pswField = new JPasswordField(18);
        JButton login = new JButton("Login");
        JButton forgetUsr = new JButton("Forget Email?");


        //add those components that flowing the list
        welFrame.add(usrname);
        welFrame.add(usrField);
        welFrame.add(psw);
        welFrame.add(pswField);
        welFrame.add(login);
        welFrame.add(forgetUsr);

        // //add the Listener-click for those JButton
        // ActionListener listener = new ActionListener(){
        //     //use the abstract method of ActionListener
        //     public void actionPerformed(ActionEvent event){
        //         String txtName = usrField.getText();
        //         String txtPwd = pswField.getText();
        //
        //         welFrame.setVisible(false);
        //
        //         //check the admin usr&pwd
        //         if(txtName.equals("admin") && txtPwd.equals("admin")){
        //             adminUI();
        //         }
        //     }
        // }



        welFrame.setVisible(true);
    }

    public static void registerUI() {
        JFrame regFrame = new JFrame();
        regFrame.setSize(400, 400);
        regFrame.setTitle("Register");

        JLabel usrname = new JLabel("Username");
        JLabel gender = new JLabel("Gender");
        JRadioButton male = new JRadioButton("male");
        JRadioButton female = new JRadioButton("female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        JLabel pwd = new JLabel("Password");
        JLabel pwdComfirm = new JLabel("PasswordComfirm");
        JTextField usrField = new JTextField(18);
        JPasswordField pwdField = new JPasswordField(18);
        JPasswordField pwdComfirmField = new JPasswordField(18);

        regFrame.add(usrname);
        regFrame.add(usrField);
        regFrame.add(gender);
        regFrame.add(male);
        regFrame.add(female);
        regFrame.add(pwd);
        regFrame.add(pwdField);
        regFrame.add(pwdComfirm);
        regFrame.add(pwdComfirmField);

        regFrame.setVisible(true);

    }

    public void ownerUI(){
        JFrame ownerUI = new JFrame();
        //ownerUI.setSize(400, 400);
        ownerUI.setTitle("Owner");

        JPanel panel = new JPanel(new BorderLayout());



        ownerUI.setVisible(true);
    }

    public void adminUI(){
        JFrame adminUI = new JFrame();
        adminUI.setTitle("Admin");

        JPanel panel = new JPanel(new BorderLayout());

        Object[] ordersName = {"Order Number", "Customer Name"
                , "Customer Email Address", "Hall's name"
                , "Hall's Owner", "Price", "Status"};

        Object[][] orders = {
            {"001", "C1", "C1@PE", "C1HALL", "C1HO", "$100", "Finished"},
            {"002", "C2", "C2@PE", "C2HALL", "C2HO", "$110", "Pending"}
        };

        JTable table = new JTable(orders, ordersName);

        panel.add(table.getTableHeader(), BorderLayout.NORTH);
        panel.add(table, BorderLayout.CENTER);

        adminUI.setContentPane(panel);
        adminUI.pack();
        adminUI.setLocationRelativeTo(null);
        adminUI.setVisible(true);
    }

    public void customerUI(){
        JFrame customerUI = new JFrame();
        customerUI.setTitle("Customer");

        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        JPanel jp3 = new JPanel();

        JLabel searchHall = new JLabel("Search a Hall");
        JTextField searchField = new JTextField(50);
        JButton searchSubButton = new JButton("Search it!!");

        Object[] searchColumnNames = {"Hall's name", "Hall's Owner"
              , "Price", "Max people", "Discount or Not"};

        Object[][] searchRow = {
            {"HALL1", "H1O", "$100", "10", "YES"},
            {"HALL2", "H2O", "$200", "20", "YES"},
            {"HALL3", "H3O", "$500", "40", "NO"}
        };

        JTable searchTable = new JTable(searchRow, searchColumnNames);


        Object[] ordersName = {"Order Number", "Customer Name"
                , "Customer Email Address", "Hall's name"
                , "Hall's Owner", "Price", "Status"};

        Object[][] orders = {
            {"001", "C1", "C1@PE", "C1HALL", "C1HO", "$100", "Finished"},
            {"002", "C2", "C2@PE", "C2HALL", "C2HO", "$110", "Pending"}
        };


        JTable orderTable = new JTable(orders, ordersName);

        jp1.add(searchHall);
        jp1.add(searchField);
        jp1.add(searchSubButton);

        jp2.add(searchTable.getTableHeader());
        jp2.add(searchTable);
        jp3.add(orderTable.getTableHeader());
        jp3.add(orderTable);

        customerUI.add(jp1, BorderLayout.NORTH);
        customerUI.add(jp2, BorderLayout.CENTER);
        customerUI.add(jp3, BorderLayout.SOUTH);

        customerUI.pack();
        customerUI.setVisible(true);

    }
}
