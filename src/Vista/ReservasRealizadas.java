package Vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Component;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import Controlador.ConsultasReserva;
import Idiomas.Idioma;
import Modelo.ReservaModelo;

import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JTable;
import java.awt.Toolkit;

public class ReservasRealizadas {

	JFrame frame4;
	private JTable table;
	ResourceBundle idioma;

	public ReservasRealizadas() {
		initialize();
	}

	private void initialize() {
		idioma = Idioma.getIdioma();
		ConsultasReserva rv = new ConsultasReserva();
		frame4 = new JFrame();
		frame4.setIconImage(Toolkit.getDefaultToolkit().getImage(ReservasRealizadas.class.getResource("/Imagenes/plane.png")));
		frame4.getContentPane().setBackground(new Color(135, 206, 250));
		frame4.setBounds(100, 100, 450, 300);
		frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 233, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 28, 23, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		frame4.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblRRealizadas = new JLabel(idioma.getString("lblRRealizadas"));
		lblRRealizadas.setForeground(Color.WHITE);
		lblRRealizadas.setVerticalAlignment(SwingConstants.CENTER);
		lblRRealizadas.setHorizontalAlignment(SwingConstants.CENTER);
		lblRRealizadas.setAlignmentY(Component.CENTER_ALIGNMENT);
		lblRRealizadas.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblRRealizadas.setFont(new Font("Rockwell", Font.BOLD, 23));
		GridBagConstraints gbc_lblRRealizadas = new GridBagConstraints();
		gbc_lblRRealizadas.insets = new Insets(0, 0, 5, 5);
		gbc_lblRRealizadas.gridx = 1;
		gbc_lblRRealizadas.gridy = 1;
		frame4.getContentPane().add(lblRRealizadas, gbc_lblRRealizadas);
		
		JButton btnCancelar = new JButton(idioma.getString("btnCancelar"));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame4.dispose();
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;

		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 3;
		frame4.getContentPane().add(scrollPane, gbc_scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		ArrayList<ReservaModelo> tabla = rv.mostrarReservas();
		
		DefaultTableModel model = new DefaultTableModel(new Object[]{"ID Reserva", "Pasajero", "Plaza", "ID Vuelo"},0);
		
			for (int i=0;i<tabla.size();i++){
				model.addRow(new Object[]{tabla.get(i).getIdReserva(), tabla.get(i).getPasajero(),
						tabla.get(i).getPlaza(), tabla.get(i).getIdVuelo()});
			}
		table.setModel(model);
		
		btnCancelar.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancelar.gridx = 1;
		gbc_btnCancelar.gridy = 4;
		frame4.getContentPane().add(btnCancelar, gbc_btnCancelar);
		
		JButton btnAtrs2 = new JButton(idioma.getString("btnAtrs2"));
		btnAtrs2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame4.dispose();
				Principal window = new Principal();
				window.frame.setVisible(true);
			}
		});
		GridBagConstraints gbc_btnAtrs2 = new GridBagConstraints();
		gbc_btnAtrs2.insets = new Insets(0, 0, 0, 5);
		gbc_btnAtrs2.gridx = 0;
		gbc_btnAtrs2.gridy = 5;
		frame4.getContentPane().add(btnAtrs2, gbc_btnAtrs2);
	}
}