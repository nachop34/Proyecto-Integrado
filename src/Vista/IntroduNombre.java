package Vista;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Toolkit;
import java.awt.Window.Type;

public class IntroduNombre {

	JFrame frame8;
	private JTextField textField;

	
	public IntroduNombre() {
		initialize();
	}

	private void initialize() {
		frame8 = new JFrame();
		frame8.setResizable(false);
		frame8.setType(Type.POPUP);
		frame8.setIconImage(Toolkit.getDefaultToolkit().getImage(IntroduNombre.class.getResource("/Imagenes/plane.png")));
		frame8.getContentPane().setBackground(new Color(135, 206, 250));
		frame8.setBounds(100, 100, 450, 150);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 308, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 54, 0, 71, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame8.getContentPane().setLayout(gridBagLayout);
		
		JButton btnNewButton = new JButton("Atr\u00E1s");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame8.dispose();
				Histograma window = new Histograma();
				window.frmSeleccionDePlaza.setVisible(true);
			}
		});
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_1 = new GridBagConstraints();
		gbc_verticalStrut_1.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_1.gridx = 2;
		gbc_verticalStrut_1.gridy = 1;
		frame8.getContentPane().add(verticalStrut_1, gbc_verticalStrut_1);
		
		JLabel lblIntroduceTuNombre = new JLabel("Introduce tu nombre:");
		lblIntroduceTuNombre.setForeground(new Color(255, 255, 255));
		lblIntroduceTuNombre.setFont(new Font("Rockwell", Font.BOLD, 23));
		GridBagConstraints gbc_lblIntroduceTuNombre = new GridBagConstraints();
		gbc_lblIntroduceTuNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblIntroduceTuNombre.gridx = 2;
		gbc_lblIntroduceTuNombre.gridy = 2;
		frame8.getContentPane().add(lblIntroduceTuNombre, gbc_lblIntroduceTuNombre);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
		gbc_verticalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut.gridx = 2;
		gbc_verticalStrut.gridy = 3;
		frame8.getContentPane().add(verticalStrut, gbc_verticalStrut);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 4;
		frame8.getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_2 = new GridBagConstraints();
		gbc_verticalStrut_2.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_2.gridx = 1;
		gbc_verticalStrut_2.gridy = 5;
		frame8.getContentPane().add(verticalStrut_2, gbc_verticalStrut_2);
		
		Component verticalStrut_3 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_3 = new GridBagConstraints();
		gbc_verticalStrut_3.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_3.gridx = 3;
		gbc_verticalStrut_3.gridy = 5;
		frame8.getContentPane().add(verticalStrut_3, gbc_verticalStrut_3);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
		gbc_horizontalStrut.insets = new Insets(0, 0, 0, 5);
		gbc_horizontalStrut.gridx = 0;
		gbc_horizontalStrut.gridy = 6;
		frame8.getContentPane().add(horizontalStrut, gbc_horizontalStrut);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 6;
		frame8.getContentPane().add(btnNewButton, gbc_btnNewButton);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame8.dispose();
				HacerReserva window = new HacerReserva();
				window.setVisible(true);
			}
		});
		GridBagConstraints gbc_btnSiguiente = new GridBagConstraints();
		gbc_btnSiguiente.insets = new Insets(0, 0, 0, 5);
		gbc_btnSiguiente.gridx = 3;
		gbc_btnSiguiente.gridy = 6;
		frame8.getContentPane().add(btnSiguiente, gbc_btnSiguiente);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_1 = new GridBagConstraints();
		gbc_horizontalStrut_1.gridx = 4;
		gbc_horizontalStrut_1.gridy = 6;
		frame8.getContentPane().add(horizontalStrut_1, gbc_horizontalStrut_1);
		frame8.setBounds(100, 100, 590, 380);
		frame8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
