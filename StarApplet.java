import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
public class StarApplet extends Applet {
int pentx[] = { 260, 498, 407, 113, 22 };
int penty[] = { 10, 183, 462, 462, 183 };
int starx[] = { 260, 407, 22, 498, 113, 260 };
int stary[] = { 10, 462, 183, 183, 462, 10 };
public void paint(Graphics g) {
// always call Applet paint first
super.paint(g);
g.setColor(Color.blue);
g.fillPolygon(pentx, penty, 5);
g.setColor(Color.red);
g.drawPolygon(starx, stary, 6);
}
}
/*
* <applet code="StarApplet.class" width="500" height="500"></applet> */
