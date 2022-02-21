package projet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class DistanceTemps {

	// Arrays containing the data for the node names and nodes/vertices weight
	protected double[][] tab = { { 0.00, 1.00, 3.00, 100.00, 108.00 },
			{ 0.00, 8.00, 3.00, 80.00, 135 },
			{ 1.00, 0.00, 3.00, 100.00, 108 }, { 1.00, 2.00, 1.00, 50.00, 72 },
			{ 1.00, 6.00, 1.00, 50.00, 72 }, { 2.00, 1.00, 1.00, 50.00, 72 },
			{ 2.00, 3.00, 0.20, 30.00, 24 }, { 2.00, 5.00, 1.00, 30.00, 120 },
			{ 3.00, 2.00, 0.20, 30.00, 24 }, { 4.00, 5.00, 0.20, 30.00, 24 },
			{ 5.00, 4.00, 0.20, 30.00, 24 }, { 5.00, 2.00, 1.00, 30.00, 120 },
			{ 5.00, 6.00, 1.00, 30.00, 120 }, { 6.00, 1.00, 1.00, 50.00, 72 },
			{ 6.00, 5.00, 1.00, 30.00, 120 }, { 6.00, 7.00, 1.50, 50.00, 108 },
			{ 7.00, 6.00, 1.50, 50.00, 108 },
			{ 7.00, 8.00, 4.00, 100.00, 144 },
			{ 8.00, 7.00, 4.00, 100.00, 144 },
			{ 8.00, 0.00, 3.00, 80.00, 135 }, { 8.00, 9.00, 0.20, 80.00, 9 },
			{ 9.00, 8.00, 0.20, 80.00, 9 } };
	protected String[] tabSommet = { "Intersection_TachéGeorge", "Intersection_TachéStJospeh",
			"Intersection_TachéAylmer", "Magasin", "Maison",
			"Intersection_AllumetiereAylmer", "Intersection_AllumetiereStJospeh", "Restaurant",
			"Intersection_DesgrivesGorge", "Hopital" };
	
	

	// Method to fetch the step index
	public int steps(String a) {

		int depart = 0;

		if (a == "Magasin") {
			depart = 3;
		} 
		else if (a == "Maison") {
			depart = 4;
		} 
		else if (a == "Restaurant") {
			depart = 7;
		} 
		else {
			depart = 9;
		}
		return depart;
	}

	// Method to fetch the config index
	public int temps(String tempsDistance) {
		int choix=0;

		if (tempsDistance.equals("temps")) {
			choix = 4;
		} 
		else {
			choix = 2;
		}
		return choix;
	}

	
}
