package menus;

import recherche.InterfaceRechercheDossier;

import javax.swing.JFrame;

import dossierClient.DossierClientData;

import javax.swing.JButton;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InterfaceMenuPrincipal extends JFrame {
    public InterfaceMenuPrincipal() {
        setTitle("Menu principal");
        getContentPane().setLayout(null);

        JButton btnNewButton = new JButton("Cataloguer v\u00E9hicule");
        btnNewButton.setBounds(10, 66, 150, 32);
        getContentPane().add(btnNewButton);

        JButton rechercheBouton = new JButton("Recherche dossier");
        rechercheBouton.setBounds(240, 66, 155, 32);
        getContentPane().add(rechercheBouton);
        

        rechercheBouton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFrame frame = new InterfaceRechercheDossier();
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.setMinimumSize(new Dimension(300, 200));
				frame.setResizable(true);
				frame.setVisible(true);
			}
		});
    }

    public static void main(String args[]){
        JFrame frame = new InterfaceMenuPrincipal();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Permet de configurer la taille du frame par défaut
        // frame.setPreferredSize(new Dimension(500, 500));

        // Configuration de la taille minimal du frame
        frame.setMinimumSize(new Dimension(420, 200));

        // Permet de changer la taille du frame une fois construit
        frame.setResizable(true);

        frame.setVisible(true);
    }

}
