package ass_10;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MyFrame extends JFrame {
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
		
	public MyFrame() {
		super("MyFrame");
		JLabel select = new JLabel("Welcome to Java Pizza. Choose the type of pizza");
		JButton b1 = new JButton("Combination Pizza");
		JButton b2 = new JButton("Potato Pizza");
		JButton b3 = new JButton("Roasted meat Pizza");
		JLabel jl = new JLabel("count");
		JTextArea area = new JTextArea("               ");
		
		p1.add(select);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(jl);
		p2.add(area);
			
		Container cp = getContentPane();
		cp.add(p1,BorderLayout.NORTH);
		cp.add(p2,BorderLayout.CENTER);
		pack();
		setVisible(true);
	}
}
