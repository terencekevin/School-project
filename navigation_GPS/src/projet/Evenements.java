package projet;


public class Evenements extends DistanceTemps{
	private String évenement;

	// Generate an event on the map
	public double identifierEvent() {
		int chance = (int) ((Math.random()) * 100 + 1);
		double trafic = 1;
		if (chance < 30)
		{
			trafic = 5;
			évenement = " un accident";
		}
		else if (chance >= 30 && chance < 80) {
			trafic = 2;
			évenement = "Une Congestion";
		} 
		else {
			trafic = 1;
			évenement = "Le Trafic est fluide";
		}

		return trafic;
	}

	// Pick a specific street (vertex) for the event
	public double traficSecteur() {
		double temp = ((Math.random()) * 100 ) / 4.55;
		int rue = (int) (temp);

		double valeur = tab[rue][4] * identifierEvent();
		tab[rue][4] = valeur;

		return rue;

	}

	// Convert the event to string to be able to write it to the UI
	public String toStringIdentifierSectec() {
		
		// Find the two points
		String pointA = "", pointB = "";
		double pointATemp = 1, pointBTemp = 1;
		int a = (int) traficSecteur();
		for (int i = 0; i < 22; i++) {
			if (a == i) {
				pointATemp = tab[i][0];
				pointBTemp = tab[i][1];

			}

		}

		pointA = tabSommet[(int) pointATemp];
		pointB = tabSommet[(int) pointBTemp];

		// Write out the event to the UI
		if (évenement.equals("Le Trafic est fluide")) {
			return évenement;
		} else {

			return "Il y a " + évenement + " entre " + pointA + " et "
					+ pointB;
		}

	}
	
	
	
	
	
	
	
	
	
}
