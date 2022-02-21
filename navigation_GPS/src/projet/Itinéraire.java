package projet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Itinéraire {
	
	// Return the result of the itinerary calculations (Dijkstra's Algorithm - https://en.wikipedia.org/wiki/Dijkstra%27s_algorithm)
	public String toStringItinéraireCalcul(String départ, String arrivé,
			String choix) {

		DistanceTemps d = new DistanceTemps();
		String distanceTemps = "";
		
		// Declaring the nodes of the graph with the class Roots
		Roots v0 = new Roots("Intersection_TachéGeorge");
		Roots v1 = new Roots("Intersection_TachéStJoseph");
		Roots v2 = new Roots("Interintersection_TachéAylmer");
		Roots v3 = new Roots("Magasin");
		Roots v4 = new Roots("Maison");
		Roots v5 = new Roots("Intersection_AllumetiereAylmer");
		Roots v6 = new Roots("Intersection_AlumetiereStJoseph");
		Roots v7 = new Roots("Restaurant");
		Roots v8 = new Roots("Intersection_DesgrivesGeorge");
		Roots v9 = new Roots("Hopital");

		// Declaring the vertices of the graph with the class Coin
		v0.adjacencies = new Coin[] { new Coin(v1, d.tab[0][d.temps(choix)]),
				new Coin(v8, d.tab[1][d.temps(choix)]) };
		v1.adjacencies = new Coin[] { new Coin(v0, d.tab[2][d.temps(choix)]),
				new Coin(v6, d.tab[4][d.temps(choix)]),
				new Coin(v2, d.tab[3][d.temps(choix)]) };
		v2.adjacencies = new Coin[] { new Coin(v1, d.tab[5][d.temps(choix)]),
				new Coin(v3, d.tab[6][d.temps(choix)]),
				new Coin(v5, d.tab[7][d.temps(choix)]) };
		v3.adjacencies = new Coin[] { new Coin(v2, d.tab[8][d.temps(choix)]) };
		v4.adjacencies = new Coin[] { new Coin(v5, d.tab[9][d.temps(choix)]) };
		v5.adjacencies = new Coin[] { new Coin(v4, d.tab[10][d.temps(choix)]),
				new Coin(v2, d.tab[11][d.temps(choix)]),
				new Coin(v6, d.tab[12][d.temps(choix)]) };
		v6.adjacencies = new Coin[] { new Coin(v1, d.tab[13][d.temps(choix)]),
				new Coin(v5, d.tab[14][d.temps(choix)]),
				new Coin(v7, d.tab[15][d.temps(choix)]) };
		v7.adjacencies = new Coin[] { new Coin(v6, d.tab[16][d.temps(choix)]),
				new Coin(v8, d.tab[17][d.temps(choix)]) };
		v8.adjacencies = new Coin[] { new Coin(v0, d.tab[19][d.temps(choix)]),
				new Coin(v7, d.tab[18][d.temps(choix)]),
				new Coin(v9, d.tab[20][d.temps(choix)]) };
		v9.adjacencies = new Coin[] { new Coin(v8, d.tab[21][d.temps(choix)]) };

		// Computing our path
		Roots[] vertices = { v0, v1, v2, v3, v4, v5, v6, v7, v8, v9 };
		computePaths(vertices[d.steps(départ)]);

		// Getting results of the calculations in time or distance depending on configs chosen by the user
		if (choix == "temps") {
			System.out.println("De " + vertices[d.steps(départ)]
					+ " jusqu'à  " + vertices[d.steps(arrivé)] + ": "
					+ ((int) vertices[d.steps(arrivé)].minDistance / 60)
					% 60 + " minutes et "
					+ ((int) vertices[d.steps(arrivé)].minDistance % 60)
					+ " secondes");
			distanceTemps = "De " + vertices[d.steps(départ)]
					+ " jusqu'à  " + vertices[d.steps(arrivé)] + " : "
					+ ((int) vertices[d.steps(arrivé)].minDistance / 60)
					% 60 + " minutes et "
					+ ((int) vertices[d.steps(arrivé)].minDistance % 60)
					+ " secondes";
			
		} else {
			System.out.println("Du point de départ: "
					+ vertices[d.steps(départ)] + " jusqu'à "
					+ vertices[d.steps(arrivé)] + " est de \n"
					+ vertices[d.steps(arrivé)].minDistance + " Km");
			distanceTemps = "La distance de "
					+ vertices[d.steps(départ)] + " jusqu'à "
					+ vertices[d.steps(arrivé)] + " est de "
					+ vertices[d.steps(arrivé)].minDistance + " Km";
		}
		
		// Printing path info to the console
		List<Roots> path =
				 getShortestPathTo(vertices[d.steps(arrivé)]);
				 System.out.println("Path: " + path);
				 System.out.println();
		
		// Returning the calc result and path
		return distanceTemps+" et le chemin à prendre est: "+path;
		 
	}
	
	
	// Implementation of Dijkstra's Algorithm - https://en.wikipedia.org/wiki/Dijkstra%27s_algorithm
	public static void computePaths(Roots source) {
		
		// Starting with a minDistance of 0
		source.minDistance = 0.;
		PriorityQueue<Roots> rootsQueue = new PriorityQueue<Roots>();
		rootsQueue.add(source);

		// Process the queue until it is empty
		while (!rootsQueue.isEmpty()) {
			// Retrieve the head of the queue
			Roots u = rootsQueue.poll();

			// Visit each edge exiting u
			for (Coin e : u.adjacencies) {
				Roots v = e.target;
				double weight = e.weight;
				double distanceThroughU = u.minDistance + weight;
				
				// If the newest distance is smaller than the minDistance until now,
				// the newest distance becomes the smallest Distance until now
				if (distanceThroughU < v.minDistance) {
					rootsQueue.remove(v);

					v.minDistance = distanceThroughU;
					v.previous = u;
					rootsQueue.add(v);
				}
			}
		}
	}

	// Create a list of the nodes of the shortest path
	public static List<Roots> getShortestPathTo(Roots target) {
		List<Roots> path = new ArrayList<Roots>();
		for (Roots roots = target; roots != null; roots = roots.previous)
			path.add(roots);

		// List must be reversed since it is populated backwards
		Collections.reverse(path);
		return path;
	}
}
