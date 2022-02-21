package vehicule;

import recherche.InterfaceRechercheDossier;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.*;

public class InterfaceTypeVehicule extends JFrame {
    private JTextField textField;
    public InterfaceTypeVehicule() {
        setTitle("Choix du type de v\u00E9hicule");
        getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Choisir le type de v\u00E9hicule");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel.setBounds(43, 24, 214, 45);
        getContentPane().add(lblNewLabel);

        textField = new JTextField();
        textField.setBounds(65, 80, 327, 35);
        getContentPane().add(textField);
        textField.setColumns(10);

        JButton btnNewButton = new JButton("Valider");
        btnNewButton.setBounds(277, 142, 115, 23);
        getContentPane().add(btnNewButton);
    }

    public static void main(String args[]){
        JFrame frame = new InterfaceTypeVehicule();
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
