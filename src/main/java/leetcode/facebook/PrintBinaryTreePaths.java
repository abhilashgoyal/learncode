package leetcode.facebook;

import java.util.ArrayList;
import java.util.List;;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class PrintBianryTreePaths {
    List<String> pathList = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {

        dfs(root, new StringBuilder());
        for (String x : pathList) {
            System.out.println(x);
        }
        return pathList;
    }

    private void dfs(TreeNode node, StringBuilder prefixPath) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                pathList.add(prefixPath.append(node.val).toString());
            }
            dfs(node.left, prefixPath.append(node.val));
            dfs(node.right, prefixPath.append(node.val));
        }
    }
}