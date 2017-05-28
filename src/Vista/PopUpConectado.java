package Vista;


import javax.swing.JFrame;
import java.awt.GridBagLayout;

import Idiomas.Idioma;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Window.Type;
import java.util.ResourceBundle;

public class PopUpConectado {

	private JFrame frame10;
	ResourceBundle idioma;

	public PopUpConectado() {
		initialize();
	}

	private void initialize() {
		idioma = Idioma.getIdioma();
		frame10 = new JFrame();
		frame10.setType(Type.POPUP);
		frame10.setResizable(false);
		frame10.getContentPane().setBackground(new Color(135, 206, 250));
		frame10.setBounds(100, 100, 450, 150);
		frame10.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		frame10.getContentPane().setLayout(gridBagLayout);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 250));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 0;
		frame10.getContentPane().add(panel, gbc_panel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(135, 206, 250));
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.gridheight = 3;
		gbc_panel_3.insets = new Insets(0, 0, 5, 5);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 1;
		frame10.getContentPane().add(panel_3, gbc_panel_3);
		
		JLabel lblSeHaLogueado = new JLabel(idioma.getString("lblSeHaLogueado"));
		lblSeHaLogueado.setForeground(Color.WHITE);
		lblSeHaLogueado.setFont(new Font("Rockwell", Font.BOLD, 18));
		GridBagConstraints gbc_lblSeHaLogueado = new GridBagConstraints();
		gbc_lblSeHaLogueado.insets = new Insets(0, 0, 5, 5);
		gbc_lblSeHaLogueado.gridx = 1;
		gbc_lblSeHaLogueado.gridy = 1;
		frame10.getContentPane().add(lblSeHaLogueado, gbc_lblSeHaLogueado);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(135, 206, 250));
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.gridheight = 3;
		gbc_panel_4.insets = new Insets(0, 0, 5, 0);
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 2;
		gbc_panel_4.gridy = 1;
		frame10.getContentPane().add(panel_4, gbc_panel_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 250));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 2;
		frame10.getContentPane().add(panel_1, gbc_panel_1);
		
		JButton btnAceptar3 = new JButton(idioma.getString("btnAceptar3"));
		GridBagConstraints gbc_btnAceptar3 = new GridBagConstraints();
		gbc_btnAceptar3.insets = new Insets(0, 0, 5, 5);
		gbc_btnAceptar3.gridx = 1;
		gbc_btnAceptar3.gridy = 3;
		frame10.getContentPane().add(btnAceptar3, gbc_btnAceptar3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(135, 206, 250));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 0, 5);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 4;
		frame10.getContentPane().add(panel_2, gbc_panel_2);
	}

}
