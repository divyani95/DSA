import java.awt.*;
import java.applet.*;

public class Question18 extends Applet {
    int x = 0;
    int y = 0;
    int WIDTH = 50;
    int HEIGHT = 50;
    Color[] colors = { Color.YELLOW, Color.BLUE, Color.RED, Color.ORANGE, Color.PINK };
    public void init() {
        setBackground(Color.GREEN);
    }
    public void paint(Graphics g) {
        for (Color color : colors) {
            g.setColor(color);
            g.fillRect(x, y, WIDTH, HEIGHT);
            x += 50;
            y += 50;
        }
    }
}
/* <applet code = Question18 width=600 height=600> </applet>*/
















