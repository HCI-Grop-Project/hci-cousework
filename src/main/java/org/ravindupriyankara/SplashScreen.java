package org.ravindupriyankara;


import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.plaf.basic.BasicProgressBarUI;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.Objects;

public class SplashScreen extends JFrame{
    private final ImageIcon backgroundImage;
    private JProgressBar progressBar;
    //create constructor for initializeUi
    public SplashScreen() {
        try {
            // Load the background image from the classpath
            backgroundImage = new ImageIcon(ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/splashBackground.png"))));
        } catch (IOException e) {
            throw new RuntimeException("Failed to load the background image.", e);
        }

        //call initializeUI methode
        initializeUI();
    }
    private void initializeUI(){
        //add title to splashscreen enable this
        //setTitle("Senura Ferniture");

        //hide tittle bar
        setUndecorated(true);
        //add window size
        setSize(900,600);
        // Center the frame on the screen
        setLocationRelativeTo(null);
        // Use BorderLayout for better layout control
        setLayout(new BorderLayout());

        //set background color
        setBackground(Color.BLACK);

        // Create a JLabel with the background image
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setLayout(new BorderLayout());
        add(backgroundLabel, BorderLayout.CENTER);
        // Resize the background image to fit the splash screen window
        backgroundLabel.setPreferredSize(new Dimension(getWidth(), getHeight()));

        //Add progressbar


        progressBar = new JProgressBar(0,100);
        progressBar.setPreferredSize(new Dimension(progressBar.getPreferredSize().width,10));
        progressBar.setStringPainted(true);//enable percentage
        setProgressBarColors(progressBar); // Set custom colors
        add(progressBar,BorderLayout.SOUTH);

        //set default closing operator
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Properly dispose of the frame when closed
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
    // Display function declare for enable visibility of splash screen
    public void display(){
        setVisible(true);
    }

    //set progressbar value
    public void setProgress(int value){
        progressBar.setValue(value);
        Color color = getColorForPercentage(value);
        progressBar.setForeground(color);
    }

    //get progressbar color
    private Color getColorForPercentage(int percentage){
        if (percentage < 50) {
            return Color.RED; // Red for less than 50%
        } else if (percentage < 80) {
            return Color.YELLOW; // Yellow for less than 80%
        } else {
            return Color.GREEN; // Green for 80% or more
        }
    }
    // Set custom colors for the progress bar
    private void setProgressBarColors(JProgressBar progressBar) {
        progressBar.setUI(new BasicProgressBarUI() {
            protected Color getSelectionBackground() {
                return Color.black;
            }

            protected Color getSelectionForeground() {
                return Color.black;
            }
        });
    }
}
