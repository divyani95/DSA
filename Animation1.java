import java.awt.*;
import java.applet.*;

public class Animation1 extends Applet {
    Image pic;

    public void init() { // Corrected method name
        pic = getImage(getDocumentBase(), "Java.png");
    }

    public void paint(Graphics g) {
        for (int i = 50; i < 300; i++) {
            g.drawImage(pic, i, 20, this);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) { // Corrected exception type
                //e.printStackTrace();
            }
        }
    }
}
/*<applet code="Animation1.class"codebase=""height=500 width=700></applet>*/