package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class PopUpSinplazas {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PopUpSinplazas window = new PopUpSinplazas();
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
	public PopUpSinplazas() {
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
		gridBagLayout.columnWidths = new int[] {0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[] {0, 21, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblEsteVueloYa = new JLabel("Este vuelo ya no dispone de plazas");
		lblEsteVueloYa.setFont(new Font("Tahoma", Font.PLAIN, 21));
		GridBagConstraints gbc_lblEsteVueloYa = new GridBagConstraints();
		gbc_lblEsteVueloYa.insets = new Insets(0, 0, 5, 5);
		gbc_lblEsteVueloYa.gridx = 2;
		gbc_lblEsteVueloYa.gridy = 1;
		frame.getContentPane().add(lblEsteVueloYa, gbc_lblEsteVueloYa);
		
		JButton btnNewButton = new JButton("Aceptar");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.ABOVE_BASELINE;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 2;
		frame.getContentPane().add(btnNewButton, gbc_btnNewButton);
	}

}
