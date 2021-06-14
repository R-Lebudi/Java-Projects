package jvApplet;

import java.applet.*;
import java.awt.*;
import javax.swing.JApplet;


public class newApp extends JApplet {

    Checkbox cb1 = new Checkbox("South African");
    Checkbox cb2 = new Checkbox("Above 18");
    Checkbox cb3 = new Checkbox("Matriculated");
    Checkbox cb4 = new Checkbox("Diploma/Degree");
    Checkbox cb5 = new Checkbox("Driver's License");
    Checkbox cb6 = new Checkbox("3 years Java experience");
    Checkbox cb7 = new Checkbox("3 years PHP experience");
    
    public void init() {
        
        add(cb1);
        add(cb2);
        add(cb3);
        add(cb4);
        add(cb5);
        add(cb6);
        add(cb7);
        
        super.init();
        
    }
    
}
