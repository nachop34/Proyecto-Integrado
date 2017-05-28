package Vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import Controlador.ConsultasReserva;
import Controlador.ControladorVuelos;
import Modelo.VueloModelo;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.awt.event.ActionEvent;
import java.awt.Color;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import Idiomas.Idioma;

import javax.swing.JCheckBox;

import java.awt.Toolkit;
import javax.swing.JTextField;


public class HacerReserva extends JFrame {

	private JPanel contentPane;
	JComboBox destino;
	JComboBox origen ;
	JTable table;
	ResourceBundle idioma;
	private JTextField textField;
	int idVuelo;
	String nombre;
	int plaza;
	
	public HacerReserva() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(HacerReserva.class.getResource("/Imagenes/plane.png")));
		setResizable(false);
		
		idioma = Idioma.getIdioma();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{29, 149, 87, 147, 26, 0};
		gbl_contentPane.rowHeights = new int[]{0, 30, 0, 45, 26, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 250));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 5;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 250));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridheight = 8;
		gbc_panel_1.insets = new Insets(0, 0, 0, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 1;
		contentPane.add(panel_1, gbc_panel_1);
		
		JLabel lblOrigen = new JLabel(idioma.getString("lblOrigen"));
		lblOrigen.setForeground(new Color(255, 255, 255));
		lblOrigen.setFont(new Font("Rockwell", Font.BOLD, 18));
		GridBagConstraints gbc_lblOrigen = new GridBagConstraints();
		gbc_lblOrigen.insets = new Insets(0, 0, 5, 5);
		gbc_lblOrigen.gridx = 1;
		gbc_lblOrigen.gridy = 1;
		contentPane.add(lblOrigen, gbc_lblOrigen);
		
		JLabel lblDestino = new JLabel(idioma.getString("lblDestino"));
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
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(135, 206, 250));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.gridheight = 8;
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 4;
		gbc_panel_2.gridy = 1;
		contentPane.add(panel_2, gbc_panel_2);
		
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
					String[] nombres = {"IDvuelo","Origen","Destino","H.Salida", "H.Llegada","Plazas"  };
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
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 3;
		contentPane.add(scrollPane, gbc_scrollPane);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(table);
		
		table.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
			public void valueChanged(ListSelectionEvent event) {
				if (event.getValueIsAdjusting())
				{
					int id = (int)table.getValueAt(table.getSelectedRow(), 0);
					System.out.println(id);
					idVuelo = id;
				}
			}
		});
				
		JButton btnSiguiente = new JButton(idioma.getString("btnSiguiente"));
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			plaza = plaza+1;
			ConsultasReserva.insertarReservas(null, nombre, plaza, idVuelo);
			System.out.println("Número de Plaza: "+plaza+", Pasajero: "+nombre+", Vuelo: "+idVuelo);
			PopUpReservaRealizada window = new PopUpReservaRealizada();
			window.frame11.setVisible(true);}
		});
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(135, 206, 250));
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.gridwidth = 3;
		gbc_panel_4.insets = new Insets(0, 0, 5, 5);
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 1;
		gbc_panel_4.gridy = 4;
		contentPane.add(panel_4, gbc_panel_4);
		
		JLabel lblNombre = new JLabel(idioma.getString("lblNombre"));
		lblNombre.setHorizontalAlignment(SwingConstants.LEFT);
		lblNombre.setFont(new Font("Rockwell", Font.BOLD, 14));
		lblNombre.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 5;
		contentPane.add(lblNombre, gbc_lblNombre);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 5;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		textField.addActionListener(new ActionListener() {
			   public void actionPerformed(ActionEvent e) {
			      System.out.println("Nombre introducido:");
			      System.out.println(((JTextField)e.getSource()).getText());
			      nombre = textField.getText();}
			});
		
		
		JButton btnAtras = new JButton(idioma.getString("btnAtrs"));
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Principal window = new Principal();
				window.frame.setVisible(true);
			}
		});
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(135, 206, 250));
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.gridwidth = 3;
		gbc_panel_5.insets = new Insets(0, 0, 5, 5);
		gbc_panel_5.fill = GridBagConstraints.BOTH;
		gbc_panel_5.gridx = 1;
		gbc_panel_5.gridy = 6;
		contentPane.add(panel_5, gbc_panel_5);
		
		btnAtras.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_btnAtras = new GridBagConstraints();
		gbc_btnAtras.anchor = GridBagConstraints.WEST;
		gbc_btnAtras.insets = new Insets(0, 0, 5, 5);
		gbc_btnAtras.gridx = 1;
		gbc_btnAtras.gridy = 7;
		contentPane.add(btnAtras, gbc_btnAtras);
		GridBagConstraints gbc_btnSiguiente = new GridBagConstraints();
		gbc_btnSiguiente.insets = new Insets(0, 0, 5, 5);
		gbc_btnSiguiente.gridx = 3;
		gbc_btnSiguiente.gridy = 7;
		contentPane.add(btnSiguiente, gbc_btnSiguiente);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(135, 206, 250));
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.gridwidth = 3;
		gbc_panel_3.insets = new Insets(0, 0, 0, 5);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 1;
		gbc_panel_3.gridy = 8;
		contentPane.add(panel_3, gbc_panel_3);
	}
}
