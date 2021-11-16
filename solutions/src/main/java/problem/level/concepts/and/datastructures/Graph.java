package problem.level.concepts.and.datastructures;

import java.util.LinkedList;

public class Graph {
    private int vertices;   // No. of vertices
    private LinkedList<Integer> adjacency[]; //Adjacency Lists

    // Constructor
    public Graph(int vertices)
    {
        this.vertices = vertices;
        adjacency = new LinkedList[vertices];
        for (int i=0; i< vertices; ++i)
            adjacency[i] = new LinkedList();
    }

    public void addEdge(int vertices, int weight)
    {
        adjacency[vertices].add(weight);
    }

    public int getVertices() {
        return vertices;
    }

    public LinkedList<Integer>[] getAdjacency() {
        return adjacency;
    }
}
