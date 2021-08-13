package problem.level.medium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShortestPathWithObstacleTest {

    ShortestPathWithObstacle shortestPath;

    @Before
    public void init(){
        shortestPath = new ShortestPathWithObstacle();
    }

    @Test
    public void givenGraphWithObstacle_whenShortestPathInvoked_thenReturnShortestPathDistance(){
        int[][] graph ={{0,0,0,0,0},
                        {8,8,8,8,0},
                        {1,0,0,0,0}};
        Assert.assertEquals(10, shortestPath.getShortestPath(graph,8,1));
    }

    @Test
    public void givenNullOrEmptyGraph_whenShortestPathInvoked_thenThrowException(){
        int[][] graph ={{},{},{}};
        Assert.assertThrows(IllegalArgumentException.class,
                ()->shortestPath.getShortestPath(graph,8,1));
    }
}
