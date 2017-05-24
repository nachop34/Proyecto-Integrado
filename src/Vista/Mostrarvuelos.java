package Vista;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import Controlador.ConsultasVuelo;
import Modelo.VueloModelo;

import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JTable;
import java.awt.Toolkit;

public class Mostrarvuelos {

	JFrame frame2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mostrarvuelos window = new Mostrarvuelos();
					window.frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Mostrarvuelos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ConsultasVuelo cv = new ConsultasVuelo();
		frame2 = new JFrame();
		frame2.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Pablo\\Downloads\\SKYTEMAADVISORLOGO.PNG"));
		frame2.getContentPane().setBackground(new Color(135, 206, 250));
		frame2.setBounds(100, 100, 450, 300);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 233, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 28, 23, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		frame2.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Vuelos Disponibles");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setVerticalAlignment(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setAlignmentY(Component.CENTER_ALIGNMENT);
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 23));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		frame2.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 3;
		frame2.getContentPane().add(scrollPane, gbc_scrollPane);
		
		table = new JTable();
		table.setEnabled(false);
		scrollPane.setViewportView(table);
		ArrayList<VueloModelo> tabla = cv.mostrarVuelos();
		
		DefaultTableModel model = new DefaultTableModel(new Object[]{"Aerolinea", "ID Vuelo", "Origen", "Destino", 
				"Hora Salida", "Hora Llegada"},0);
		
			for (int i=0;i<tabla.size();i++){
				model.addRow(new Object[]{tabla.get(i).getAerolinea(), tabla.get(i).getIdVUELO(), tabla.get(i).getCOrigen(),
						tabla.get(i).getCDestino(), tabla.get(i).getHSalida(), tabla.get(i).getHLlegada()});
			}
		table.setModel(model);
		
		
		JButton btnAtrs = new JButton("Atr\u00E1s");
		btnAtrs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame2.dispose();
				Principal window = new Principal();
				window.frame.setVisible(true);
				
			}
		});
		GridBagConstraints gbc_btnAtrs = new GridBagConstraints();
		gbc_btnAtrs.insets = new Insets(0, 0, 0, 5);
		gbc_btnAtrs.gridx = 0;
		gbc_btnAtrs.gridy = 5;
		frame2.getContentPane().add(btnAtrs, gbc_btnAtrs);
	}
}