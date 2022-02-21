package location;

import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class InterfaceContratLocation extends JFrame {
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
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	public InterfaceContratLocation() {
		setTitle("Contrat de location");
		getContentPane().setLayout(
				new FormLayout(
						new ColumnSpec[] {
							FormSpecs.RELATED_GAP_COLSPEC,
							FormSpecs.DEFAULT_COLSPEC,
							FormSpecs.RELATED_GAP_COLSPEC,
							ColumnSpec.decode("default:grow")
						},
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
							FormSpecs.DEFAULT_ROWSPEC
						}
				)
		);
		
		JLabel lblNewLabel = new JLabel("Contrat de location");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		getContentPane().add(lblNewLabel, "2, 2");
		
		JLabel lblNewLabel_1 = new JLabel("Num\u00E9ro de permis");
		getContentPane().add(lblNewLabel_1, "2, 6, left, default");
		
		textField = new JTextField();
		getContentPane().add(textField, "4, 6, left, default");
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nom");
		getContentPane().add(lblNewLabel_2, "2, 8, left, default");
		
		textField_1 = new JTextField();
		getContentPane().add(textField_1, "4, 8, left, default");
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Pr\u00E9nom");
		getContentPane().add(lblNewLabel_3, "2, 10, left, default");
		
		textField_2 = new JTextField();
		getContentPane().add(textField_2, "4, 10, left, default");
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Information du contrat");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		getContentPane().add(lblNewLabel_4, "2, 12");
		
		JLabel lblNewLabel_5 = new JLabel("Num\u00E9ro du contrat");
		getContentPane().add(lblNewLabel_5, "2, 14, left, default");
		
		textField_3 = new JTextField();
		getContentPane().add(textField_3, "4, 14, left, default");
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Date de d\u00E9but");
		getContentPane().add(lblNewLabel_6, "2, 16, left, default");
		
		textField_4 = new JTextField();
		getContentPane().add(textField_4, "4, 16, left, default");
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Date de fin");
		getContentPane().add(lblNewLabel_7, "2, 18, left, default");
		
		textField_5 = new JTextField();
		getContentPane().add(textField_5, "4, 18, left, default");
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Immatriculation");
		getContentPane().add(lblNewLabel_8, "2, 20, left, default");
		
		textField_6 = new JTextField();
		getContentPane().add(textField_6, "4, 20, left, default");
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Cat\u00E9gorie");
		getContentPane().add(lblNewLabel_9, "2, 22, left, default");
		
		textField_7 = new JTextField();
		getContentPane().add(textField_7, "4, 22, left, default");
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Marque");
		getContentPane().add(lblNewLabel_10, "2, 24, left, default");
		
		textField_8 = new JTextField();
		getContentPane().add(textField_8, "4, 24, left, default");
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Mod\u00E8le");
		getContentPane().add(lblNewLabel_11, "2, 26, left, default");
		
		textField_9 = new JTextField();
		getContentPane().add(textField_9, "4, 26, left, default");
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Kilomettrage de d\u00E9part");
		getContentPane().add(lblNewLabel_12, "2, 28, left, default");
		
		textField_10 = new JTextField();
		getContentPane().add(textField_10, "4, 28, left, default");
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Kilomettrage d'arriv\u00E9");
		getContentPane().add(lblNewLabel_13, "2, 30, left, default");
		
		textField_11 = new JTextField();
		getContentPane().add(textField_11, "4, 30, left, default");
		textField_11.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Forfait de kilomettrage");
		getContentPane().add(lblNewLabel_14, "2, 32, left, default");
		
		textField_12 = new JTextField();
		getContentPane().add(textField_12, "4, 32, left, default");
		textField_12.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Assurance");
		getContentPane().add(lblNewLabel_15, "2, 34, left, default");
		
		textField_13 = new JTextField();
		getContentPane().add(textField_13, "4, 34, left, default");
		textField_13.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Tarif par jour");
		getContentPane().add(lblNewLabel_16, "2, 36, left, default");
		
		textField_14 = new JTextField();
		getContentPane().add(textField_14, "4, 36, left, default");
		textField_14.setColumns(10);
		
		JButton btnNewButton = new JButton("Enregistrer");
		getContentPane().add(btnNewButton, "4, 40, center, default");
	}

	public static void main(String args[]){
		JFrame frame = new InterfaceContratLocation();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Permet de configurer la taille du frame par défaut
		// frame.setPreferredSize(new Dimension(500, 500));

		// Configuration de la taille minimal du frame
		frame.setMinimumSize(new Dimension(400, 600));

		// Permet de changer la taille du frame une fois construit
		frame.setResizable(true);

		frame.setVisible(true);
	}
}
