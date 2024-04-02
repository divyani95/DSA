import java.applet.*;
import java.awt.*; 
import java.awt.event.*; 
 
public class Question25 extends Applet implements ActionListener { 
    String msg = " "; 
    Button Overriding, Overloading; 
 
    public void init() { 
        Overriding  = new Button("Overriding "); 
        Overloading = new Button("Overloading"); 
         
 
        add(Overriding);         
	add(Overloading);         
	 
 
        Overriding.addActionListener(this); 
        Overloading.addActionListener(this); 
        
    } 
 
    public void actionPerformed(ActionEvent ae) {         
	String str = ae.getActionCommand();         
	if (str.equals("Overriding")) 
            msg = "when a subclass has the same method as the parent class"; 
 
        else if (str.equals("Overloading")) 
            msg = "Having two or more methods in a class with the same name and different arguments is called overloading."; 
 
     
 
        repaint(); 
    } 
 
    public void paint(Graphics g) { 
        g.drawString(msg, 6, 100); 
    } 
} 
/* 
	<applet code = "Question25" width=250 height=150>	</applet> 
 */

