package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;

public class HacerReserva extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HacerReserva frame = new HacerReserva();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HacerReserva() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 109, 0, 68, 0, 82, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 30, 0, 0, 31, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblAerolnea = new JLabel("Aerol\u00EDnea");
		lblAerolnea.setFont(new Font("Rockwell", Font.BOLD, 18));
		GridBagConstraints gbc_lblAerolnea = new GridBagConstraints();
		gbc_lblAerolnea.insets = new Insets(0, 0, 5, 5);
		gbc_lblAerolnea.gridx = 1;
		gbc_lblAerolnea.gridy = 1;
		contentPane.add(lblAerolnea, gbc_lblAerolnea);
		
		JLabel lblOrigen = new JLabel("Origen");
		lblOrigen.setFont(new Font("Rockwell", Font.BOLD, 18));
		GridBagConstraints gbc_lblOrigen = new GridBagConstraints();
		gbc_lblOrigen.insets = new Insets(0, 0, 5, 5);
		gbc_lblOrigen.gridx = 3;
		gbc_lblOrigen.gridy = 1;
		contentPane.add(lblOrigen, gbc_lblOrigen);
		
		JLabel lblDestino = new JLabel("Destino");
		lblDestino.setFont(new Font("Rockwell", Font.BOLD, 18));
		GridBagConstraints gbc_lblDestino = new GridBagConstraints();
		gbc_lblDestino.insets = new Insets(0, 0, 5, 5);
		gbc_lblDestino.gridx = 5;
		gbc_lblDestino.gridy = 1;
		contentPane.add(lblDestino, gbc_lblDestino);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 3;
		contentPane.add(comboBox, gbc_comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 3;
		gbc_comboBox_1.gridy = 3;
		contentPane.add(comboBox_1, gbc_comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.gridx = 5;
		gbc_comboBox_2.gridy = 3;
		contentPane.add(comboBox_2, gbc_comboBox_2);
		
		JButton btnAtrs = new JButton("Atr\u00E1s");
		GridBagConstraints gbc_btnAtrs = new GridBagConstraints();
		gbc_btnAtrs.insets = new Insets(0, 0, 5, 5);
		gbc_btnAtrs.gridx = 1;
		gbc_btnAtrs.gridy = 7;
		contentPane.add(btnAtrs, gbc_btnAtrs);
		
		JButton btnHistoriograma = new JButton("Historiograma");
		GridBagConstraints gbc_btnHistoriograma = new GridBagConstraints();
		gbc_btnHistoriograma.insets = new Insets(0, 0, 5, 5);
		gbc_btnHistoriograma.gridx = 3;
		gbc_btnHistoriograma.gridy = 7;
		contentPane.add(btnHistoriograma, gbc_btnHistoriograma);
		
		JButton btnHacerReserva = new JButton("Hacer Reserva");
		GridBagConstraints gbc_btnHacerReserva = new GridBagConstraints();
		gbc_btnHacerReserva.insets = new Insets(0, 0, 5, 5);
		gbc_btnHacerReserva.gridx = 5;
		gbc_btnHacerReserva.gridy = 7;
		contentPane.add(btnHacerReserva, gbc_btnHacerReserva);
	}

}
