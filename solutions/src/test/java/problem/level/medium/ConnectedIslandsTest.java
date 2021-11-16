package problem.level.medium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import problem.level.concepts.and.datastructures.Graph;

public class ConnectedIslandsTest {
    private ConnectedIslands islands;

    @Before
    public void init(){
        islands = new ConnectedIslands();
    }

    @Test
    public void givenAGraph_whenTwoVerticesConnected_returnTrueOtherWiseFalse(){
        /**
         * @hint
         * [0: 1,2
         *  1: 2
         *  2: 0,3
         *  3: 3
         *  4:4
         * ]
         * */
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);
        graph.addEdge(4, 4);
        Assert.assertTrue(islands.isReachable(graph, 0, 3));
        Assert.assertFalse(islands.isReachable(graph, 0, 4));
    }
}
