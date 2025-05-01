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

        JButton addMedicationButton = new JButton("Scan Medication");
        addMedicationButton.setBounds(buttonX, addMedicationY, buttonWidth, buttonHeight);
        frame.add(addMedicationButton);

        JButton removeMedicationButton = new JButton("Remove Medication");
        removeMedicationButton.setBounds(buttonX, removeMedicationY, buttonWidth, buttonHeight);
        frame.add(removeMedicationButton);

        JButton editScheduleButton = new JButton("View Schedule");
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

                JLabel symptomsLabel = new JLabel("Symptoms:");
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

                // Add action listener to the "Save" button
                saveButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        // Display confirmation
                        JOptionPane.showMessageDialog(addPatientFrame, "Patient information saved successfully!");

                        // Return to Doctor Screen
                        addPatientFrame.dispose();
                        frame.setVisible(true);
                    }
                });

                // Show the "Add Patient" frame
                addPatientFrame.setVisible(true);
                frame.setVisible(false); // Hide the main "Doctor Screen" frame
            }
        });

        // Add action listener to the "Scan Medication" button
        addMedicationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Close the current frame
                verificationScreen.main(null); // Open the verification screen
            }
        });

        // Add action listener to the "View Schedule" button
        editScheduleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create a new frame for entering Patient ID
                JFrame patientIdFrame = new JFrame("Enter Patient ID");
                patientIdFrame.setSize(400, 200);
                patientIdFrame.setLayout(null);

                // Add label for instructions
                JLabel instructionLabel = new JLabel("Please enter Patient ID to view schedule:", SwingConstants.CENTER);
                instructionLabel.setBounds(50, 20, 300, 30);
                patientIdFrame.add(instructionLabel);

                // Add text field for Patient ID
                JLabel idLabel = new JLabel("Patient ID:");
                idLabel.setBounds(50, 70, 100, 30);
                patientIdFrame.add(idLabel);

                JTextField idField = new JTextField();
                idField.setBounds(150, 70, 200, 30);
                patientIdFrame.add(idField);

                // Add submit button
                JButton submitButton = new JButton("Submit");
                submitButton.setBounds(150, 120, 100, 30);
                patientIdFrame.add(submitButton);

                // Add action listener to the submit button
                submitButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String enteredId = idField.getText();
                        if (enteredId.equals("12345")) {
                            patientIdFrame.dispose(); // Close the Patient ID frame
                            showScheduleFrame(); // Show the schedule frame
                        } else {
                            JOptionPane.showMessageDialog(patientIdFrame, "Invalid Patient ID. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                });

                // Show the Patient ID frame
                patientIdFrame.setVisible(true);
                frame.setVisible(false); // Hide the main "Doctor Screen" frame
            }
        });

        // Make the main frame visible
        frame.setVisible(true);
    }

    // Method to display the schedule frame
    private static void showScheduleFrame() {
        JFrame scheduleFrame = new JFrame("Patient Schedule");
        scheduleFrame.setSize(800, 400);
        scheduleFrame.setLayout(null);

        // Define the days of the week as columns
        String[] columns = {"Time", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // Define the time slots as rows
        String[][] data = new String[13][8];
        String[] times = {"8:00 AM", "9:00 AM", "10:00 AM", "11:00 AM", "12:00 PM", "1:00 PM", "2:00 PM", "3:00 PM", "4:00 PM", "5:00 PM", "6:00 PM", "7:00 PM", "8:00 PM"};
        for (int i = 0; i < times.length; i++) {
            data[i][0] = times[i]; // Set the time in the first column
        }

        // Add random medications to the table
        data[1][1] = "Aspirin";
        data[2][2] = "Ibuprofen";
        data[3][3] = "Paracetamol";
        data[4][4] = "Amoxicillin";
        data[5][5] = "Metformin";
        data[6][6] = "Atorvastatin";
        data[7][7] = "Omeprazole";

        // Create the table
        JTable scheduleTable = new JTable(data, columns);
        JScrollPane scrollPane = new JScrollPane(scheduleTable);
        scrollPane.setBounds(20, 20, 750, 300);
        scheduleFrame.add(scrollPane);

        // Add a back button to return to the main screen
        JButton backButton = new JButton("Back");
        backButton.setBounds(350, 330, 100, 30);
        scheduleFrame.add(backButton);

        // Add action listener to the "Back" button
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scheduleFrame.dispose(); // Close the schedule frame
                doctorScreen.main(null); // Return to the main "Doctor Screen" frame
            }
        });

        // Show the schedule frame
        scheduleFrame.setVisible(true);
    }
}
