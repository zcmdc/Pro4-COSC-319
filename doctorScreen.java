import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class doctorScreen {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Doctor Screen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.setLayout(null); // Using null layout for absolute positioning

        // Frame dimensions
        int frameWidth = frame.getWidth();
        int buttonWidth = 200;
        int buttonHeight = 40;
        int verticalSpacing = 20;

        // Add welcome text at the top
        JLabel welcomeLabel = new JLabel("Hello Doctor, how can MOPS help you today?", SwingConstants.CENTER);
        welcomeLabel.setBounds(0, 30, frameWidth, 30); // Center horizontally and position at the top
        frame.add(welcomeLabel);

        // Calculate horizontal center
        int buttonX = (frameWidth - buttonWidth) / 2;

        // Vertical positions for buttons
        int addPatientY = 100;
        int removePatientY = addPatientY + buttonHeight + verticalSpacing;
        int addMedicationY = removePatientY + buttonHeight + verticalSpacing;
        int removeMedicationY = addMedicationY + buttonHeight + verticalSpacing;
        int editScheduleY = removeMedicationY + buttonHeight + verticalSpacing;

        // Create buttons
        JButton addPatientButton = new JButton("Add Patient");
        addPatientButton.setBounds(buttonX, addPatientY, buttonWidth, buttonHeight);
        frame.add(addPatientButton);

        JButton removePatientButton = new JButton("Remove Patient");
        removePatientButton.setBounds(buttonX, removePatientY, buttonWidth, buttonHeight);
        frame.add(removePatientButton);

        JButton addMedicationButton = new JButton("Add Medication");
        addMedicationButton.setBounds(buttonX, addMedicationY, buttonWidth, buttonHeight);
        frame.add(addMedicationButton);

        JButton removeMedicationButton = new JButton("Remove Medication");
        removeMedicationButton.setBounds(buttonX, removeMedicationY, buttonWidth, buttonHeight);
        frame.add(removeMedicationButton);

        JButton editScheduleButton = new JButton("Edit Schedule");
        editScheduleButton.setBounds(buttonX, editScheduleY, buttonWidth, buttonHeight);
        frame.add(editScheduleButton);

        // Add action listener to the "Add Patient" button
        addPatientButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create a new frame for adding a patient
                JFrame addPatientFrame = new JFrame("Add Patient");
                addPatientFrame.setSize(400, 300);
                addPatientFrame.setLayout(null);

                // Create labels and text fields
                JLabel nameLabel = new JLabel("Name:");
                nameLabel.setBounds(50, 50, 100, 30);
                addPatientFrame.add(nameLabel);

                JTextField nameField = new JTextField();
                nameField.setBounds(150, 50, 200, 30);
                addPatientFrame.add(nameField);

                JLabel dobLabel = new JLabel("DOB:");
                dobLabel.setBounds(50, 100, 100, 30);
                addPatientFrame.add(dobLabel);

                JTextField dobField = new JTextField();
                dobField.setBounds(150, 100, 200, 30);
                addPatientFrame.add(dobField);

                JLabel symptomsLabel = new JLabel("Symptoms/Illness:");
                symptomsLabel.setBounds(50, 150, 100, 30);
                addPatientFrame.add(symptomsLabel);

                JTextField symptomsField = new JTextField();
                symptomsField.setBounds(150, 150, 200, 30);
                addPatientFrame.add(symptomsField);

                // Create "Save" button
                JButton saveButton = new JButton("Save");
                saveButton.setBounds(250, 220, 100, 30); // Bottom right corner
                addPatientFrame.add(saveButton);

                // Create "Back" button
                JButton backButton = new JButton("Back");
                backButton.setBounds(50, 220, 100, 30); // Bottom left corner
                addPatientFrame.add(backButton);

                // Add action listener to the "Back" button
                backButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        addPatientFrame.dispose(); // Close the "Add Patient" frame
                        frame.setVisible(true); // Show the main "Doctor Screen" frame
                    }
                });

                // Show the "Add Patient" frame
                addPatientFrame.setVisible(true);
                frame.setVisible(false); // Hide the main "Doctor Screen" frame
            }
        });

        // Make the main frame visible
        frame.setVisible(true);
    }
}