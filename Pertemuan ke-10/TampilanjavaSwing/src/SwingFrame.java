import javax.swing.*;

public class SwingFrame extends JFrame {

    int number;

    private JLabel label;

    private JButton button1, button2, button3, button4, button5;

    public SwingFrame(){
        setTitle("Swing Frame");
        setSize(350, 350);
        setLayout(null);
        setLocation(625, 250);

        component();
        event();
    }

    private void component(){
        label = new JLabel();
        int x = 158, y = 20, width = 150, height = 150;

        label.setBounds(x, y, width, height);
        add(label);

        button1 = new JButton("+1");
        button1.setBounds(35, 125, 75, 30);
        add(button1);

        button2 = new JButton("+3");
        button2.setBounds(215, 125, 75, 30);
        add(button2);

        button3 = new JButton("-1");
        button3.setBounds(35, 175, 75, 30);
        add(button3);

        button4 = new JButton("-3");
        button4.setBounds(215, 175, 75, 30);
        add(button4);

        button5 = new JButton("x2");
        button5.setBounds(125, 225, 75, 30);
        add(button5);
    }

    private void event(){


        button1.addActionListener((event) -> {
            number += 1;
            String numStr = String.valueOf(number);
            label.setText(numStr);

        });

        button2.addActionListener((e) -> {
            number += 3;
            String numStr = String.valueOf(number);
            label.setText(numStr);
        });

        button3.addActionListener((e) -> {
            number -= 1;
            String numStr = String.valueOf(number);
            label.setText(numStr);
        });

        button4.addActionListener((e) -> {
            number -= 3;
            String numStr = String.valueOf(number);
            label.setText(numStr);
        });

        button5.addActionListener((e) -> {
            number *= 2;
            String numStr = String.valueOf(number);
            label.setText(numStr);
        });
    }
}
