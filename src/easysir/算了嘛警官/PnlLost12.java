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

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PnlLost12 extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 *
	 * @param panel
	 * @param cardLayout
	 */
	public PnlLost12(CardLayout cardLayout, Panel panel) {
		setBounds(100, 100, 800, 550);
		setLayout(null);

		JLabel lblNewLabel = new JLabel("-12分");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 54));
		lblNewLabel.setBounds(197, 41, 351, 102);
		add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("-100000");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 54));
		lblNewLabel_1.setBounds(197, 140, 351, 102);
		add(lblNewLabel_1);

		JButton btnNewButton = new JButton("返回");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.first(panel);
				AudioUtil.playAudio("easysir/audio/太聪明了.wav");
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 30));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(293, 279, 195, 68);
		add(btnNewButton);
	}

}
