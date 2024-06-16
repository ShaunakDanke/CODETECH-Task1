import javax.swing.*;
import java.awt.event.*;

class Calculatortask extends JFrame implements  ActionListener
{
    JLabel lb1,lb2,lb3;
    JTextField tf1,tf2,tf3;
    JButton b1,b2,b3,b4,b5;

    public Calculatortask()
    {
        setTitle("Simple Calculator");
        setLayout(null);
        setVisible(true);

        lb1=new JLabel("Num1");
        lb2=new JLabel("Num2");
        lb3=new JLabel("Result");

        tf1=new JTextField("");
        tf2=new JTextField("");
        tf3=new JTextField("");

        b1=new JButton("Addition");
        b2=new JButton("Substration");
        b3=new JButton("Multiplication");
        b4=new JButton("Division");
        b5=new JButton("Clear");

        lb1.setBounds(100, 50, 100, 50);
        tf1.setBounds(200, 50, 100, 50);

        lb2.setBounds(100, 250, 100, 50);
        tf2.setBounds(200, 250, 100, 50);

        lb3.setBounds(100, 450, 100, 50);
        tf3.setBounds(200, 450, 100, 50);

        b1.setBounds(100, 600, 100, 50);
        b2.setBounds(250, 600, 100, 50);
        b3.setBounds(400, 600, 150, 50);
        b4.setBounds(600, 600, 100, 50);
        b5.setBounds(750, 600, 100, 50);

        setBounds(0, 0, 1920, 1080);
        add(lb1);
        add(lb2);
        add(lb3);
        add(tf1);
        add(tf2);
        add(tf3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
       try
       {
            double a=Double.parseDouble(tf1.getText());
            double b=Double.parseDouble(tf2.getText());
            double result=0;
            if (ae.getSource()==b1)
            {
                result=a+b;
                tf3.setText(String.valueOf(result));
            }
            if (ae.getSource()==b2)
            {
                result=a-b;
                tf3.setText(String.valueOf(result));
            }
            if(ae.getSource()==b3)
            {
                result=a*b;
                tf3.setText(String.valueOf(result));
            }
            if(ae.getSource()==b4)
            {
                result=a/b;
                tf3.setText(String.valueOf(result));
            }
            if (ae.getSource()==b5)
            {
                tf1.setText("");
                tf2.setText("");
                tf3.setText("");
            }
       }
       catch(Exception e)
       {
        System.out.println(e);
       }
    }
}
class Calculator 
{
    public static void main(String[] args) 
    {
        new Calculatortask();    
    }    
}