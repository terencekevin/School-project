package dossierClient;

import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import recherche.InterfaceRechercheDossier;
import location.InterfaceContratLocation;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSplitPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Row;

public class InterfaceDossierClient extends JFrame {
	private JTextField nbPermisTF;
	private JTextField nomTF;
	private JTextField prenomTF;
	private JTextField dateDeNaissanceTF;
	private JTextField addressTF;
	private JTextField telephoneTF;
	private JTextField typepermisTF;
	private JTextField dateExpirationTF;
	
	// Constructeur dossier client nouveau
	public InterfaceDossierClient() {
		setTitle("Profil client");
		getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),}));
		
		JLabel lblNewLabel = new JLabel("Dossier client");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		getContentPane().add(lblNewLabel, "2, 2");
		
		JLabel lblNewLabel_1 = new JLabel("Num\u00E9ro de permis");
		getContentPane().add(lblNewLabel_1, "2, 6, left, default");
		
		nbPermisTF = new JTextField();
		getContentPane().add(nbPermisTF, "4, 6, left, default");
		nbPermisTF.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nom");
		getContentPane().add(lblNewLabel_2, "2, 8, left, default");
		
		nomTF = new JTextField();
		getContentPane().add(nomTF, "4, 8, left, default");
		nomTF.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Pr\u00E9nom");
		getContentPane().add(lblNewLabel_3, "2, 10, left, default");
		
		prenomTF = new JTextField();
		getContentPane().add(prenomTF, "4, 10, left, default");
		prenomTF.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Date de naissance");
		getContentPane().add(lblNewLabel_4, "2, 12, left, default");
		
		dateDeNaissanceTF = new JTextField();
		getContentPane().add(dateDeNaissanceTF, "4, 12, left, default");
		dateDeNaissanceTF.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Adresse");
		getContentPane().add(lblNewLabel_5, "2, 14, left, default");
		
		addressTF = new JTextField();
		getContentPane().add(addressTF, "4, 14, left, default");
		addressTF.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("T\u00E9l\u00E9phone");
		getContentPane().add(lblNewLabel_6, "2, 16, left, default");
		
		telephoneTF = new JTextField();
		getContentPane().add(telephoneTF, "4, 16, left, default");
		telephoneTF.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Type de permis");
		getContentPane().add(lblNewLabel_7, "2, 18, left, default");
		
		typepermisTF = new JTextField();
		getContentPane().add(typepermisTF, "4, 18, left, default");
		typepermisTF.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Date expiration du permis");
		getContentPane().add(lblNewLabel_8, "2, 20, left, default");
		
		dateExpirationTF = new JTextField();
		getContentPane().add(dateExpirationTF, "4, 20, left, default");
		dateExpirationTF.setColumns(10);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		getContentPane().add(btnSupprimer, "2, 24, fill, fill");
		
		JSplitPane splitPane = new JSplitPane();
		getContentPane().add(splitPane, "4, 24, fill, fill");
		
		JButton btnEnregistrer = new JButton("Enregistrer");
		btnEnregistrer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DossierClientData.enregistrerClient(nbPermisTF.getText(), nomTF.getText(), prenomTF.getText(),
						dateDeNaissanceTF.getText(), typepermisTF.getText(), addressTF.getText(), telephoneTF.getText(),
						dateExpirationTF.getText());
			}
		});
		splitPane.setLeftComponent(btnEnregistrer);
		
		JButton btnLocation = new JButton("Location");
		splitPane.setRightComponent(btnLocation);

		btnLocation.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFrame frame = new InterfaceContratLocation();
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.setMinimumSize(new Dimension(300, 200));
				frame.setResizable(true);
				frame.setVisible(true);
			}
		});
		
		this.pack();
	}

	// Constructeur dossier client existant
	public InterfaceDossierClient(Row row) {
		setTitle("Profil client");
		getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),}));
		
		JLabel lblNewLabel = new JLabel("Dossier client");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		getContentPane().add(lblNewLabel, "2, 2");
		
		JLabel lblNewLabel_1 = new JLabel("Num\u00E9ro de permis");
		getContentPane().add(lblNewLabel_1, "2, 6, left, default");
		
		nbPermisTF = new JTextField();
		getContentPane().add(nbPermisTF, "4, 6, left, default");
		nbPermisTF.setColumns(10);
		// Remplir le premier champ avec les informations trouvées
		nbPermisTF.setText(row.getCell(0).getRichStringCellValue().getString());
			
		JLabel lblNewLabel_2 = new JLabel("Nom");
		getContentPane().add(lblNewLabel_2, "2, 8, left, default");
		
		nomTF = new JTextField();
		getContentPane().add(nomTF, "4, 8, left, default");
		nomTF.setColumns(10);
		nomTF.setText(row.getCell(1).getRichStringCellValue().getString());
		
		JLabel lblNewLabel_3 = new JLabel("Pr\u00E9nom");
		getContentPane().add(lblNewLabel_3, "2, 10, left, default");
		
		prenomTF = new JTextField();
		getContentPane().add(prenomTF, "4, 10, left, default");
		prenomTF.setColumns(10);
		prenomTF.setText(row.getCell(2).getRichStringCellValue().getString());
		
		JLabel lblNewLabel_4 = new JLabel("Date de naissance");
		getContentPane().add(lblNewLabel_4, "2, 12, left, default");
		
		dateDeNaissanceTF = new JTextField();
		getContentPane().add(dateDeNaissanceTF, "4, 12, left, default");
		dateDeNaissanceTF.setColumns(10);
		dateDeNaissanceTF.setText(row.getCell(3).getRichStringCellValue().getString());
		
		JLabel lblNewLabel_5 = new JLabel("Adresse");
		getContentPane().add(lblNewLabel_5, "2, 14, left, default");
		
		addressTF = new JTextField();
		getContentPane().add(addressTF, "4, 14, left, default");
		addressTF.setColumns(10);
		addressTF.setText(row.getCell(4).getRichStringCellValue().getString());
		
		JLabel lblNewLabel_6 = new JLabel("T\u00E9l\u00E9phone");
		getContentPane().add(lblNewLabel_6, "2, 16, left, default");
		
		telephoneTF = new JTextField();
		getContentPane().add(telephoneTF, "4, 16, left, default");
		telephoneTF.setColumns(10);
		telephoneTF.setText(row.getCell(5).getRichStringCellValue().getString());
		
		JLabel lblNewLabel_7 = new JLabel("Type de permis");
		getContentPane().add(lblNewLabel_7, "2, 18, left, default");
		
		typepermisTF = new JTextField();
		getContentPane().add(typepermisTF, "4, 18, left, default");
		typepermisTF.setColumns(10);
		typepermisTF.setText(row.getCell(6).getRichStringCellValue().getString());
		
		JLabel lblNewLabel_8 = new JLabel("Date expiration du permis");
		getContentPane().add(lblNewLabel_8, "2, 20, left, default");
		
		dateExpirationTF = new JTextField();
		getContentPane().add(dateExpirationTF, "4, 20, left, default");
		dateExpirationTF.setColumns(10);
		dateExpirationTF.setText(row.getCell(7).getRichStringCellValue().getString());
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		getContentPane().add(btnSupprimer, "2, 24, fill, fill");
		
		JSplitPane splitPane = new JSplitPane();
		getContentPane().add(splitPane, "4, 24, fill, fill");
		
		JButton btnEnregistrer = new JButton("Enregistrer");
		btnEnregistrer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DossierClientData.enregistrerClient(nbPermisTF.getText(), nomTF.getText(), prenomTF.getText(),
						dateDeNaissanceTF.getText(), typepermisTF.getText(), addressTF.getText(), telephoneTF.getText(),
						dateExpirationTF.getText());
			}
		});
		splitPane.setLeftComponent(btnEnregistrer);
		
		JButton btnLocation = new JButton("Location");
		splitPane.setRightComponent(btnLocation);

		btnLocation.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFrame frame = new InterfaceContratLocation();
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.setMinimumSize(new Dimension(400, 600));
				frame.setResizable(true);
				frame.setVisible(true);
			}
		});
		
		this.pack();
	}
	
	public static void main(String args[]){
       JFrame frame = new InterfaceDossierClient();
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
