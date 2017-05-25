package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Idiomas.Idioma;

import java.awt.GridBagLayout;
import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Panel;

public class Principal extends JFrame implements ItemListener {

	private JPanel contentPane;
	static Idioma idioma;
	static Principal frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					idioma = new Idioma("Español");
					frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{30, 87, 32, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{30, 0, 30, 0, 30, 0, 30, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		Panel panel_4 = new Panel();
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.gridwidth = 5;
		gbc_panel_4.insets = new Insets(0, 0, 5, 0);
		gbc_panel_4.gridx = 1;
		gbc_panel_4.gridy = 0;
		contentPane.add(panel_4, gbc_panel_4);
		
		Panel panel_5 = new Panel();
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.insets = new Insets(0, 0, 5, 5);
		gbc_panel_5.gridx = 0;
		gbc_panel_5.gridy = 1;
		contentPane.add(panel_5, gbc_panel_5);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 1;
		contentPane.add(comboBox, gbc_comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Language", "Español", "English"}));
		comboBox.addItemListener(this);
		
		Panel panel_6 = new Panel();
		GridBagConstraints gbc_panel_6 = new GridBagConstraints();
		gbc_panel_6.gridwidth = 2;
		gbc_panel_6.insets = new Insets(0, 0, 5, 5);
		gbc_panel_6.gridx = 2;
		gbc_panel_6.gridy = 1;
		contentPane.add(panel_6, gbc_panel_6);
		
		JLabel lblMenu = new JLabel(idioma.getIdioma().getString("lblMenu"));
		lblMenu.setFont(new Font("Rockwell", Font.BOLD, 18));
		lblMenu.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblMenu = new GridBagConstraints();
		gbc_lblMenu.insets = new Insets(0, 0, 5, 5);
		gbc_lblMenu.gridx = 4;
		gbc_lblMenu.gridy = 1;
		contentPane.add(lblMenu, gbc_lblMenu);
		
		Panel panel_1 = new Panel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.gridx = 4;
		gbc_panel_1.gridy = 2;
		contentPane.add(panel_1, gbc_panel_1);
		
		JButton btnMostrarV = new JButton(idioma.getIdioma().getString("btnMostrarV"));
		GridBagConstraints gbc_btnMostrarV = new GridBagConstraints();
		gbc_btnMostrarV.insets = new Insets(0, 0, 5, 5);
		gbc_btnMostrarV.gridx = 4;
		gbc_btnMostrarV.gridy = 3;
		contentPane.add(btnMostrarV, gbc_btnMostrarV);
		
		btnMostrarV.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Mostrarvuelos window = new Mostrarvuelos();
				window.frame2.setVisible(true);
			}
		});;
		
		Panel panel = new Panel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.gridx = 4;
		gbc_panel.gridy = 4;
		contentPane.add(panel, gbc_panel);
		
		JButton btnHacerR = new JButton(idioma.getIdioma().getString("btnHacerR"));
		GridBagConstraints gbc_btnHacerR = new GridBagConstraints();
		gbc_btnHacerR.insets = new Insets(0, 0, 5, 5);
		gbc_btnHacerR.gridx = 4;
		gbc_btnHacerR.gridy = 5;
		contentPane.add(btnHacerR, gbc_btnHacerR);
		
		btnHacerR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				HacerReserva frame3 = new HacerReserva();
				frame3.setVisible(true);
			}
		});
		
		Panel panel_2 = new Panel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.gridx = 4;
		gbc_panel_2.gridy = 6;
		contentPane.add(panel_2, gbc_panel_2);
		
		JButton btnMostrarR = new JButton(idioma.getIdioma().getString("btnMostrarR"));
		GridBagConstraints gbc_btnMostrarR = new GridBagConstraints();
		gbc_btnMostrarR.insets = new Insets(0, 0, 5, 5);
		gbc_btnMostrarR.gridx = 4;
		gbc_btnMostrarR.gridy = 7;
		contentPane.add(btnMostrarR, gbc_btnMostrarR);
		
		btnMostrarR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				ReservasRealizadas window = new ReservasRealizadas();
				window.frame4.setVisible(true);
			}
		});
		
		Panel panel_3 = new Panel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.insets = new Insets(0, 0, 0, 5);
		gbc_panel_3.gridx = 4;
		gbc_panel_3.gridy = 8;
		contentPane.add(panel_3, gbc_panel_3);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if (e.getStateChange() == 1) {
			idioma = new Idioma((String)e.getItem());
			frame.setVisible(false);
			frame = new Principal();
			frame.setVisible(true);
		
		}
	}
}
