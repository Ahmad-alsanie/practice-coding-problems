package problem.level.medium;

import java.util.*;

public class ShortestPathWithObstacle {

    /**
     * @Description
     * given a 2D array representing a graph with a target and obstacles,
     * find shortest path between origin (0,0) and target
     * */

    /**
     * @Example
     * input: [ [0,0,0,0,0]
     *          [8,8,8,8,0]
     *          [1,0,0,0,0]]
     *  o=traversable
     *  x=obstacle
     *  T=target
     *
     *  output = 10 steps
     * */

    /**
     * @hint graph is represented as an adjacency matrix
     * */

    int[] rowDirection = {-1,1,0,0};
    int[] colDirection = {0,0,-1,1};


    public int getShortestPath(int[][] graph, int obstacle, int target){

        if(null == graph || graph.length == 0 || graph[0].length == 0){
            throw new IllegalArgumentException("graph cannot be null or empty");
        }

        int[][] distances = new int[graph.length][graph[0].length];
        Queue<int[]> traversed = new LinkedList<>();

        //stand on our starting point
        traversed.offer(new int[]{0,0});

        for(int[] visited : distances){
            //mark unvisited
            Arrays.fill(visited, -1);
        }

        distances[0][0] = 0;

        while(!traversed.isEmpty()){
            int[] coordinates = traversed.poll();
            int row = coordinates[0];
            int col = coordinates[1];

            if(graph[row][col] == target){
                return distances[row][col];
            }

            //traverse in respective directions -4- {we are allowed to traverse up, down, left and right}
            for(int i =0; i < 4; i++){
                int newRow = row + rowDirection[i];
                int newCol = col + colDirection[i];
                if( isWithinGraph(graph, newCol, newRow) && isTraversable(distances, graph, newRow, newCol, obstacle)){
                    traversed.offer(new int[]{newRow, newCol});
                    distances[newRow][newCol] = distances[row][col] + 1;
                }
            }

        }
        return -1;
    }

    private boolean isTraversable(int[][] distances, int[][] graph, int newRow, int newCol, int obstacle) {
        return distances[newRow][newCol] == -1 && graph[newRow][newCol] != obstacle;
    }

    public boolean isWithinGraph(int[][] graph, int newCol, int newRow){
        return (newRow >= 0 && newRow < graph.length) && (newCol >= 0 && newCol < graph[0].length);
    }

}
