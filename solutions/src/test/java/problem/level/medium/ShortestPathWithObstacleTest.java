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
        char[][] graph = {{'o','o','o','o','o'},
                          {'x','x','x','x','o'},
                          {'T','o','o','o','o'}};
        Assert.assertEquals(10, shortestPath.getShortestPath(graph,'x','T'));
    }

}
