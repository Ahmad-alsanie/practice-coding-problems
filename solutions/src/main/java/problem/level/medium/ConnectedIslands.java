package problem.level.medium;

import problem.level.model.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectedIslands {
    /**
     * @Description
     * given a 2D array representing island name and its neighbor,
     * find if 2 given islands are connected or not
     * */

    /**
     * @Example
     * input: [(a,b), (b,c), (d,f)] is there a road from a to c
     * output: true
     * */

    /**
     * @Hint think of it as a graph and represent it by an adjacency list
     * [a: b
     *  b: a,c
     *  d: f
     *  f: d]
     * */

    Boolean isReachable(final Graph graph, int start, int distention) {
        LinkedList<Integer> temp;
        boolean visited[] = new boolean[graph.getVertices()];

        Queue<Integer> queue = new LinkedList<>();

        visited[start]=true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int vertex :graph.getAdjacency()[current]) {

                if (vertex == distention){
                    return true;
                }

                if (!visited[vertex]) {
                    visited[vertex] = true;
                    queue.add(vertex);
                }
            }
        }
        return false;
    }
}
