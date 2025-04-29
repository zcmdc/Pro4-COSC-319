import javax.swing.*;

public class loginScreen {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Verifcation Screen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.setLayout(null); // Using null layout for absolute positioning

        // Frame dimensions
        int frameWidth = frame.getWidth();
        int labelWidth = 100;
        int fieldWidth = 200;
        int componentHeight = 30;
        int verticalSpacing = 20;

        // Add name at the top
        JLabel welcomeLabel = new JLabel("Medication Scanner", SwingConstants.CENTER);
        welcomeLabel.setBounds(0, 50, frameWidth, componentHeight); // Center horizontally
        frame.add(welcomeLabel);

        // Calculate horizontal center
        int labelX = (frameWidth - labelWidth - fieldWidth) / 2;
        int fieldX = labelX + labelWidth;

        // Vertical positions
        int idLabelY = 150; // Start below the welcome text
        int idFieldY = idLabelY;
        int medLabelY = idLabelY + componentHeight + verticalSpacing;
        int medFieldY = medLabelY;
        int buttonY = medFieldY + componentHeight + verticalSpacing;

        // Create a label for the Patient ID
        JLabel idLabel = new JLabel("Patient ID:");
        idLabel.setBounds(labelX, idLabelY, labelWidth, componentHeight);
        frame.add(idLabel);

        // Create a text field for the Patient ID
        JTextField idField = new JTextField();
        idField.setBounds(fieldX, idFieldY, fieldWidth, componentHeight);
        frame.add(idField);

        // Create a label for the Medication ID
        JLabel medLabel = new JLabel("Medication ID:");
        medLabel.setBounds(labelX, medLabelY, labelWidth, componentHeight);
        frame.add(medLabel);

        // Create a text field for the Medication ID
        JTextField medField = new JTextField();
        medField.setBounds(fieldX, medFieldY, fieldWidth, componentHeight);
        frame.add(medField);

        // Create a button to submit the information
        JButton submitButton = new JButton("Submit");
        int buttonWidth = 100;
        int buttonX = (frameWidth - buttonWidth) / 2; // Center the button horizontally
        submitButton.setBounds(buttonX, buttonY, buttonWidth, componentHeight);
        frame.add(submitButton);

        // Make the frame visible
        frame.setVisible(true);
    }
}