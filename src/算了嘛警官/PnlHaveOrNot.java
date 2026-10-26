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
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PnlHaveOrNot extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 *
	 * @param panel
	 * @param cardLayout
	 */
	public PnlHaveOrNot(CardLayout cardLayout, Panel panel) {
		setBounds(100, 100, 800, 550);
		setLayout(null);

		JLabel lblNewLabel = new JLabel("你有没有驾照？");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 38));
		lblNewLabel.setBounds(150, 129, 493, 118);
		add(lblNewLabel);

		JButton btnNewButton = new JButton("有，有");
		btnNewButton.setFocusable(false);
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int random = new Random().nextInt(3) + 1;
				int random2 = new Random().nextInt(5) + 1;
				AudioUtil.playAudio("audio/有" + random + ".wav", "audio/你出示驾照" + random2 + ".wav",
						cardLayout, panel, "showAgain");
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 24));
		btnNewButton.setBounds(293, 279, 195, 68);
		add(btnNewButton);
	}

}
