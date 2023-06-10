package ass_11;
import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
	public MyFrame() {
		MyPanel panel = new MyPanel();
		add(panel);
		panel.addMouseListener(new MyListener(panel));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,500);				
		setVisible(true);
	}
}
