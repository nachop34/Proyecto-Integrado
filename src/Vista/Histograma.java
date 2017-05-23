package Vista;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Toolkit;
import javax.swing.JPanel;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Histograma {

	private JFrame frmSeleccionDePlaza;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Histograma window = new Histograma();
					window.frmSeleccionDePlaza.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	
	public Histograma() {
		initialize();

	}

	
	private void initialize() {
		frmSeleccionDePlaza = new JFrame();
		frmSeleccionDePlaza.getContentPane().setBackground(new Color(255, 255, 225));
		frmSeleccionDePlaza.setBackground(Color.YELLOW);
		frmSeleccionDePlaza.setForeground(Color.YELLOW);
		frmSeleccionDePlaza.setTitle("Seleccion de plaza");
		frmSeleccionDePlaza.setBounds(100, 100,1000, 637);
		frmSeleccionDePlaza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frmSeleccionDePlaza.new ImageIcon("C:\\Users\\Pablo\\Desktop\\background.png");
		
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {40, 33, 34, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30};
		gridBagLayout.rowHeights = new int[] {0, 30, 30, 90, 86, 46, 81, 83, 0, 0, 30};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE,Double.MIN_VALUE,
				Double.MIN_VALUE,Double.MIN_VALUE,Double.MIN_VALUE,Double.MIN_VALUE,Double.MIN_VALUE,
				Double.MIN_VALUE,Double.MIN_VALUE,Double.MIN_VALUE,Double.MIN_VALUE,Double.MIN_VALUE,
				Double.MIN_VALUE,Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE,Double.MIN_VALUE,
				Double.MIN_VALUE,Double.MIN_VALUE,Double.MIN_VALUE,Double.MIN_VALUE, 0.0, 0.0, 0.0,Double.MIN_VALUE};
		frmSeleccionDePlaza.getContentPane().setLayout(gridBagLayout);
		
	
		
		JLabel titol = new JLabel("Avions S.L");
		titol.setFont(new Font("Tahoma", Font.BOLD, 30));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 6;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 7;
		gbc_lblNewLabel.gridy = 1;
		frmSeleccionDePlaza.getContentPane().add(titol, gbc_lblNewLabel);
		
		JLabel lblV = new JLabel("V");
		lblV.setFont(new Font("Rockwell", Font.BOLD, 36));
		GridBagConstraints gbc_lblV = new GridBagConstraints();
		gbc_lblV.insets = new Insets(0, 0, 5, 5);
		gbc_lblV.gridx = 2;
		gbc_lblV.gridy = 3;
		frmSeleccionDePlaza.getContentPane().add(lblV, gbc_lblV);
		
		JButton btnNewButton = new JButton("3");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 3;
		gbc_btnNewButton.gridy = 3;
		frmSeleccionDePlaza.getContentPane().add(btnNewButton, gbc_btnNewButton);
		
		JButton button = new JButton("7");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 4;
		gbc_button.gridy = 3;
		frmSeleccionDePlaza.getContentPane().add(button, gbc_button);
		
		JButton button_1 = new JButton("11");
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 5;
		gbc_button_1.gridy = 3;
		frmSeleccionDePlaza.getContentPane().add(button_1, gbc_button_1);
		
		JButton button_2 = new JButton("15");
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.insets = new Insets(0, 0, 5, 5);
		gbc_button_2.gridx = 6;
		gbc_button_2.gridy = 3;
		frmSeleccionDePlaza.getContentPane().add(button_2, gbc_button_2);
		
		JButton button_3 = new JButton("19");
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.insets = new Insets(0, 0, 5, 5);
		gbc_button_3.gridx = 7;
		gbc_button_3.gridy = 3;
		frmSeleccionDePlaza.getContentPane().add(button_3, gbc_button_3);
		
		JButton button_4 = new JButton("23");
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.insets = new Insets(0, 0, 5, 5);
		gbc_button_4.gridx = 8;
		gbc_button_4.gridy = 3;
		frmSeleccionDePlaza.getContentPane().add(button_4, gbc_button_4);
		
		JButton button_5 = new JButton("27");
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.insets = new Insets(0, 0, 5, 5);
		gbc_button_5.gridx = 9;
		gbc_button_5.gridy = 3;
		frmSeleccionDePlaza.getContentPane().add(button_5, gbc_button_5);
		
		JButton button_6 = new JButton("31");
		GridBagConstraints gbc_button_6 = new GridBagConstraints();
		gbc_button_6.insets = new Insets(0, 0, 5, 5);
		gbc_button_6.gridx = 10;
		gbc_button_6.gridy = 3;
		frmSeleccionDePlaza.getContentPane().add(button_6, gbc_button_6);
		
		JButton button_7 = new JButton("35");
		GridBagConstraints gbc_button_7 = new GridBagConstraints();
		gbc_button_7.insets = new Insets(0, 0, 5, 5);
		gbc_button_7.gridx = 11;
		gbc_button_7.gridy = 3;
		frmSeleccionDePlaza.getContentPane().add(button_7, gbc_button_7);
		
		JButton button_8 = new JButton("39");
		GridBagConstraints gbc_button_8 = new GridBagConstraints();
		gbc_button_8.insets = new Insets(0, 0, 5, 5);
		gbc_button_8.gridx = 12;
		gbc_button_8.gridy = 3;
		frmSeleccionDePlaza.getContentPane().add(button_8, gbc_button_8);
		
		JButton button_9 = new JButton("43");
		GridBagConstraints gbc_button_9 = new GridBagConstraints();
		gbc_button_9.insets = new Insets(0, 0, 5, 5);
		gbc_button_9.gridx = 13;
		gbc_button_9.gridy = 3;
		frmSeleccionDePlaza.getContentPane().add(button_9, gbc_button_9);
		
		JButton button_10 = new JButton("47");
		GridBagConstraints gbc_button_10 = new GridBagConstraints();
		gbc_button_10.insets = new Insets(0, 0, 5, 5);
		gbc_button_10.gridx = 14;
		gbc_button_10.gridy = 3;
		frmSeleccionDePlaza.getContentPane().add(button_10, gbc_button_10);
		
		JButton button_11 = new JButton("51");
		GridBagConstraints gbc_button_11 = new GridBagConstraints();
		gbc_button_11.insets = new Insets(0, 0, 5, 0);
		gbc_button_11.gridx = 15;
		gbc_button_11.gridy = 3;
		frmSeleccionDePlaza.getContentPane().add(button_11, gbc_button_11);
		
		JLabel lblP = new JLabel("P");
		lblP.setFont(new Font("Rockwell", Font.BOLD, 36));
		GridBagConstraints gbc_lblP = new GridBagConstraints();
		gbc_lblP.insets = new Insets(0, 0, 5, 5);
		gbc_lblP.gridx = 2;
		gbc_lblP.gridy = 4;
		frmSeleccionDePlaza.getContentPane().add(lblP, gbc_lblP);
		
		JButton button_12 = new JButton("4");
		GridBagConstraints gbc_button_12 = new GridBagConstraints();
		gbc_button_12.insets = new Insets(0, 0, 5, 5);
		gbc_button_12.gridx = 3;
		gbc_button_12.gridy = 4;
		frmSeleccionDePlaza.getContentPane().add(button_12, gbc_button_12);
		
		JButton button_13 = new JButton("8");
		GridBagConstraints gbc_button_13 = new GridBagConstraints();
		gbc_button_13.insets = new Insets(0, 0, 5, 5);
		gbc_button_13.gridx = 4;
		gbc_button_13.gridy = 4;
		frmSeleccionDePlaza.getContentPane().add(button_13, gbc_button_13);
		
		JButton button_14 = new JButton("12");
		GridBagConstraints gbc_button_14 = new GridBagConstraints();
		gbc_button_14.insets = new Insets(0, 0, 5, 5);
		gbc_button_14.gridx = 5;
		gbc_button_14.gridy = 4;
		frmSeleccionDePlaza.getContentPane().add(button_14, gbc_button_14);
		
		JButton button_15 = new JButton("16");
		GridBagConstraints gbc_button_15 = new GridBagConstraints();
		gbc_button_15.insets = new Insets(0, 0, 5, 5);
		gbc_button_15.gridx = 6;
		gbc_button_15.gridy = 4;
		frmSeleccionDePlaza.getContentPane().add(button_15, gbc_button_15);
		
		JButton button_16 = new JButton("20");
		GridBagConstraints gbc_button_16 = new GridBagConstraints();
		gbc_button_16.insets = new Insets(0, 0, 5, 5);
		gbc_button_16.gridx = 7;
		gbc_button_16.gridy = 4;
		frmSeleccionDePlaza.getContentPane().add(button_16, gbc_button_16);
		
		JButton button_17 = new JButton("24");
		GridBagConstraints gbc_button_17 = new GridBagConstraints();
		gbc_button_17.insets = new Insets(0, 0, 5, 5);
		gbc_button_17.gridx = 8;
		gbc_button_17.gridy = 4;
		frmSeleccionDePlaza.getContentPane().add(button_17, gbc_button_17);
		
		JButton button_18 = new JButton("28");
		GridBagConstraints gbc_button_18 = new GridBagConstraints();
		gbc_button_18.insets = new Insets(0, 0, 5, 5);
		gbc_button_18.gridx = 9;
		gbc_button_18.gridy = 4;
		frmSeleccionDePlaza.getContentPane().add(button_18, gbc_button_18);
		
		JButton button_19 = new JButton("32");
		GridBagConstraints gbc_button_19 = new GridBagConstraints();
		gbc_button_19.insets = new Insets(0, 0, 5, 5);
		gbc_button_19.gridx = 10;
		gbc_button_19.gridy = 4;
		frmSeleccionDePlaza.getContentPane().add(button_19, gbc_button_19);
		
		JButton button_20 = new JButton("36");
		GridBagConstraints gbc_button_20 = new GridBagConstraints();
		gbc_button_20.insets = new Insets(0, 0, 5, 5);
		gbc_button_20.gridx = 11;
		gbc_button_20.gridy = 4;
		frmSeleccionDePlaza.getContentPane().add(button_20, gbc_button_20);
		
		JButton button_21 = new JButton("40");
		GridBagConstraints gbc_button_21 = new GridBagConstraints();
		gbc_button_21.insets = new Insets(0, 0, 5, 5);
		gbc_button_21.gridx = 12;
		gbc_button_21.gridy = 4;
		frmSeleccionDePlaza.getContentPane().add(button_21, gbc_button_21);
		
		JButton button_22 = new JButton("44");
		GridBagConstraints gbc_button_22 = new GridBagConstraints();
		gbc_button_22.insets = new Insets(0, 0, 5, 5);
		gbc_button_22.gridx = 13;
		gbc_button_22.gridy = 4;
		frmSeleccionDePlaza.getContentPane().add(button_22, gbc_button_22);
		
		JButton button_23 = new JButton("48");
		GridBagConstraints gbc_button_23 = new GridBagConstraints();
		gbc_button_23.insets = new Insets(0, 0, 5, 5);
		gbc_button_23.gridx = 14;
		gbc_button_23.gridy = 4;
		frmSeleccionDePlaza.getContentPane().add(button_23, gbc_button_23);
		
		JButton button_24 = new JButton("52");
		GridBagConstraints gbc_button_24 = new GridBagConstraints();
		gbc_button_24.insets = new Insets(0, 0, 5, 0);
		gbc_button_24.gridx = 15;
		gbc_button_24.gridy = 4;
		frmSeleccionDePlaza.getContentPane().add(button_24, gbc_button_24);
		
		JLabel lblV_1 = new JLabel("P");
		lblV_1.setFont(new Font("Rockwell", Font.BOLD, 36));
		GridBagConstraints gbc_lblV_1 = new GridBagConstraints();
		gbc_lblV_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblV_1.gridx = 2;
		gbc_lblV_1.gridy = 6;
		frmSeleccionDePlaza.getContentPane().add(lblV_1, gbc_lblV_1);
		
		JButton button_25 = new JButton("2");
		GridBagConstraints gbc_button_25 = new GridBagConstraints();
		gbc_button_25.insets = new Insets(0, 0, 5, 5);
		gbc_button_25.gridx = 3;
		gbc_button_25.gridy = 6;
		frmSeleccionDePlaza.getContentPane().add(button_25, gbc_button_25);
		
		JButton button_26 = new JButton("6");
		GridBagConstraints gbc_button_26 = new GridBagConstraints();
		gbc_button_26.insets = new Insets(0, 0, 5, 5);
		gbc_button_26.gridx = 4;
		gbc_button_26.gridy = 6;
		frmSeleccionDePlaza.getContentPane().add(button_26, gbc_button_26);
		
		JButton button_27 = new JButton("10");
		GridBagConstraints gbc_button_27 = new GridBagConstraints();
		gbc_button_27.insets = new Insets(0, 0, 5, 5);
		gbc_button_27.gridx = 5;
		gbc_button_27.gridy = 6;
		frmSeleccionDePlaza.getContentPane().add(button_27, gbc_button_27);
		
		JButton button_28 = new JButton("14");
		GridBagConstraints gbc_button_28 = new GridBagConstraints();
		gbc_button_28.insets = new Insets(0, 0, 5, 5);
		gbc_button_28.gridx = 6;
		gbc_button_28.gridy = 6;
		frmSeleccionDePlaza.getContentPane().add(button_28, gbc_button_28);
		
		JButton button_29 = new JButton("18");
		GridBagConstraints gbc_button_29 = new GridBagConstraints();
		gbc_button_29.insets = new Insets(0, 0, 5, 5);
		gbc_button_29.gridx = 7;
		gbc_button_29.gridy = 6;
		frmSeleccionDePlaza.getContentPane().add(button_29, gbc_button_29);
		
		JButton button_30 = new JButton("22");
		GridBagConstraints gbc_button_30 = new GridBagConstraints();
		gbc_button_30.insets = new Insets(0, 0, 5, 5);
		gbc_button_30.gridx = 8;
		gbc_button_30.gridy = 6;
		frmSeleccionDePlaza.getContentPane().add(button_30, gbc_button_30);
		
		JButton button_31 = new JButton("26");
		GridBagConstraints gbc_button_31 = new GridBagConstraints();
		gbc_button_31.insets = new Insets(0, 0, 5, 5);
		gbc_button_31.gridx = 9;
		gbc_button_31.gridy = 6;
		frmSeleccionDePlaza.getContentPane().add(button_31, gbc_button_31);
		
		JButton button_32 = new JButton("30");
		GridBagConstraints gbc_button_32 = new GridBagConstraints();
		gbc_button_32.insets = new Insets(0, 0, 5, 5);
		gbc_button_32.gridx = 10;
		gbc_button_32.gridy = 6;
		frmSeleccionDePlaza.getContentPane().add(button_32, gbc_button_32);
		
		JButton button_33 = new JButton("34");
		GridBagConstraints gbc_button_33 = new GridBagConstraints();
		gbc_button_33.insets = new Insets(0, 0, 5, 5);
		gbc_button_33.gridx = 11;
		gbc_button_33.gridy = 6;
		frmSeleccionDePlaza.getContentPane().add(button_33, gbc_button_33);
		
		JButton button_34 = new JButton("38");
		GridBagConstraints gbc_button_34 = new GridBagConstraints();
		gbc_button_34.insets = new Insets(0, 0, 5, 5);
		gbc_button_34.gridx = 12;
		gbc_button_34.gridy = 6;
		frmSeleccionDePlaza.getContentPane().add(button_34, gbc_button_34);
		
		JButton button_35 = new JButton("42");
		GridBagConstraints gbc_button_35 = new GridBagConstraints();
		gbc_button_35.insets = new Insets(0, 0, 5, 5);
		gbc_button_35.gridx = 13;
		gbc_button_35.gridy = 6;
		frmSeleccionDePlaza.getContentPane().add(button_35, gbc_button_35);
		
		JButton button_36 = new JButton("46");
		GridBagConstraints gbc_button_36 = new GridBagConstraints();
		gbc_button_36.insets = new Insets(0, 0, 5, 5);
		gbc_button_36.gridx = 14;
		gbc_button_36.gridy = 6;
		frmSeleccionDePlaza.getContentPane().add(button_36, gbc_button_36);
		
		JButton button_37 = new JButton("50");
		GridBagConstraints gbc_button_37 = new GridBagConstraints();
		gbc_button_37.insets = new Insets(0, 0, 5, 0);
		gbc_button_37.gridx = 15;
		gbc_button_37.gridy = 6;
		frmSeleccionDePlaza.getContentPane().add(button_37, gbc_button_37);
		
		JLabel lblV_2 = new JLabel("V");
		lblV_2.setFont(new Font("Rockwell", Font.BOLD, 36));
		GridBagConstraints gbc_lblV_2 = new GridBagConstraints();
		gbc_lblV_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblV_2.gridx = 2;
		gbc_lblV_2.gridy = 7;
		frmSeleccionDePlaza.getContentPane().add(lblV_2, gbc_lblV_2);
		
		JButton button_38 = new JButton("1");
		GridBagConstraints gbc_button_38 = new GridBagConstraints();
		gbc_button_38.insets = new Insets(0, 0, 5, 5);
		gbc_button_38.gridx = 3;
		gbc_button_38.gridy = 7;
		frmSeleccionDePlaza.getContentPane().add(button_38, gbc_button_38);
		
		JButton button_39 = new JButton("5");
		GridBagConstraints gbc_button_39 = new GridBagConstraints();
		gbc_button_39.insets = new Insets(0, 0, 5, 5);
		gbc_button_39.gridx = 4;
		gbc_button_39.gridy = 7;
		frmSeleccionDePlaza.getContentPane().add(button_39, gbc_button_39);
		
		JButton button_40 = new JButton("9");
		GridBagConstraints gbc_button_40 = new GridBagConstraints();
		gbc_button_40.insets = new Insets(0, 0, 5, 5);
		gbc_button_40.gridx = 5;
		gbc_button_40.gridy = 7;
		frmSeleccionDePlaza.getContentPane().add(button_40, gbc_button_40);
		
		JButton button_41 = new JButton("13");
		GridBagConstraints gbc_button_41 = new GridBagConstraints();
		gbc_button_41.insets = new Insets(0, 0, 5, 5);
		gbc_button_41.gridx = 6;
		gbc_button_41.gridy = 7;
		frmSeleccionDePlaza.getContentPane().add(button_41, gbc_button_41);
		
		JButton button_42 = new JButton("17");
		GridBagConstraints gbc_button_42 = new GridBagConstraints();
		gbc_button_42.insets = new Insets(0, 0, 5, 5);
		gbc_button_42.gridx = 7;
		gbc_button_42.gridy = 7;
		frmSeleccionDePlaza.getContentPane().add(button_42, gbc_button_42);
		
		JButton button_43 = new JButton("21");
		GridBagConstraints gbc_button_43 = new GridBagConstraints();
		gbc_button_43.insets = new Insets(0, 0, 5, 5);
		gbc_button_43.gridx = 8;
		gbc_button_43.gridy = 7;
		frmSeleccionDePlaza.getContentPane().add(button_43, gbc_button_43);
		
		JButton button_44 = new JButton("25");
		GridBagConstraints gbc_button_44 = new GridBagConstraints();
		gbc_button_44.insets = new Insets(0, 0, 5, 5);
		gbc_button_44.gridx = 9;
		gbc_button_44.gridy = 7;
		frmSeleccionDePlaza.getContentPane().add(button_44, gbc_button_44);
		
		JButton button_45 = new JButton("29");
		GridBagConstraints gbc_button_45 = new GridBagConstraints();
		gbc_button_45.insets = new Insets(0, 0, 5, 5);
		gbc_button_45.gridx = 10;
		gbc_button_45.gridy = 7;
		frmSeleccionDePlaza.getContentPane().add(button_45, gbc_button_45);
		
		JButton button_46 = new JButton("33");
		GridBagConstraints gbc_button_46 = new GridBagConstraints();
		gbc_button_46.insets = new Insets(0, 0, 5, 5);
		gbc_button_46.gridx = 11;
		gbc_button_46.gridy = 7;
		frmSeleccionDePlaza.getContentPane().add(button_46, gbc_button_46);
		
		JButton button_47 = new JButton("37");
		GridBagConstraints gbc_button_47 = new GridBagConstraints();
		gbc_button_47.insets = new Insets(0, 0, 5, 5);
		gbc_button_47.gridx = 12;
		gbc_button_47.gridy = 7;
		frmSeleccionDePlaza.getContentPane().add(button_47, gbc_button_47);
		
		JButton button_48 = new JButton("41");
		GridBagConstraints gbc_button_48 = new GridBagConstraints();
		gbc_button_48.insets = new Insets(0, 0, 5, 5);
		gbc_button_48.gridx = 13;
		gbc_button_48.gridy = 7;
		frmSeleccionDePlaza.getContentPane().add(button_48, gbc_button_48);
		
		JButton button_49 = new JButton("45");
		GridBagConstraints gbc_button_49 = new GridBagConstraints();
		gbc_button_49.insets = new Insets(0, 0, 5, 5);
		gbc_button_49.gridx = 14;
		gbc_button_49.gridy = 7;
		frmSeleccionDePlaza.getContentPane().add(button_49, gbc_button_49);
		
		JButton button_50 = new JButton("49");
		GridBagConstraints gbc_button_50 = new GridBagConstraints();
		gbc_button_50.insets = new Insets(0, 0, 5, 0);
		gbc_button_50.gridx = 15;
		gbc_button_50.gridy = 7;
		frmSeleccionDePlaza.getContentPane().add(button_50, gbc_button_50);
		
		JButton btnAtrs = new JButton("Atr\u00E1s");
		GridBagConstraints gbc_btnAtrs = new GridBagConstraints();
		gbc_btnAtrs.insets = new Insets(0, 0, 0, 5);
		gbc_btnAtrs.gridx = 0;
		gbc_btnAtrs.gridy = 9;
		frmSeleccionDePlaza.getContentPane().add(btnAtrs, gbc_btnAtrs);
		
		JButton button_51 = new JButton("Aceptar");
		GridBagConstraints gbc_button_51 = new GridBagConstraints();
		gbc_button_51.insets = new Insets(0, 0, 0, 5);
		gbc_button_51.gridx = 9;
		gbc_button_51.gridy = 9;
		frmSeleccionDePlaza.getContentPane().add(button_51, gbc_button_51);
		
	}
	
}