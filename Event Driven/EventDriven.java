
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class EventDriven extends JApplet implements ActionListener
{
    JLabel label;
    JButton bRed, bBlue, bGreen, bOrange;
    public void inti(){
        setLayout(new BorderLayout());
        label = new JLabel("    Pick your favorite color   ");
        bRed = new JButton("   Red    ");
        bBlue = new JButton("   Blue   ");
        //bGreen = new JButton("   Green   ");
        //bOrange = new JButton("Orange");
        label.setFont(new Font("Helvetica", Font.BOLD, 20));
        //add(bGreen, BorderLayout.NORTH);
        add(bRed, BorderLayout.WEST);
        add(bBlue, BorderLayout.EAST);
        add(label, BorderLayout.CENTER);
        bRed.addActionListener(this);
        bBlue.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == bRed){
            label.setForeground(Color.red);
            label.setText("You picked red.");
        }
        else if(e.getSource() == bBlue){
            label.setForeground(Color.blue);
            label.setText("You picked blue.");
        }
    }
    public void paint(Graphics g){
        g.setColor(Color.black);
    }
}
