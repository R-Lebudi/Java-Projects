import java.awt.Graphics;
import javax.swing.JApplet;

public class NewJApplet extends JApplet {

    public void init() {
        
    }

    public void paint(Graphics g){
        super.paint(g);
        
        g.drawString("Welcome to Richfield Institute of Technology", 60, 80);
    }
}
