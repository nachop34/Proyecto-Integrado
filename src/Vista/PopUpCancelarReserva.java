package Vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Idiomas.Idioma;

import java.awt.Component;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class PopUpCancelarReserva {

	JFrame frame;
	ResourceBundle idioma;

	public PopUpCancelarReserva() {
		initialize();
	}

	private void initialize() {
		idioma = Idioma.getIdioma();
		frame = new JFrame();
		frame.setType(Type.POPUP);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(PopUpCancelarReserva.class.getResource("/Imagenes/plane.png")));
		frame.getContentPane().setBackground(new Color(135, 206, 250));
		frame.setBounds(100, 100, 450, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{227, 0};
		gridBagLayout.rowHeights = new int[]{25, 0, 0, 0, 23, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblRCancelada = new JLabel(idioma.getString("lblRCancelada"));
		lblRCancelada.setForeground(new Color(255, 255, 255));
		lblRCancelada.setFont(new Font("Rockwell", Font.BOLD, 21));
		lblRCancelada.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblRCancelada.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblRCancelada = new GridBagConstraints();
		gbc_lblRCancelada.insets = new Insets(0, 0, 5, 0);
		gbc_lblRCancelada.gridx = 0;
		gbc_lblRCancelada.gridy = 1;
		frame.getContentPane().add(lblRCancelada, gbc_lblRCancelada);
		
		JButton btnAceptar2 = new JButton(idioma.getString("btnAceptar2"));
		btnAceptar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				
			}
		});
		btnAceptar2.setAlignmentX(Component.CENTER_ALIGNMENT);
		GridBagConstraints gbc_btnAceptar2 = new GridBagConstraints();
		gbc_btnAceptar2.insets = new Insets(0, 0, 5, 0);
		gbc_btnAceptar2.gridx = 0;
		gbc_btnAceptar2.gridy = 3;
		frame.getContentPane().add(btnAceptar2, gbc_btnAceptar2);
	}

}
