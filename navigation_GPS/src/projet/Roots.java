package projet;

import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

//Class used to calculate path for Dijkstra's Algorithm. - https://en.wikipedia.org/wiki/Dijkstra%27s_algorithm
class Roots implements Comparable<Roots>
{
    protected final String name;
    protected Coin[] adjacencies;
    protected double minDistance = Double.POSITIVE_INFINITY;
    protected Roots previous;
    public Roots(String argName) { name = argName; }
    public String toString() { return name; }
    public int compareTo(Roots other)
    {
        return Double.compare(minDistance, other.minDistance);
    }

}

