package app.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JButton;

public class View extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public View() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 128));
		panel.setBounds(10, 10, 1256, 673);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel gameTitle = new JLabel("BUS MANAGER 2025");
		gameTitle.setHorizontalAlignment(SwingConstants.CENTER);;
		gameTitle.setBounds(114, 141, 1028, 102);
		gameTitle.setFont(new Font("Miedinger Medium W00 Regular", Font.PLAIN, 50));
		panel.add(gameTitle);
		
		JButton btnNewGame = new JButton("New Game");
		btnNewGame.setBounds(567, 287, 122, 21);
		btnNewGame.setFont(new Font("SpecialGothicExpandedOne-Regular", Font.PLAIN, 15));
		panel.add(btnNewGame);
		
		JButton btnLoadGame = new JButton("Load Game");
		btnLoadGame.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnLoadGame.setBounds(567, 371, 122, 21);
		panel.add(btnLoadGame);
	}
}
