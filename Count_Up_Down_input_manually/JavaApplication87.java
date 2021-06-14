package javaapplication87;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Myframe extends JFrame implements ActionListener{
    Container c;
    JMenu mn1 = new JMenu("Count");
    JMenu mn2 = new JMenu("Reset");
    JLabel lbl = new JLabel("Counter: ");
    JTextField tf = new JTextField();
    JButton btn1 = new JButton("Count Up");
    JButton btn2 = new JButton("Count Down");
    JButton btn3 = new JButton("Reset");
    
    Myframe(){
        c =this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.red);
        mn1.setBounds(2,10,90,30);
        mn2.setBounds(110,10,90,30);
  
        lbl.setBounds(23,110,90,30);
        tf.setBounds(100,100,100,50);
        btn1.setBounds(210,100,100,50);
        btn2.setBounds(320,100,110,50);
        btn3.setBounds(438,100,100,50);
        
        c.add(mn1);
        c.add(mn2);
        c.add(lbl);
        c.add(tf);
        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
    }
    
    public int x;
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == btn1){
            x++;
            tf.setText(Integer.toString(x));
        }
        if (e.getSource() == btn2){
            x--;
            tf.setText(Integer.toString(x));
        }
        if (e.getSource() == btn3){
            x = 0;
            tf.setText(String.valueOf(x));
        }
    }
    
}

public class JavaApplication87 {

    public static void main(String[] args) {
        
        Myframe f = new Myframe();
        f.setTitle("Action Test");
        f.setSize(500,300);
        f.setLocation(100,100);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}