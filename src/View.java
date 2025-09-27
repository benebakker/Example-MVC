import javax.swing.*;
import java.awt.*;

public class View {
    private JFrame frame;
    private JLabel nameLabel;
    private JTextField maxValueField;
    private JButton addButton;
    private JTextField outputField;

    public View() {
        frame = new JFrame("Button Press Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(3, 2, 10, 10));

        nameLabel = new JLabel("Enter Max Value:");
        maxValueField = new JTextField();

        addButton = new JButton("Add One");

        outputField = new JTextField();
        outputField.setEditable(false);

        frame.add(nameLabel);
        frame.add(maxValueField);
        frame.add(new JLabel()); // placeholder
        frame.add(addButton);
        frame.add(new JLabel("Output:"));
        frame.add(outputField);

        frame.setVisible(true);
    }

    // --- getters and setters for controller ---
    public JButton getAddButton() {
        return addButton;
    }

    public String getMaxValueText() {
        return maxValueField.getText().trim();
    }

    public void setOutputText(String text) {
        outputField.setText(text);
    }
}