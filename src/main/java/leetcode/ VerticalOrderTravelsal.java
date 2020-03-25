package leetcode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.*;


class Location implements Comparable<Location> {
    class TreeNode {
        int val;
        leetcode.TreeNode left;
        leetcode.TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    int x, y, val;

    Location(int x, int y, int val) {
        this.x = x;
        this.y = y;
        this.val = val;
    }

    @Override
    public int compareTo(Location that) {
        if (this.x != that.x)
            return Integer.compare(this.x, that.x);
        else if (this.y != that.y)
            return Integer.compare(this.y, that.y);
        else
            return Integer.compare(this.val, that.val);
    }
}

class VerticalOrderTravelsal {
    List<Location> locations = new ArrayList<>();

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> outputList = new ArrayList<>();
        if (root == null)
            return outputList;
        // run the DFS over given Tree node
        dfs(root, 0, 0);

        Collections.sort(locations);
        int lastIndex = locations.get(0).x;
        outputList.add(new ArrayList<>());
        for (Location location : locations) {
            if (location.x != lastIndex) {
                outputList.add(new ArrayList<>());
            }
            outputList.get(outputList.size() - 1).add(location.val);
            lastIndex = location.x;
        }

        return outputList;
    }

    void dfs(TreeNode root, int i, int j) {
        if (root != null) {
            locations.add(new Location(i, j, root.val));
            dfs(root.left, i - 1, j + 1);
            dfs(root.right, i + 1, j + 1);
        }
    }

}