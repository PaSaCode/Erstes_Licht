import java.sql.*;
import java.awt.*;
import java.awt.event.*;  

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
public class Hauptprogramm{
	static public boolean GameState;
	static Window w;
	
	private static void CreateWindow() {
		//MyWin=new PreWin();
		w=new Window(null)
		{
		  @Override
		  public void paint(Graphics g)
		  {
		    final Font font = getFont().deriveFont(48f);
		    g.setFont(font);
		    g.setColor(Color.RED);
		    final String message = "Hello Looser, you'll gonna paint!";
		    FontMetrics metrics = g.getFontMetrics();
		    g.drawString(message,
		      (getWidth()-metrics.stringWidth(message))/2,
		      (getHeight()-metrics.getHeight())/2);
		  }
		  @Override
		  public void update(Graphics g)
		  {
		    paint(g);
		  }
		};
		w.setAlwaysOnTop(true);
		w.setBounds(w.getGraphicsConfiguration().getBounds());
		w.setBackground(new Color(0, true));
		w.setVisible(true);
	}
	private static boolean GetState() {
		return GameState;
	}
	public static void main(String[] args) {
		//Start
		CreateWindow();	
		//Mouse-Listening aktivieren
		MouseListener mL = new MouseListener();
		w.addMouseListener(mL);
		w.addMouseMotionListener(mL);
		
		
	}
}

//MouseListener impementation

class MouseListener extends MouseInputAdapter{
	public void mousePressed(MouseEvent e) {
		System.out.print("Test = Klick");
	}
	public void mouseDragged(MouseEvent e){
		//Start Drawing
		int X = e.getX();
		int Y = e.getY();
	}
	 public void mouseReleased(MouseEvent e) {
	        System.exit(0);
	}
	public void mouseMoved(MouseEvent e) {
		
	}
	public void mouseClicked(MouseEvent e) {
		//Change if M3 is clicked?
		
	}
	public void mouseWheelMoved(MouseWheelEvent e) {
		//Change color and cursor?
		
		System.out.print("Test = wheel");
	}
	public void mouseEntered(MouseEvent e) {
		
	}
	public void mouseExited(MouseEvent e) {
		
	}
} 
