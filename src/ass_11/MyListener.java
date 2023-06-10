package ass_11;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class MyListener extends MouseAdapter{
	JPanel panel;
	
	public MyListener(JPanel panel) {
		this.panel = panel;
	}
	
	public void mouseClicked(MouseEvent e) {
		Graphics g = panel.getGraphics();
		g.drawRect(e.getX()-10,e.getY()-10,20,20);
	}
}
