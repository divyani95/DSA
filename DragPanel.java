import java.awt.event.*; 
import java.awt.Point; 
import javax.swing.ImageIcon; 
import javax.swing.JPanel; 
import javax.swing.JFrame; 
import java.awt.Graphics; 
public class DragPanel extends JPanel { 
 ImageIcon image = new ImageIcon("C:\\Users\\DELL\\OneDrive\\Desktop\\DIVYANI_124\\DIVYANI.jpg"); 
 final int WIDTH = image.getIconWidth(); 
 final int HEIGHT = image.getIconHeight(); 
 Point imageCorner; 
 Point prevPt; 
 DragPanel() { 
 // Set the initial position to the center of the panel
 int initialX = getWidth() / 2 - WIDTH / 2; 
 int initialY = getHeight() / 2 - HEIGHT / 2; 
 imageCorner = new Point(initialX, initialY);
 ClickListener clickListener = new ClickListener(); 
 DragListener dragListener = new DragListener(); 
 this.addMouseListener(clickListener); 
 this.addMouseMotionListener(dragListener);
 } 
 public void paintComponent(Graphics g) { 
 super.paintComponent(g); 
 image.paintIcon(this, g, (int) imageCorner.getX(), (int) imageCorner.getY()); 
 } 
 private class ClickListener extends MouseAdapter { 
 public void mousePressed(MouseEvent e) { 
 prevPt = e.getPoint(); 
 } 
 }  
 private class DragListener extends MouseMotionAdapter {
 public void mouseDragged(MouseEvent e) { 
 Point currentPt = e.getPoint(); 
 imageCorner.translate((int) (currentPt.getX() - prevPt.getX()), 
 (int) (currentPt.getY() - prevPt.getY())); 
 prevPt = currentPt; 
 repaint(); 
 } 
 } 
 public static void main(String[] args) {
 JFrame frame = new JFrame(); 
 DragPanel dragPanel = new DragPanel(); 
 frame.add(dragPanel); 
 frame.setTitle("Drag and Drop"); 
 frame.setSize(600, 600); 
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true); 
 } 
}