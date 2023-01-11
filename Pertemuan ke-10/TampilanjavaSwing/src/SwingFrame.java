import javax.swing.*;

public class SwingFrame extends JFrame {

    private int number;

    private JLabel label;

    private JButton tambah1Btn, tambah3Btn, kurang1Btn, kurang3Btn, kali2Btn;

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

        tambah1Btn = new JButton("+1");
        tambah1Btn.setBounds(35, 125, 75, 30);
        add(tambah1Btn);

        tambah3Btn = new JButton("+3");
        tambah3Btn.setBounds(215, 125, 75, 30);
        add(tambah3Btn);

        kurang1Btn = new JButton("-1");
        kurang1Btn.setBounds(35, 175, 75, 30);
        add(kurang1Btn);

        kurang3Btn = new JButton("-3");
        kurang3Btn.setBounds(215, 175, 75, 30);
        add(kurang3Btn);

        kali2Btn = new JButton("x2");
        kali2Btn.setBounds(125, 225, 75, 30);
        add(kali2Btn);
    }

    private void event(){
        tambah1Btn.addActionListener((event) -> {
            number += 1;
            String numStr = String.valueOf(number);
            label.setText(numStr);

        });

        tambah3Btn.addActionListener((e) -> {
            number += 3;
            String numStr = String.valueOf(number);
            label.setText(numStr);
        });

        kurang1Btn.addActionListener((e) -> {
            number -= 1;
            String numStr = String.valueOf(number);
            label.setText(numStr);
        });

        kurang3Btn.addActionListener((e) -> {
            number -= 3;
            String numStr = String.valueOf(number);
            label.setText(numStr);
        });

        kali2Btn.addActionListener((e) -> {
            number *= 2;
            String numStr = String.valueOf(number);
            label.setText(numStr);
        });
    }
}
