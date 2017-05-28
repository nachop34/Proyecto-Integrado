package Vista;

import java.awt.Component;
import java.awt.Font;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import javax.swing.SwingConstants;

import Idiomas.Idioma;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;
import java.awt.event.ActionEvent;

public class PopUpReservaRealizada {

	JFrame frame11;
	ResourceBundle idioma;
	
	public PopUpReservaRealizada() {
		initialize();
	}

	private void initialize() {
		idioma = Idioma.getIdioma();
		frame11 = new JFrame();
		frame11.setIconImage(Toolkit.getDefaultToolkit().getImage(PopUpReservaRealizada.class.getResource("/Imagenes/plane.png")));
		frame11.getContentPane().setBackground(new Color(135, 206, 250));
		frame11.getContentPane().setForeground(new Color(135, 206, 250));
		frame11.setBounds(100, 100, 450, 150);
		frame11.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{64, 305, 37, 0};
		gridBagLayout.rowHeights = new int[]{28, 21, 33, 0, 23, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		frame11.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblSuReserva = new JLabel(idioma.getString("lblSuReserva"));
		lblSuReserva.setForeground(new Color(255, 255, 255));
		lblSuReserva.setFont(new Font("Rockwell", Font.BOLD, 17));
		lblSuReserva.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblSuReserva.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblSuReserva = new GridBagConstraints();
		gbc_lblSuReserva.insets = new Insets(0, 0, 5, 5);
		gbc_lblSuReserva.gridx = 1;
		gbc_lblSuReserva.gridy = 1;
		frame11.getContentPane().add(lblSuReserva, gbc_lblSuReserva);
		
		JButton btnAceptar = new JButton(idioma.getString("btnAceptar"));
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame11.dispose();
				
			}
		});
		btnAceptar.setAlignmentX(Component.CENTER_ALIGNMENT);
		GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
		gbc_btnAceptar.insets = new Insets(0, 0, 5, 5);
		gbc_btnAceptar.gridx = 1;
		gbc_btnAceptar.gridy = 3;
		frame11.getContentPane().add(btnAceptar, gbc_btnAceptar);
	}

}
