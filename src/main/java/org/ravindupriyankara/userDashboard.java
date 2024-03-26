package org.ravindupriyankara;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;
import java.io.IOException;
import java.util.Objects;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class userDashboard extends JFrame {

    private JPanel headerPanel, navigationPanel, mainPanel;
    private  ImageIcon backgroundImage;
    private JButton homeButton;
    private JLabel profileLabel, username, notificationLabel, emailLabel;
    public userDashboard() {
        try {
            // Load the background image from the classpath
            backgroundImage = new ImageIcon(ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/user-dash-bg.png"))));
        } catch (IOException e) {
            throw new RuntimeException("Failed to load the background image.", e);
        }
        initializeUI();
    }


    private void initializeUI() {
        //setTitle("User Dashboard");
        setUndecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setLocationRelativeTo(null);

        // Get the screen dimensions
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int) screenSize.getWidth() ;
        int screenHeight = (int) screenSize.getHeight() ;

        // Set the size of the frame to match the screen size
        setSize(screenWidth, screenHeight);

        // Create background panel
        JPanel backgroundPanel = new Backround(backgroundImage);
        backgroundPanel.setLayout(null); // Use null layout for precise component positioning
        backgroundPanel.setSize(900, 600); // Set size to match frame size
        add(backgroundPanel);

        // Create and add header panel
        headerPanel = new GradientPanel(new Color(255, 255, 204), new Color(255, 255, 102));
        headerPanel.setLayout(null);
        headerPanel.setOpaque(false); // Make the header panel transparent
        headerPanel.setBounds(50, 0, getWidth(), 50);
        headerPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Add padding

        // Create and add left navigation bar

        navigationPanel = new GradientPanel(new Color(255, 255,104), new Color(236, 130, 59));


        navigationPanel.setLayout(new BorderLayout());
        navigationPanel.setOpaque(true);// Make the left navigation panel transparent
        navigationPanel.setBounds(0, 0, 50,getHeight());
        navigationPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Add padding

        /*
        navigationPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.magenta, 2), // Outer border
                BorderFactory.createEmptyBorder(5, 5, 5, 5) // Inner padding
        ));

         */

        // Add navigation bar enabling button
        ImageIcon navigationIcon = new ImageIcon(getClass().getResource("/test.png"));
        navigationIcon = resizeImageIcon(navigationIcon, 35, 35);

        // Add image to button
        JButton navigate = new JButton(navigationIcon);

        // Set button size to match icon size
        navigate.setPreferredSize(new Dimension(navigationIcon.getIconWidth(), navigationIcon.getIconHeight()));

        // Set some properties for the button
        navigate.setFocusPainted(false); // Remove the focus border
        navigate.setBorderPainted(false); // Remove the border
        //navigate.setBorder(new RoundedBorder(15, Color.RED));
        navigate.setBounds(0, 3, 50, 50);

        navigate.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Expand navigation panel to 150px width when clicked
                if (navigationPanel.getWidth() == 50) {
                    navigationPanel.setSize(150, getHeight() );
                    headerPanel.setBounds(150, 0, getWidth(), 50);
                    profileLabel.setBounds(getWidth() -200,3,50,50);
                    username.setBounds(getWidth() - 250,5,60,40);
                    notificationLabel.setBounds(getWidth() - 300, 3, 50, 50);
                    emailLabel.setBounds(getWidth() - 350, 3, 50, 50);
                }
                else {
                    navigationPanel.setSize(50, getHeight() );
                    headerPanel.setBounds(50, 0, getWidth(), 50);
                    profileLabel.setBounds(getWidth() -100,3,50,50);
                    username.setBounds(getWidth() - 150,5,60,40);
                    notificationLabel.setBounds(getWidth() - 200, 3, 50, 50);
                    emailLabel.setBounds(getWidth() - 250, 3, 50, 50);
                }
            }
        });

        // Add button to header section
        headerPanel.add(navigate, BorderLayout.WEST);

        //Add profile png to header panel
        ImageIcon profileIcon = new ImageIcon(getClass().getResource("/profile.png"));
        profileLabel = new JLabel(resizeImageIcon(profileIcon, 30, 30));
        profileLabel.setBounds(getWidth() -100,3,50,50);
        headerPanel.add(profileLabel);

        //Add username to header section
        username = new JLabel();
        username.setText("Ravindu");
        username.setFont(new Font("Arial", Font.BOLD, 12));
        username.setForeground(Color.BLUE);
        //username.setBackground(Color.YELLOW);
        username.setOpaque(false);
        //username.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        username.setHorizontalAlignment(SwingConstants.CENTER);
        //username.setPreferredSize(new Dimension(10, 5));
        username.setBounds(getWidth() - 150,5,60,40);
        headerPanel.add(username);

        // Add notification icon
        ImageIcon notification = new ImageIcon(getClass().getResource("/notification.png"));
        notificationLabel = new JLabel(resizeImageIcon(notification, 30, 30));
        notificationLabel.setBounds(getWidth() - 200, 3, 50, 50);
        headerPanel.add(notificationLabel);

        //Add email icon
        ImageIcon email = new ImageIcon(getClass().getResource("/email.png"));
        emailLabel = new JLabel(resizeImageIcon(email, 30, 30));
        emailLabel.setBounds(getWidth() - 250, 3, 50, 50);
        headerPanel.add(emailLabel);


        backgroundPanel.add(headerPanel);
        backgroundPanel.add(navigationPanel);


        // Add rounded border to header panel
        headerPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.magenta, 2), // Outer border
                BorderFactory.createEmptyBorder(5, 5, 5, 5) // Inner padding
        ));




    }

    private ImageIcon resizeImageIcon(ImageIcon icon, int width, int height) {
        Image img = icon.getImage();
        Image resizedImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImg);
    }

    public void display(){
        setVisible(true);
    }
}
