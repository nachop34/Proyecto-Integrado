package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Controlador.ControladorVuelos;
import Modelo.VueloModelo;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
//marquita
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;



import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class HacerReserva extends JFrame {

	private JPanel contentPane;
	JComboBox destino;
	JComboBox origen ;
	JTable table;

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
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
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
		
		ControladorVuelos vo = new ControladorVuelos();
		ArrayList <String> listadoVuelosOrigen =vo.vorigen();
	    origen = new JComboBox(listadoVuelosOrigen.toArray());
	    
		origen.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String origenSeleccionat = (String) origen.getSelectedItem();
				//Fer la consultaper al Desti
				ControladorVuelos vd = new ControladorVuelos();
				ArrayList <String> listadoDestinos =vd.vdestino(origenSeleccionat);
				
				//omplir el desplegable del destino amb els valors de l'arrayList
				DefaultComboBoxModel<String> dcbmodel=new DefaultComboBoxModel<String>();
				
				//destino.removeAllItems(); OJO que con esta salta el Listener del combobox destino!!!!!
				for(int i=0;i<listadoDestinos.size();i++){
					//destino.addItem((String)listadoDestinos.get(i));
					dcbmodel.addElement((String)listadoDestinos.get(i));
				}
				destino.setModel(dcbmodel);
			}
		});
		
		
		GridBagConstraints gbc_origen = new GridBagConstraints();
		gbc_origen.insets = new Insets(0, 0, 5, 5);
		gbc_origen.fill = GridBagConstraints.HORIZONTAL;
		gbc_origen.gridx = 1;
		gbc_origen.gridy = 2;
		contentPane.add(origen, gbc_origen);
		
		ControladorVuelos vd = new ControladorVuelos();
		ArrayList <String> listadoVuelosDestino =vd.vdestino();
		
		destino = new JComboBox(listadoVuelosDestino.toArray());
		destino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==destino){
					String destinoSeleccionat = (String) destino.getSelectedItem();
					String origenSeleccionat = (String) origen.getSelectedItem();
					if(destinoSeleccionat!=null && origenSeleccionat!=null){
					//Fer la consulta
					ControladorVuelos lt = new ControladorVuelos();
					ArrayList<VueloModelo> llistatVolsOrigen = lt.ltabla(origenSeleccionat, destinoSeleccionat);
					System.out.println(origenSeleccionat + destinoSeleccionat);
					//llenar la tabla
					String[] nombres = {"IDvuelo","Origen","Destino","H.Salida", "H.Llegada","Aerolinea"};
					DefaultTableModel table_modelo=new DefaultTableModel(nombres,0);
					
					table.setModel(table_modelo);
					
					//JTable table = new JTable(table_modelo);
					//table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
					
					Object[] fila = new Object[table_modelo.getColumnCount()];
					
					//Object[] fila = {1,"Valencia","Madrid","19:00","21:00","Ryanair"};
					//table_modelo.addRow(fila);
					
					for(int i=0;i<llistatVolsOrigen.size(); i++){
						fila[0] = llistatVolsOrigen.get(i).getIdVUELO();
						fila[1] = llistatVolsOrigen.get(i).getCOrigen();
						fila[2] = llistatVolsOrigen.get(i).getCDestino();
						fila[3] = llistatVolsOrigen.get(i).getHSalida();
						fila[4] = llistatVolsOrigen.get(i).getHLlegada();
						fila[5] = llistatVolsOrigen.get(i).getAerolinea();
						table_modelo.addRow(fila);
						
					}
					table.setModel(table_modelo);
					
					}else{
						JOptionPane.showMessageDialog(null, "Selecciona Origen y Destino", "Error", JOptionPane.ERROR_MESSAGE);
					}
					
					
						
					}
				
				
			}
		});
		GridBagConstraints gbc_destino = new GridBagConstraints();
		gbc_destino.insets = new Insets(0, 0, 5, 5);
		gbc_destino.fill = GridBagConstraints.HORIZONTAL;
		gbc_destino.gridx = 3;
		gbc_destino.gridy = 2;
		contentPane.add(destino, gbc_destino);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 4;
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 3;
		contentPane.add(scrollPane, gbc_scrollPane);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(table);
		
		//String[] nombres = {"IDvuelo","Origen","Destino","H.Salida", "H.Llegada","Aerolinea"};
		//DefaultTableModel table_modelo=new DefaultTableModel(nombres,0);
		//Object[] fila = {1,"Valencia","Madrid","19:00","21:00","Ryanair"};
		
		//table_modelo.addRow(fila);
		
		//table.setModel(table_modelo);
		
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
