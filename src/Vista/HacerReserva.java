package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.VuelosDestino;
import Controlador.VuelosOrigen;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class HacerReserva extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HacerReserva frame3 = new HacerReserva();
					frame3.setVisible(true);
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
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{29, 149, 87, 147, 26, 0};
		gbl_contentPane.rowHeights = new int[]{0, 30, 0, 0, 31, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblOrigen = new JLabel("Origen");
		lblOrigen.setForeground(new Color(255, 255, 255));
		lblOrigen.setFont(new Font("Rockwell", Font.BOLD, 18));
		GridBagConstraints gbc_lblOrigen = new GridBagConstraints();
		gbc_lblOrigen.insets = new Insets(0, 0, 5, 5);
		gbc_lblOrigen.gridx = 1;
		gbc_lblOrigen.gridy = 1;
		contentPane.add(lblOrigen, gbc_lblOrigen);
		
		JLabel lblDestino = new JLabel("Destino");
		lblDestino.setForeground(new Color(255, 255, 255));
		lblDestino.setFont(new Font("Rockwell", Font.BOLD, 18));
		GridBagConstraints gbc_lblDestino = new GridBagConstraints();
		gbc_lblDestino.insets = new Insets(0, 0, 5, 5);
		gbc_lblDestino.gridx = 3;
		gbc_lblDestino.gridy = 1;
		contentPane.add(lblDestino, gbc_lblDestino);
		
		VuelosOrigen vo = new VuelosOrigen();
		ArrayList <String> listadoVuelosOrigen =vo.vorigen();
		JComboBox origen = new JComboBox(listadoVuelosOrigen.toArray());
		
		
		GridBagConstraints gbc_origen = new GridBagConstraints();
		gbc_origen.insets = new Insets(0, 0, 5, 5);
		gbc_origen.fill = GridBagConstraints.HORIZONTAL;
		gbc_origen.gridx = 1;
		gbc_origen.gridy = 2;
		contentPane.add(origen, gbc_origen);
		
		VuelosDestino vd = new VuelosDestino();
		ArrayList <String> listadoVuelosDestino =vd.vdestino();
		
		JComboBox destino = new JComboBox(listadoVuelosDestino.toArray());
		GridBagConstraints gbc_destino = new GridBagConstraints();
		gbc_destino.insets = new Insets(0, 0, 5, 5);
		gbc_destino.fill = GridBagConstraints.HORIZONTAL;
		gbc_destino.gridx = 3;
		gbc_destino.gridy = 2;
		contentPane.add(destino, gbc_destino);
		
		JList list = new JList();
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.gridheight = 4;
		gbc_list.gridwidth = 3;
		gbc_list.insets = new Insets(0, 0, 5, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 1;
		gbc_list.gridy = 3;
		contentPane.add(list, gbc_list);
		
		JButton btnHacerReserva = new JButton("Hacer Reserva");
		GridBagConstraints gbc_btnHacerReserva = new GridBagConstraints();
		gbc_btnHacerReserva.insets = new Insets(0, 0, 5, 5);
		gbc_btnHacerReserva.gridx = 2;
		gbc_btnHacerReserva.gridy = 7;
		contentPane.add(btnHacerReserva, gbc_btnHacerReserva);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Principal window = new Principal();
				window.frame.setVisible(true);
			}

		
		});
		btnAtras.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_btnAtras = new GridBagConstraints();
		gbc_btnAtras.anchor = GridBagConstraints.WEST;
		gbc_btnAtras.insets = new Insets(0, 0, 0, 5);
		gbc_btnAtras.gridx = 1;
		gbc_btnAtras.gridy = 8;
		contentPane.add(btnAtras, gbc_btnAtras);
	}

}
