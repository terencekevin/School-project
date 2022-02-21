package reservation;

import recherche.InterfaceRechercheDossier;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import javax.swing.JButton;

public class InterfaceContratReservation extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNunroDeContrat;
	private JLabel lblDeLaRservation;
	private JLabel lblDateDeContrat;
	private JLabel lblFinDeLa;
	private JLabel lblImmatriculation;
	private JLabel lblCatgorie;
	private JLabel lblMarque;
	private JLabel lblNewLabel_5;
	private JTextField textField_10;
	public InterfaceContratReservation() {
		setTitle("R\u00E9servation");
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Num\u00E9ro de permis");
		lblNewLabel.setBounds(10, 56, 106, 14);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(158, 81, 123, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(158, 112, 123, 20);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(158, 370, 123, 20);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(158, 184, 123, 20);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(158, 215, 123, 20);
		getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(158, 53, 123, 20);
		getContentPane().add(textField_5);
		
		JLabel lblNewLabel_1 = new JLabel("Nom");
		lblNewLabel_1.setBounds(10, 81, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(158, 246, 123, 20);
		getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(158, 277, 123, 20);
		getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(158, 308, 123, 20);
		getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(158, 339, 123, 20);
		getContentPane().add(textField_9);
		
		lblNewLabel_2 = new JLabel("Contrat de r\u00E9servation");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 11, 184, 23);
		getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Information du contrat");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 143, 184, 20);
		getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Pr\u00E9nom");
		lblNewLabel_4.setBounds(10, 112, 46, 14);
		getContentPane().add(lblNewLabel_4);
		
		lblNunroDeContrat = new JLabel("Nun\u00E9ro de contrat");
		lblNunroDeContrat.setBounds(10, 187, 90, 14);
		getContentPane().add(lblNunroDeContrat);
		
		lblDeLaRservation = new JLabel("D\u00E9but de la r\u00E9servation");
		lblDeLaRservation.setBounds(10, 249, 138, 14);
		getContentPane().add(lblDeLaRservation);
		
		lblDateDeContrat = new JLabel("Date de contrat");
		lblDateDeContrat.setBounds(10, 218, 90, 14);
		getContentPane().add(lblDateDeContrat);
		
		lblFinDeLa = new JLabel("Fin de la r\u00E9servation");
		lblFinDeLa.setBounds(10, 280, 123, 14);
		getContentPane().add(lblFinDeLa);
		
		lblImmatriculation = new JLabel("Immatriculation");
		lblImmatriculation.setBounds(10, 311, 106, 14);
		getContentPane().add(lblImmatriculation);
		
		lblCatgorie = new JLabel("Cat\u00E9gorie ");
		lblCatgorie.setBounds(10, 342, 106, 14);
		getContentPane().add(lblCatgorie);
		
		lblMarque = new JLabel("Marque");
		lblMarque.setBounds(10, 371, 46, 14);
		getContentPane().add(lblMarque);
		
		lblNewLabel_5 = new JLabel("Mod\u00E8le");
		lblNewLabel_5.setBounds(10, 404, 76, 14);
		getContentPane().add(lblNewLabel_5);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(158, 401, 123, 20);
		getContentPane().add(textField_10);
		
		JButton btnNewButton = new JButton("Enregistrer");
		btnNewButton.setBounds(217, 452, 85, 23);
		getContentPane().add(btnNewButton);
	}

	public static void main(String args[]){
		JFrame frame = new InterfaceContratReservation();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Permet de configurer la taille du frame par défaut
		// frame.setPreferredSize(new Dimension(500, 500));

		// Configuration de la taille minimal du frame
		frame.setMinimumSize(new Dimension(400, 200));

		// Permet de changer la taille du frame une fois construit
		frame.setResizable(true);

		frame.setVisible(true);
	}
}
