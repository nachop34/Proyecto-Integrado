package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;


import java.awt.Toolkit;

import javax.swing.JComboBox;



public class Principal {

	JFrame frame;

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
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Pablo\\Downloads\\SKYTEMAADVISORLOGO.PNG"));
		frame.getContentPane().setBackground(new Color(135, 206, 250));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();

		//gridBagLayout.columnWidths = new int[] {30, 30, 30, 30, 30, 30, 30};


		gridBagLayout.columnWidths = new int[] { 30, 30, 30, 30, 30, 30, 30 };
		gridBagLayout.rowHeights = new int[] { 30, 0, 30, 0, 30, 0, 30, 30, 30 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0 };
		frame.getContentPane().setLayout(gridBagLayout);


		gridBagLayout.columnWidths = new int[] {63, 30, 30, 30, 30, 30, 30};

		gridBagLayout.rowHeights = new int[] {30, 0, 30, 0, 30, 0, 30, 30, 30};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0};
		frame.getContentPane().setLayout(gridBagLayout);
		

		JLabel lblIdioma = new JLabel("Idioma");
		lblIdioma.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIdioma.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblIdioma = new GridBagConstraints();
		gbc_lblIdioma.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdioma.gridx = 0;
		gbc_lblIdioma.gridy = 0;
		frame.getContentPane().add(lblIdioma, gbc_lblIdioma);
		
		/*comboBox = new JComboBox();

		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Español", "English"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridx = 0;
		gbc_comboBox.gridy = 1;
		frame.getContentPane().add(comboBox, gbc_comboBox);
		*/


		JLabel lblMenu = new JLabel("MENU PRINCIPAL");
		lblMenu.setForeground(Color.WHITE);
		lblMenu.setFont(new Font("Rockwell", Font.BOLD, 18));
		GridBagConstraints gbc_lblMenu = new GridBagConstraints();
		gbc_lblMenu.insets = new Insets(0, 0, 5, 5);
		gbc_lblMenu.gridx = 3;
		gbc_lblMenu.gridy = 1;
		frame.getContentPane().add(lblMenu, gbc_lblMenu);

		JButton btnMostrarV = new JButton("Mostrar Vuelos");
		btnMostrarV.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Mostrarvuelos window = new Mostrarvuelos();
				window.frame2.setVisible(true);
			}
		});

		GridBagConstraints gbc_btnMostrarV = new GridBagConstraints();
		gbc_btnMostrarV.insets = new Insets(0, 0, 5, 5);
		gbc_btnMostrarV.gridx = 3;
		gbc_btnMostrarV.gridy = 3;
		frame.getContentPane().add(btnMostrarV, gbc_btnMostrarV);

		JButton btnMostrarR = new JButton("Ver Reservas Realizadas");
		btnMostrarR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				ReservasRealizadas window = new ReservasRealizadas();
				window.frame4.setVisible(true);
			}
		});

		JButton btnHacerR = new JButton("Hacer Reserva");
		btnHacerR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				HacerReserva frame3 = new HacerReserva();
				frame3.setVisible(true);
			}
		});
		GridBagConstraints gbc_btnHacerR = new GridBagConstraints();
		gbc_btnHacerR.insets = new Insets(0, 0, 5, 5);
		gbc_btnHacerR.gridx = 3;
		gbc_btnHacerR.gridy = 5;
		frame.getContentPane().add(btnHacerR, gbc_btnHacerR);
		GridBagConstraints gbc_btnMostrarR = new GridBagConstraints();
		gbc_btnMostrarR.insets = new Insets(0, 0, 5, 5);
		gbc_btnMostrarR.gridx = 3;
		gbc_btnMostrarR.gridy = 7;
		frame.getContentPane().add(btnMostrarR, gbc_btnMostrarR);

	}


}