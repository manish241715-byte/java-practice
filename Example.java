import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Example implements ActionListener {
    JFrame f;
    JButton red, blue;

    public Example() {
        f = new JFrame("Color Example");
        f.setSize(300, 200);

        red = new JButton("RED");
        blue = new JButton("BLUE");

        f.setLayout(new FlowLayout());
        f.add(red);
        f.add(blue);

        f.getContentPane().setBackground(Color.WHITE); // default

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        red.addActionListener(this);
        blue.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == red) {
            f.getContentPane().setBackground(Color.RED);
            System.out.println("Red clicked");
        } 
        else if (e.getSource() == blue) {
            f.getContentPane().setBackground(Color.BLUE);
            System.out.println("Blue clicked");
        }
    }

    public static void main(String[] args) {
        new Example();
    }
}
