package menus;

import recherche.InterfaceRechercheDossier;

import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.*;

public class InterfaceSelectionContrat extends JFrame {
    public InterfaceSelectionContrat() {
        setTitle("S\u00E9lection de contrat");
        getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Choisir le type de contrat");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel.setBounds(108, 11, 203, 49);
        getContentPane().add(lblNewLabel);

        JButton btnNewButton = new JButton("Location");
        btnNewButton.setBounds(49, 84, 125, 23);
        getContentPane().add(btnNewButton);

        JButton btnNewButton_1 = new JButton("R\u00E9servation");
        btnNewButton_1.setBounds(249, 84, 125, 23);
        getContentPane().add(btnNewButton_1);
    }

    public static void main(String args[]){
        JFrame frame = new InterfaceSelectionContrat();
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
