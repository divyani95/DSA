import java.awt.*;
import java.applet.*;

public class Question19 extends Applet {
    public void init() {
        setBackground(Color.pink);
        setForeground(Color.BLUE);
    }

    public void paint(Graphics g) {
        Font f = new Font("ARIEL", 2, 15);
        g.setFont(f);
        for (int i = 0; i < 600; i += 20) {
            g.drawString("BE POSITIVE", i, i);
        }
    }
}

/* <applet code = Question19 width=600 height=600> </applet>*/

