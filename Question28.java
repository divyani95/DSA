import javax.swing.*;
import java.awt.*;

public class Question28 {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("BorderLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);

        // Create components (buttons) for each region of the BorderLayout
        JButton northButton = new JButton("North");
        JButton southButton = new JButton("South");
        JButton eastButton = new JButton("East");
        JButton westButton = new JButton("West");
        JButton centerButton = new JButton("Center");

        // Create a JPanel to hold the buttons
        JPanel panel = new JPanel(new BorderLayout());

        // Add buttons to the panel with specific layout constraints
        panel.add(northButton, BorderLayout.NORTH);
        panel.add(southButton, BorderLayout.SOUTH);
        panel.add(eastButton, BorderLayout.EAST);
        panel.add(westButton, BorderLayout.WEST);
        panel.add(centerButton, BorderLayout.CENTER);

        // Add the panel to the JFrame
        frame.add(panel);

        // Set the JFrame visible
        frame.setVisible(true);
    }
}

/* <applet code="Question28" width=200 height=200>
</applet>
*/
