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

public class PnlShowLisence extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 *
	 * @param cardLayout
	 * @param panel
	 */
	public PnlShowLisence(CardLayout cardLayout, Panel panel) {
		setBounds(100, 100, 800, 550);
		setLayout(null);

		JButton btnNewButton = new JButton("算了嘛，警官。");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFocusable(false);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// goto 有没有驾照
				int random = new Random().nextInt(4) + 1;
				int random2 = new Random().nextInt(3) + 1;
				AudioUtil.playAudio("audio/算了嘛警官" + random + ".wav",
						"audio/有没有驾照" + random2 + ".wav", cardLayout, panel, "haveOrNot");
			}
		});

		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 22));
		btnNewButton.setBounds(276, 279, 196, 71);
		add(btnNewButton);

		JLabel lblNewLabel = new JLabel("错了？请出示驾照");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 36));
		lblNewLabel.setBounds(167, 141, 427, 87);
		add(lblNewLabel);

		JButton btnNewButton_1 = new JButton("出示驾照");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				AudioUtil.playAudio("audio/我搞不懂这个.wav", "audio/结尾.wav", cardLayout, panel, "lost");
			}
		});
		btnNewButton_1.setFont(new Font("宋体", Font.PLAIN, 22));
		btnNewButton_1.setBounds(547, 279, 189, 71);
		add(btnNewButton_1);
	}
}
