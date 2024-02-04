import java.awt.*; import java.applet.*; 
 
public class boxes extends Applet { 
    int x = 50;     int y = 50; 
    int WIDTH = 100;     int HEIGHT = 50; 
    Color[] colors = { Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.ORANGE }; 
 
    public void init() { 
        setBackground(Color.WHITE); 
    } 
 
    public void paint(Graphics g) {         for (Color color : colors) { 
            g.setColor(color); 
            g.fillRect(x, y, WIDTH, HEIGHT); 
            x += 100;             y += 50; 
        } 
    } 
} 
/* 
*	<applet code = boxes width=600 height=600> 
*	</applet> 
 */ 
