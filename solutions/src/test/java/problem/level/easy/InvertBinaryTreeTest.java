package problem.level.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InvertBinaryTreeTest {
    private InvertBinaryTree invert;

    @Before
    public void init(){
        invert = new InvertBinaryTree();
    }

    @Test
    public void expect_inverted_binary_tree(){
        final InvertBinaryTree.TreeNode root = new InvertBinaryTree.TreeNode(4,
                new InvertBinaryTree.TreeNode(2, new InvertBinaryTree.TreeNode(1), new InvertBinaryTree.TreeNode(3)),
                new InvertBinaryTree.TreeNode(7,new InvertBinaryTree.TreeNode(6), new InvertBinaryTree.TreeNode(9)));

        final InvertBinaryTree.TreeNode expected = new InvertBinaryTree.TreeNode(4,
                new InvertBinaryTree.TreeNode(7, new InvertBinaryTree.TreeNode(9), new InvertBinaryTree.TreeNode(6)),
                new InvertBinaryTree.TreeNode(2,new InvertBinaryTree.TreeNode(3), new InvertBinaryTree.TreeNode(1)));

        Assert.assertEquals(expected, invert.invertTree(root));
    }

    @Test
    public void expect_inverted_binary_tree_by_recursion(){
        final InvertBinaryTree.TreeNode root = new InvertBinaryTree.TreeNode(4,
                new InvertBinaryTree.TreeNode(2, new InvertBinaryTree.TreeNode(1), new InvertBinaryTree.TreeNode(3)),
                new InvertBinaryTree.TreeNode(7,new InvertBinaryTree.TreeNode(6), new InvertBinaryTree.TreeNode(9)));

        final InvertBinaryTree.TreeNode expected = new InvertBinaryTree.TreeNode(4,
                new InvertBinaryTree.TreeNode(7, new InvertBinaryTree.TreeNode(9), new InvertBinaryTree.TreeNode(6)),
                new InvertBinaryTree.TreeNode(2,new InvertBinaryTree.TreeNode(3), new InvertBinaryTree.TreeNode(1)));

        Assert.assertEquals(expected, invert.invertTreeRecursively(root));
    }
}
