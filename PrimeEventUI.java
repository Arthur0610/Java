/*
  ZxIE0018
  Sep 05 20
  5136 S.E. project PrimeEvent 1.0.2
*/

import java.awt.*;
import javax.swing.*;


// • Login 1
// • Register 1
// • Search a hall 1
// • Request quotation for a hall 1
// • Book a hall 1
// • Create a hall 1
// • Edit a hall 1
// • Logout 1


public class PrimeEventUI
{
    public static void main(String[] args) {
        welcomeUI();
        registerUI();
        ownerUI();
        adminUI();
        customerUI();
    }

    //welcome and login page
    //two
    public static void welcomeUI() {
        //create a frame called welFrame
        JFrame welFrame = new JFrame("Welcome to Prime Event System!");
        welFrame.setSize(300, 150);
        welFrame.setLocationRelativeTo(null);
        welFrame.setLayout(new GridLayout(3, 1));
        
        //create three jpanel
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        JPanel jp3 = new JPanel();

        JLabel usrname = new JLabel("Username");
        JLabel psw = new JLabel("Password");
        JTextField usrField = new JTextField(18);
        JPasswordField pswField = new JPasswordField(18);
        JButton login = new JButton("Login");
        JButton forgetUsr = new JButton("Forget Email?");


        //add those components that flowing the list
        jp1.add(usrname);
        jp1.add(usrField);
        jp2.add(psw);
        jp2.add(pswField);
        jp3.add(login);
        jp3.add(forgetUsr);

        welFrame.add(jp1);
        welFrame.add(jp2);
        welFrame.add(jp3);
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


        welFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        welFrame.setVisible(true);
    }

    public static void registerUI() {
        JFrame regFrame = new JFrame("Register");
        regFrame.setSize(800, 200);
        regFrame.setLocationRelativeTo(null);
        regFrame.setLayout(new GridLayout(6, 1));
        
        
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        JPanel jp3 = new JPanel();
        JPanel jp4 = new JPanel();
        JPanel jp5 = new JPanel();
        JPanel jp6 = new JPanel();
        
        //
        JLabel typeUsr = new JLabel("Which type of user:");
        JRadioButton hallOwner = new JRadioButton("Hall's Owner");
        JRadioButton customer = new JRadioButton("Customer");
        ButtonGroup typeUsrGroup = new ButtonGroup();
        typeUsrGroup.add(hallOwner);
        typeUsrGroup.add(customer);        
        //username
        JLabel usrname = new JLabel("Username");
        JTextField usrField = new JTextField(18);
        //gender single-choose button
        JLabel gender = new JLabel("Gender");
        JRadioButton male = new JRadioButton("male");
        JRadioButton female = new JRadioButton("female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        //
        JLabel pwd = new JLabel("Password");
        JLabel pwdComfirm = new JLabel("PasswordComfirm");
        
        JPasswordField pwdField = new JPasswordField(18);
        JPasswordField pwdComfirmField = new JPasswordField(18);

        JButton subButton = new JButton("Submit");
        
        jp1.add(typeUsr);
        jp1.add(hallOwner);
        jp1.add(customer);
        jp2.add(usrname);
        jp2.add(usrField);
        jp3.add(gender);
        jp3.add(male);
        jp3.add(female);
        jp4.add(pwd);
        jp4.add(pwdField);
        jp5.add(pwdComfirm);
        jp5.add(pwdComfirmField);
        jp6.add(subButton);
        
        regFrame.add(jp1);
        regFrame.add(jp2);
        regFrame.add(jp3);
        regFrame.add(jp4);
        regFrame.add(jp5);
        regFrame.add(jp6);
        
        regFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        regFrame.setVisible(true);

    }

    public static void ownerUI(){
        JFrame ownerFrame = new JFrame("Owner's Page");
        ownerFrame.setSize(400, 400);
        ownerFrame.setLocationRelativeTo(null);
        ownerFrame.setLayout(new GridLayout(3, 1));

        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        JPanel jpfinal = new JPanel();

        JButton createButton = new JButton("Create a hall");
        JButton editButton = new JButton("Edit a hall");

        //the orders list table
        Object[] ordersName = {"Order Number", "Customer Name"
                , "Customer Email Address", "Hall's name"
                , "Hall's Owner", "Price", "Status"};

        Object[][] orders = {
            {"001", "C1", "C1@PE", "C1HALL", "C1HO", "$100", "Finished"},
            {"002", "C2", "C2@PE", "C2HALL", "C2HO", "$110", "Pending"}
        };

        JTable orderTable = new JTable(orders, ordersName);
        
        
        
        JButton exitButton = new JButton("Exit the Prime Event System");
        
        jp1.add(createButton);
        jp1.add(editButton);
        jp2.add(orderTable.getTableHeader(), BorderLayout.NORTH);
        jp2.add(orderTable, BorderLayout.CENTER);
        jpfinal.add(exitButton);
        
        ownerFrame.add(jp1);
        ownerFrame.add(jp2);
        ownerFrame.add(jpfinal);

        ownerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ownerFrame.setVisible(true);
    }

    public static void adminUI(){
        JFrame adminFrame = new JFrame("Admin");

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

        adminFrame.setContentPane(panel);
        adminFrame.pack();
        adminFrame.setLocationRelativeTo(null);
        adminFrame.setVisible(true);
    }

    public static void customerUI(){
        JFrame customerFrame = new JFrame("Customer");

        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        JPanel jp3 = new JPanel();

        JLabel searchHall = new JLabel("Search a Hall");
        JTextField searchField = new JTextField(50);
        JButton searchSubButton = new JButton("Search it!!");
        
        //the search list table
        Object[] searchColumnNames = {"Hall's name", "Hall's Owner"
              , "Price", "Max people", "Discount or Not"};

        Object[][] searchRow = {
            {"HALL1", "H1O", "$100", "10", "YES"},
            {"HALL2", "H2O", "$200", "20", "YES"},
            {"HALL3", "H3O", "$500", "40", "NO"}
        };

        JTable searchTable = new JTable(searchRow, searchColumnNames);

        //the orders list table
        Object[] ordersName = {"Order Number", "Customer Name"
                , "Customer Email Address", "Hall's name"
                , "Hall's Owner", "Price", "Status"};

        Object[][] orders = {
            {"001", "C1", "C1@PE", "C1HALL", "C1HO", "$100", "Finished"},
            {"002", "C2", "C2@PE", "C2HALL", "C2HO", "$110", "Pending"}
        };


        JTable orderTable = new JTable(orders, ordersName);
        
        //
        JButton requestButton = new JButton("Request quotation for a hall");
        JButton exitButton = new JButton("Exit the Prime Event System");
        
        // 
        jp1.add(searchHall);
        jp1.add(searchField);
        jp1.add(searchSubButton);

        jp2.add(searchTable.getTableHeader(), BorderLayout.NORTH);
        jp2.add(searchTable, BorderLayout.CENTER);
        jp2.add(requestButton);
        jp3.add(orderTable.getTableHeader(), BorderLayout.NORTH);
        jp3.add(orderTable, BorderLayout.CENTER);
        jp3.add(exitButton);

        
        customerFrame.add(jp1, BorderLayout.NORTH);
        customerFrame.add(jp2, BorderLayout.CENTER);
        customerFrame.add(jp3, BorderLayout.SOUTH);

        customerFrame.pack();
        
        customerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        customerFrame.setVisible(true);

    }
}
