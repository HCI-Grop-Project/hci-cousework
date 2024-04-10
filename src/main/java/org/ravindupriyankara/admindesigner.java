package org.ravindupriyankara;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class admindesigner extends JFrame implements ActionListener {

    private JMenuBar menuBar;
    private JToolBar toolBar;
    private JList<String> roomList;
    private JList<String> furnitureLibrary;
    private JPanel workspacePanel;
    private JTextArea viewport;
    private JTextField propertiesField;

    public admindesigner() {
        super("Furniture Design App");
        setLayout(new BorderLayout());

        // Menu Bar
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // File Menu
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);
        JMenuItem newRoomItem = new JMenuItem("New Room");
        newRoomItem.addActionListener(this);
        fileMenu.add(newRoomItem);
        JMenuItem openProjectItem = new JMenuItem("Open Project");
        openProjectItem.addActionListener(this);
        fileMenu.add(openProjectItem);
        JMenuItem saveProjectItem = new JMenuItem("Save Project");
        saveProjectItem.addActionListener(this);
        fileMenu.add(saveProjectItem);

        // Edit Menu (Example)
        JMenu editMenu = new JMenu("Edit");
        menuBar.add(editMenu);
        JMenuItem editRoomItem = new JMenuItem("Edit Room");
        editRoomItem.addActionListener(this);
        editMenu.add(editRoomItem);

        // Toolbar
        toolBar = new JToolBar();
        JButton newRoomButton = new JButton("New Room");
        newRoomButton.addActionListener(this);
        toolBar.add(newRoomButton);
        JButton openProjectButton = new JButton("Open Project");
        openProjectButton.addActionListener(this);
        toolBar.add(openProjectButton);
        JButton saveProjectButton = new JButton("Save Project");
        saveProjectButton.addActionListener(this);
        toolBar.add(saveProjectButton);
        // Add more buttons as needed (e.g., Add Furniture, Select, Material Picker)
        add(toolBar, BorderLayout.NORTH);

        // Workspace Panel
        workspacePanel = new JPanel(new BorderLayout());

        // Room List
        roomList = new JList<>();
        roomList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane roomListScrollPane = new JScrollPane(roomList);
        workspacePanel.add(roomListScrollPane, BorderLayout.WEST);

        // Furniture Library (Example)
        furnitureLibrary = new JList<>();
        furnitureLibrary.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane furnitureListScrollPane = new JScrollPane(furnitureLibrary);
        workspacePanel.add(furnitureListScrollPane, BorderLayout.CENTER);

        // Viewport (Replace with actual rendering component later)
        viewport = new JTextArea("2D/3D Viewport\n(Replace with graphics component)");
        viewport.setEditable(false);
        workspacePanel.add(viewport, BorderLayout.EAST);

        // Properties Panel (Optional, can be displayed on selection)
        propertiesField = new JTextField("Selected Object Properties");
        propertiesField.setEditable(false);
        workspacePanel.add(propertiesField, BorderLayout.SOUTH);

        add(workspacePanel, BorderLayout.CENTER);

        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle menu and button actions here (e.g., open new room dialog, populate furniture library)
        String command = e.getActionCommand();
        if (command.equals("New Room")) {
            // Code to create a new room
        } else if (command.equals("Open Project")) {
            // Code to open an existing project
        } else if (command.equals("Save Project")) {
            // Code to save the current project
        } else if (command.equals("Edit Room")) {
            // Code to edit properties of the selected room
        }
        // Add more action handling based on button clicks
    }

    public static void main(String[] args) {
        new admindesigner();
    }
}


