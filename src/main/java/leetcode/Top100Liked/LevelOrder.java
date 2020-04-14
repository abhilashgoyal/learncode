package leetcode.Top100Liked;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> output = new ArrayList<>();
        if (root == null) {
            return output;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int count = 0;
        // iterate through each element
        while (queue.size() > 0) {
            List<Integer> tempList = new ArrayList<>();
            count = queue.size();
            while (count > 0) {
                TreeNode node = queue.remove();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                tempList.add(node.val);
                count--;
            }
            output.add(tempList);
        }
        return output;
    }
}
