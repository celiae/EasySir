/**
 * Copyright Celiae, Github: https://github.com/celiae, Email: ceelia0g@gmail.com
 * 2026 All rights reserved.
 */

package 算了嘛警官;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PnlStart extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 *
	 * @param cardLayout
	 * @param panel
	 */
	public PnlStart(CardLayout cardLayout, Panel panel) {

		setBounds(100, 100, 800, 550);

		JButton btnStart = new JButton("路口不减速");
		btnStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				AudioUtil.playAudio("audio/我错了.wav", "audio/你出示驾照5.wav", cardLayout, panel,
						"showLisence");
			}
		});
		setLayout(null);

		btnStart.setBackground(new Color(255, 255, 255));
		btnStart.setFont(new Font("宋体", Font.PLAIN, 34));
		btnStart.setBounds(254, 213, 253, 95);
		btnStart.setFocusable(false);

		add(btnStart);
	}

}
