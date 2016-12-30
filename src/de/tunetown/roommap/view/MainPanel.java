package de.tunetown.roommap.view;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import de.tunetown.roommap.main.Main;

/**
 * Main UI panel, holding all components
 * 
 * @author xwebert
 *
 */
public class MainPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	private Main main;
	//private JFrame frame;
	
	private Controls controls;
	private OutputGraphics graphics;

	public MainPanel(Main main, JFrame frame) {
		super(new BorderLayout(3,3));
		this.main = main;
		//this.frame = frame;
		
		init();
	}
	
	private void init() {
		controls = new Controls(main);
		add(controls, BorderLayout.EAST);
		
		graphics = new OutputGraphics(main);
		add(graphics, BorderLayout.CENTER);
	}
}