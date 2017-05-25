package Vista;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class PopUpSinplazas {

	private JFrame frame;
	ResourceBundle idioma;

	public PopUpSinplazas() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setType(Type.POPUP);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(PopUpSinplazas.class.getResource("/Imagenes/plane.png")));
		frame.getContentPane().setBackground(new Color(135, 206, 250));
		frame.setBounds(100, 100, 450, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[] {0, 0, 15, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblEsteVueloYa = new JLabel(idioma.getString("btnEsteVueloYa"));
		lblEsteVueloYa.setForeground(new Color(255, 255, 255));
		lblEsteVueloYa.setFont(new Font("Rockwell", Font.BOLD, 20));
		GridBagConstraints gbc_lblEsteVueloYa = new GridBagConstraints();
		gbc_lblEsteVueloYa.insets = new Insets(0, 0, 5, 5);
		gbc_lblEsteVueloYa.gridx = 2;
		gbc_lblEsteVueloYa.gridy = 1;
		frame.getContentPane().add(lblEsteVueloYa, gbc_lblEsteVueloYa);
		
		JButton btnAcept = new JButton(idioma.getString("btnAcept"));
		btnAcept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				frame.dispose();
				
			}
		});
		GridBagConstraints gbc_btnAcept = new GridBagConstraints();
		gbc_btnAcept.anchor = GridBagConstraints.ABOVE_BASELINE;
		gbc_btnAcept.insets = new Insets(0, 0, 5, 5);
		gbc_btnAcept.gridx = 2;
		gbc_btnAcept.gridy = 3;
		frame.getContentPane().add(btnAcept, gbc_btnAcept);
	}

}
