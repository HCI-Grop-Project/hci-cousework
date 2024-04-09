package org.ravindupriyankara;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class Bed extends JFrame {
    private  ImageIcon backgroundImage;
    public Bed()  {
        try {
            // Load the background image from the classpath
            backgroundImage = new ImageIcon(ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/bed2.png"))));
        } catch (IOException e) {
            throw new RuntimeException("Failed to load the background image.", e);
        }
        initializeUI();
    }
    private void initializeUI(){
        setSize(900, 600); // define a width and height of window
        setLocationRelativeTo(null);

        //hide tittle bar
        //setUndecorated(true);

        // Create background panel
        JPanel backgroundPanel = new Background(backgroundImage);
        backgroundPanel.setLayout(null); // Use null layout for precise component positioning
        backgroundPanel.setSize(900, 600); // Set size to match frame size
        add(backgroundPanel);
    }
    public void display(){
        setVisible(true);
    }
}
