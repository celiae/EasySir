/**
 * Copyright Celiae, Github: https://github.com/celiae, Email: ceelia0g@gmail.com
 * 2026 All rights reserved.
 */

package 算了嘛警官;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class FramMain {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					FramMain window = new FramMain();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FramMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("算了嘛警官");
		frame.setBounds(100, 100, 800, 550);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		Panel panel = new Panel();
		CardLayout cardLayout = new CardLayout();
		panel.setLayout(cardLayout);

		PnlStart pnlStart = new PnlStart(cardLayout, panel);
		pnlStart.setBackground(new Color(255, 255, 255));
		panel.add(pnlStart, "start");

		PnlShowLisence pnlMain = new PnlShowLisence(cardLayout, panel);
		panel.add(pnlMain, "showLisence");

		PnlLost12 pnlLost = new PnlLost12(cardLayout, panel);
		panel.add(pnlLost, "lost");

		PnlHaveOrNot pnlHaveOrNot = new PnlHaveOrNot(cardLayout, panel);
		panel.add(pnlHaveOrNot, "haveOrNot");

		PnlShowLisenceAgain pnlShowLisenceAgain = new PnlShowLisenceAgain(cardLayout, panel);
		panel.add(pnlShowLisenceAgain, "showAgain");

		frame.getContentPane().add(panel);

	}
}
