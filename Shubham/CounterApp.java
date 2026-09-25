import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp {
    private static int count = 0;

    public static void main(String[] args) {
        // 1. Create the main frame
        JFrame frame = new JFrame("Simple Counter");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // 2. Create components
        JLabel label = new JLabel("Count: 0", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 24));
        
        JButton incrementButton = new JButton("Increment");
        JButton decrementButton = new JButton("Decrement");

        // 3. Add action listeners (event handling)
        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                label.setText("Count: " + count);
            }
        });

        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count--;
                label.setText("Count: " + count);
            }
        });

        // 4. Add components to the frame
        frame.add(label);
        frame.add(incrementButton);
        frame.add(decrementButton);

        // 5. Make the frame visible
        frame.setVisible(true);
    }
}