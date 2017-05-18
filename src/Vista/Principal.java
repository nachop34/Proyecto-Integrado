package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Principal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
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
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {30, 30, 30, 30, 30, 30, 30};
		gridBagLayout.rowHeights = new int[] {30, 0, 30, 0, 30, 0, 30, 30, 30};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblMenu = new JLabel("MENU PRINCIPAL");
		lblMenu.setFont(new Font("Rockwell", Font.BOLD, 18));
		GridBagConstraints gbc_lblMenu = new GridBagConstraints();
		gbc_lblMenu.insets = new Insets(0, 0, 5, 5);
		gbc_lblMenu.gridx = 3;
		gbc_lblMenu.gridy = 1;
		frame.getContentPane().add(lblMenu, gbc_lblMenu);
		
		JButton btnMostrarV = new JButton("Mostrar Vuelos");
		GridBagConstraints gbc_btnMostrarV = new GridBagConstraints();
		gbc_btnMostrarV.insets = new Insets(0, 0, 5, 5);
		gbc_btnMostrarV.gridx = 3;
		gbc_btnMostrarV.gridy = 3;
		frame.getContentPane().add(btnMostrarV, gbc_btnMostrarV);
		
		JButton btnHacerR = new JButton("Hacer Reserva");
		GridBagConstraints gbc_btnHacerR = new GridBagConstraints();
		gbc_btnHacerR.insets = new Insets(0, 0, 5, 5);
		gbc_btnHacerR.gridx = 3;
		gbc_btnHacerR.gridy = 5;
		frame.getContentPane().add(btnHacerR, gbc_btnHacerR);
		
		JButton btnMostrarR = new JButton("Mostrar Reserva Realizada");
		btnMostrarR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnMostrarR = new GridBagConstraints();
		gbc_btnMostrarR.insets = new Insets(0, 0, 5, 5);
		gbc_btnMostrarR.gridx = 3;
		gbc_btnMostrarR.gridy = 7;
		frame.getContentPane().add(btnMostrarR, gbc_btnMostrarR);
	}

}