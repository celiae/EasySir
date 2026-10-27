/**
 * Copyright Celiae, Github: https://github.com/celiae, Email: ceelia0g@gmail.com
 * 2026 All rights reserved.
 */

package easysir.算了嘛警官;

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

public class PnlShowLisenceAgain extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 *
	 * @param panel
	 * @param cardLayout
	 */
	public PnlShowLisenceAgain(CardLayout cardLayout, Panel panel) {
		setBounds(100, 100, 800, 550);
		setLayout(null);

		JLabel lblNewLabel = new JLabel("有，就出示驾照");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 34));
		lblNewLabel.setBounds(150, 129, 493, 118);
		add(lblNewLabel);

		JButton btnNewButton = new JButton("算了嘛，警官。");
		btnNewButton.setFocusable(false);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int random = new Random().nextInt(4) + 1;
				int random2 = new Random().nextInt(3) + 1;
				AudioUtil.playAudio("easysir/audio/算了嘛警官" + random + ".wav",
						"easysir/audio/有没有驾照" + random2 + ".wav", cardLayout, panel, "haveOrNot");
			}
		});

		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 22));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(293, 279, 195, 68);
		add(btnNewButton);

		JButton btnNewButton_1 = new JButton("出示驾照");
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				AudioUtil.playAudio("easysir/audio/我错了.wav", "easysir/audio/结尾.wav", cardLayout, panel, "lost");
			}
		});
		btnNewButton_1.setFont(new Font("宋体", Font.PLAIN, 22));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(507, 279, 195, 68);
		add(btnNewButton_1);
	}

}
