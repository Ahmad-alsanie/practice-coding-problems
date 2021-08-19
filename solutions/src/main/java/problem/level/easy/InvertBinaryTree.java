package problem.level.easy;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class InvertBinaryTree {
    /**
     * @Description
     * Given the root of a binary tree, invert the tree, and return its root.
     *        4                         4
     *      /   \                     /   \
     *     2     7       ====>       7     2
     *    / \  /  \                /  \   / \
     *   1  3 6   9               9   6  3   1
     * */

        public TreeNode invertTree(final TreeNode root) {
            if (root == null) return null;

            final Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                TreeNode current = queue.poll();

                TreeNode temp = current.left;
                current.left = current.right;
                current.right = temp;

                if (current.left != null){
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
            return root;
        }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
         }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TreeNode treeNode = (TreeNode) o;
            return val == treeNode.val && Objects.equals(left, treeNode.left) && Objects.equals(right, treeNode.right);
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, left, right);
        }
    }
}
