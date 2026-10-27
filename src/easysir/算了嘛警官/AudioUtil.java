/**
 * Copyright Celiae, Github: https://github.com/celiae, Email: ceelia0g@gmail.com
 * 2026 All rights reserved.
 */

package easysir.算了嘛警官;

import java.awt.CardLayout;
import java.awt.Panel;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.swing.SwingUtilities;

public class AudioUtil {

	public static void playAudio(String filename) {
		Thread thread = new Thread(() -> {
			try {
				File file = new File(filename);

				AudioInputStream audio = AudioSystem.getAudioInputStream(file);

				Clip clip = AudioSystem.getClip();
				clip.open(audio);
				clip.start();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		});

		thread.start();
	}

	public static void playAudio(String filename, String filename2, CardLayout cardLayout,
			Panel panel, String panelName) {

		Thread thread = new Thread(() -> {
			try {
				File file = new File(filename);
				File file2 = new File(filename2);

				AudioInputStream audio = AudioSystem.getAudioInputStream(file);
				AudioInputStream audio2 = AudioSystem.getAudioInputStream(file2);

				Clip clip = AudioSystem.getClip();
				clip.open(audio);
				clip.start();
				clip.addLineListener(event -> {
					if (event.getType() == LineEvent.Type.STOP) {
						SwingUtilities.invokeLater(() -> {
							cardLayout.show(panel, panelName);
							try {
								Clip clip2 = AudioSystem.getClip();
								clip2.open(audio2);
								clip2.start();
							} catch (Exception e) {
							}
						});
					}
				});
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		});
		thread.start();
	}

}
