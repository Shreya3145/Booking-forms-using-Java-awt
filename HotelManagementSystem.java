import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HotelManagementSystem extends JFrame implements ActionListener {
    JLabel lblRoomType, lblNumOfRooms, lblBookingConfirmation, lblAvailability;
    JLabel lblEmail, lblName, lblContact, lblCheckIn, lblCheckOut, lblPaymentMethod;
    JComboBox<String> roomTypeChoice; 
    JTextField txtNumOfRooms, txtBookingConfirmation, txtAvailability;
    JTextField txtEmail, txtName, txtContact, txtCheckIn, txtCheckOut, txtPaymentMethod;
    JButton btnSubmit;
    JLabel imageLabel;
    int availableRooms = 10;

    HotelManagementSystem() {
        ImageIcon icon = new ImageIcon("image.jpg"); 
        Image image = icon.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon scaledIcon = new ImageIcon(image);
        imageLabel = new JLabel();
        imageLabel.setIcon(scaledIcon);
        imageLabel.setBounds(400, 50, 200, 200); 
        add(imageLabel);

        setTitle("Hotel Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLayout(null);

        lblEmail = new JLabel("Email:");
        lblEmail.setBounds(50, 50, 80, 20);
        add(lblEmail);

        txtEmail = new JTextField();
        txtEmail.setBounds(150, 50, 200, 20);
        add(txtEmail);

        lblName = new JLabel("Name:");
        lblName.setBounds(50, 80, 80, 20);
        add(lblName);

        txtName = new JTextField();
        txtName.setBounds(150, 80, 200, 20);
        add(txtName);

        lblContact = new JLabel("Contact:");
        lblContact.setBounds(50, 110, 80, 20);
        add(lblContact);

        txtContact = new JTextField();
        txtContact.setBounds(150, 110, 200, 20);
        add(txtContact);

        lblCheckIn = new JLabel("Check-in:");
        lblCheckIn.setBounds(50, 140, 80, 20);
        add(lblCheckIn);

        txtCheckIn = new JTextField();
        txtCheckIn.setBounds(150, 140, 200, 20);
        add(txtCheckIn);

        lblCheckOut = new JLabel("Check-out:");
        lblCheckOut.setBounds(50, 170, 80, 20);
        add(lblCheckOut);

        txtCheckOut = new JTextField();
        txtCheckOut.setBounds(150, 170, 200, 20);
        add(txtCheckOut);

        lblPaymentMethod = new JLabel("Payment Method:");
        lblPaymentMethod.setBounds(50, 200, 100, 20);
        add(lblPaymentMethod);

        txtPaymentMethod = new JTextField();
        txtPaymentMethod.setBounds(150, 200, 200, 20);
        add(txtPaymentMethod);

        lblRoomType = new JLabel("Room Type:");
        lblRoomType.setBounds(50, 230, 80, 20);
        add(lblRoomType);

        roomTypeChoice = new JComboBox<String>(); 
        roomTypeChoice.addItem("Single");
        roomTypeChoice.addItem("Double");
        roomTypeChoice.addItem("Suite");
        roomTypeChoice.setBounds(150, 230, 200, 20);
        add(roomTypeChoice);

        lblNumOfRooms = new JLabel("Number of Rooms:");
        lblNumOfRooms.setBounds(50, 260, 100, 20);
        add(lblNumOfRooms);

        txtNumOfRooms = new JTextField();
        txtNumOfRooms.setBounds(150, 260, 200, 20);
        add(txtNumOfRooms);

        lblBookingConfirmation = new JLabel("");
        lblBookingConfirmation.setBounds(50, 320, 400, 20);
        add(lblBookingConfirmation);

        lblAvailability = new JLabel("Available Rooms: " + availableRooms);
        lblAvailability.setBounds(50, 290, 200, 20);
        add(lblAvailability);

        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(250, 300, 100, 30);
        add(btnSubmit);
        btnSubmit.addActionListener(this);

        setTitle("Hotel Management System");
        setSize(600, 400);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int numOfRooms = Integer.parseInt(txtNumOfRooms.getText());
        if (numOfRooms <= availableRooms) {
            lblBookingConfirmation.setText("Booking confirmed. Thank you!");
            availableRooms -= numOfRooms;
            lblAvailability.setText("Available Rooms: " + availableRooms);
        } else {
            lblBookingConfirmation.setText("Not enough rooms available.");
        }
    }

    public static void main(String[] args) {
        new HotelManagementSystem();
    }
}
