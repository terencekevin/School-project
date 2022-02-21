package recherche;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

import dossierClient.InterfaceDossierClient;

import org.apache.poi.ss.usermodel.Row;
import javax.swing.JButton;

public class InterfaceRechercheDossier extends JFrame {
	private JTextField rechercheTF;
	public InterfaceRechercheDossier() {
		setTitle("Recherche de dossier");
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Entrez num\u00E9ro de permis");
		lblNewLabel.setBounds(50, 22, 150, 14);
		getContentPane().add(lblNewLabel);
		
		rechercheTF = new JTextField();
		rechercheTF.setBounds(50, 47, 161, 23);
		getContentPane().add(rechercheTF);
		rechercheTF.setColumns(10);
		
		JButton btnRecherche = new JButton("Rechercher");
		btnRecherche.setBounds(70, 81, 120, 23);
		getContentPane().add(btnRecherche);

		btnRecherche.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Row row = DossierClientChercher.rechercheClient(rechercheTF.getText());
				// Domaine classe DossierClient ‡ utiliser
				if(row != null) {
					JFrame frame = new InterfaceDossierClient(row);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.setMinimumSize(new Dimension(400, 200));
					frame.setResizable(true);
					frame.setVisible(true);
				} else {
					JFrame frame = new InterfaceDossierClient();
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.setMinimumSize(new Dimension(400, 200));
					frame.setResizable(true);
					frame.setVisible(true);
				}
			}
		});
	}

	public static void main(String args[]){
		JFrame frame = new InterfaceRechercheDossier();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Permet de configurer la taille du frame par d√©faut
		// frame.setPreferredSize(new Dimension(500, 500));

		// Configuration de la taille minimal du frame
		frame.setMinimumSize(new Dimension(300, 200));

		// Permet de changer la taille du frame une fois construit
		frame.setResizable(true);

		frame.setVisible(true);
	}
}
