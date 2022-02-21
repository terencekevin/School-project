package projet;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

import javax.swing.border.EtchedBorder;
public class Gps<selectedIndex> extends JFrame implements ActionListener {

	// Private fields
	private String arrivé = "";
	private String départ = "";
	private String choix = "";
	private JLabel labelTrajet;
	private Evenements ev = new Evenements();
	private Itinéraire i = new Itinéraire();
	private JPanel trafic = new JPanel();
	private JPanel bouton = new JPanel();
	private String a = "";
	private JLabel labelText = new JLabel();
	private final JLabel map_label = new JLabel("");
	private String[] modeLecture = { "temps", "distance","" };
	private String[] Depart_Arrive = { "Magasin", "Maison", "Restaurant","Hopital", " " };
	private JComboBox comboTempsDist = new JComboBox(modeLecture);
	private JComboBox combodepart = new JComboBox(Depart_Arrive);
	private JComboBox comboarrive = new JComboBox(Depart_Arrive);
	private JButton b = new JButton("Start");
	private String circulation = "La circulation :";
	private final JLabel map_Label = new JLabel("");
	

	// constructor de la classe

	public Gps() {
		
		//forme du jbuttom
		b.setBackground(new java.awt.Color(0, 0, 255));
		b.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
	    b.setForeground(new java.awt.Color(255, 255, 255));
	    b.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		//scroll parcours a afficher
	    
	    comboTempsDist.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
	    comboTempsDist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "temps", "distance","" }));
	    labelTrajet = new JLabel();
		getContentPane().add(Trafic());
		getContentPane().add(Configuration());
		map_Label.setIcon(new ImageIcon(Gps.class.getResource("/image/map2.jpg")));
		
		// Populating the Content Pane
		getContentPane().add(map_Label);
		getContentPane().add(trajet()).setLocation(1200, 700);

		setBackground(Color.blue);
         //AFFICHER LE TITRE DU PROJET
		setTitle("PROJET TEAM 10");
		
		// DEFINIR LA GRANDEUR DU FRAME
		setSize(1200, 900); 
		getContentPane().setBackground(Color.gray);
		
								
		//AJOUT DU BOUTON X POUR FERMER LA FENETRE						
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new FlowLayout());

	}

	public void actionPerformed(ActionEvent e) {

		Object src = e.getSource();

		// Configuring the fields depending on which dropdown/button performed an action
		if (src == comboTempsDist) {
			JComboBox departChoix = (JComboBox) e.getSource();
			choix = (String) departChoix.getSelectedItem();
			System.out.println("choix :" + choix);

		}

		if (src == combodepart) {
			JComboBox departChoix = (JComboBox) e.getSource();
			arrivé = (String) departChoix.getSelectedItem();
			System.out.println("départ :" + arrivé);

		}
		if (src == comboarrive) {
			JComboBox departChoix = (JComboBox) e.getSource();
			départ = (String) departChoix.getSelectedItem();

			System.out.println("arrivé :" + départ);

		}

		if (src == b) {

			i.toStringItinéraireCalcul(arrivé, départ, choix);
			circulation = ev.toStringIdentifierSectec();
			labelTrajet.setText(i.toStringItinéraireCalcul(arrivé, départ, choix));
			
		}// Fin methode actionPerformed

	}// Fin du constructeur

	// Declaring a panel for Traffic
	private JPanel Trafic() {
		JLabel top = new JLabel(ev.toStringIdentifierSectec());
		
		JPanel Trafic = new JPanel();
		Trafic.setBackground(new java.awt.Color(255, 255, 255));
		Trafic.setPreferredSize(new Dimension(1200, 50));
		Trafic.add(top);
		Trafic.setBorder(BorderFactory.createTitledBorder("Etat du Trafic"));
		return Trafic;
	}

	// Declaring a panel for configurations
	private JPanel Configuration() {
		comboTempsDist.setSelectedIndex(0);
		comboTempsDist.addActionListener(this);
		comboarrive.setSelectedIndex(4);
		comboarrive.addActionListener(this);
		combodepart.setSelectedIndex(4);
		combodepart.addActionListener(this);

		b.setVerticalTextPosition(AbstractButton.BOTTOM);
		b.setHorizontalTextPosition(AbstractButton.CENTER);
		b.setMnemonic(KeyEvent.VK_M);
		b.addActionListener(this);
		JPanel configuration = new JPanel();
		configuration.setBackground(new java.awt.Color(255, 255, 255));
		configuration.add(new JLabel("           parcours à afficher"));
		configuration.add(comboTempsDist);
		configuration.add(labelText);

		// AJOUTER LE COMBO ET LE TEXTE DANS LE PANEL
		configuration.add(new JLabel("           Point de depart:"));
		configuration.add(combodepart);
		configuration.add(labelText);

		// AJOUTER LE COMBO ET LE TEXTE DANS LE PANEL
		configuration.add(new JLabel("             Destination"));
		configuration.add(comboarrive);
		configuration.add(labelText);
		configuration.add(b);

		configuration.setPreferredSize(new Dimension(1200, 50));

		configuration.setBorder(BorderFactory
				.createTitledBorder("Configuration"));
		return configuration;
	}

	// Declaring a panel for itinerary information
	private JPanel trajet() {
		
		JPanel trajet = new JPanel();
		trajet.setBackground(new java.awt.Color(255, 255, 255));
        trajet.setBorder(javax.swing.BorderFactory.createTitledBorder("ETA"));
		trajet.add(labelTrajet);
		trajet.setPreferredSize(new Dimension(1300, 80));
		
		
		return trajet;
	}

	// Entry Point
	public static void main(String[] args) {

		Gps frame = new Gps();
		frame.setVisible(true);

	}
}
