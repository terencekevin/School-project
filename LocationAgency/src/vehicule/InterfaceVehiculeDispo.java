package vehicule;

import recherche.InterfaceRechercheDossier;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.JList;

public class InterfaceVehiculeDispo extends JFrame {
	public InterfaceVehiculeDispo() {
		setTitle("Liste de v\u00E9hicule");
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Liste des v\u00E9hicule disponible pour votre cat\u00E9gorie");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.gridwidth = 4;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		JList list = new JList();
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.gridwidth = 2;
		gbc_list.gridheight = 5;
		gbc_list.insets = new Insets(0, 0, 5, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 1;
		gbc_list.gridy = 1;
		getContentPane().add(list, gbc_list);
	}

	public static void main(String args[]){
		JFrame frame = new InterfaceVehiculeDispo();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Permet de configurer la taille du frame par défaut
		// frame.setPreferredSize(new Dimension(500, 500));

		// Configuration de la taille minimal du frame
		frame.setMinimumSize(new Dimension(300, 200));

		// Permet de changer la taille du frame une fois construit
		frame.setResizable(true);

		frame.setVisible(true);
	}

}
