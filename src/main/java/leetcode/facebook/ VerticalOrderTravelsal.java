package leetcode.facebook;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */

import java.util.*;
import java.util.stream.Collectors;


class Location implements Comparable<Location> {
    class TreeNode {
        int val;
        leetcode.facebook.TreeNode left;
        leetcode.facebook.TreeNode right;

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

class TreeTravelsal {
    List<Location> locations = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> outputList = new ArrayList<>();
        if (root == null) {
            return outputList;
        }

        Stack<TreeNode> treeNodeStack = new Stack<>();
        treeNodeStack.push(root);
        TreeNode currentNode = root.left;

        while (!treeNodeStack.isEmpty()) {
            while (currentNode != null) {
                treeNodeStack.push(currentNode);
                currentNode = currentNode.left;
            }

            currentNode = treeNodeStack.pop();
            outputList.add(currentNode.val);
            currentNode = currentNode.right;
        }

        return outputList;
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> outputList = new ArrayList<>();
        if (root == null) {
            return outputList;
        }
        List<List<TreeNode>> inOrderList = getLevelOrder(root);

        for (int i = 0; i < inOrderList.size(); i++) {
            List<TreeNode> treeNodes = inOrderList.get(i);
            if (i % 2 == 0) {
                outputList.add(treeNodes.stream().map(treeNode -> treeNode.val).collect(Collectors.toList()));
            } else {
                List<Integer> revList = new ArrayList<>();
                for (int j = treeNodes.size() - 1; j >= 0; j--) {
                    revList.add(treeNodes.get(j).val);
                }
                outputList.add(revList);
            }
        }
        return outputList;
    }

    private List<List<TreeNode>> getLevelOrder(TreeNode root) {
        List<List<TreeNode>> inorderList = new ArrayList<>();

        if (root == null) {
            return inorderList;
        }
        List<TreeNode> nextOrder = new ArrayList<>();
        List<TreeNode> currentOrder = new ArrayList<>();
        currentOrder.add(root);
        inorderList.add(currentOrder);
        while (currentOrder.size() > 0) {
            for (TreeNode x : currentOrder) {
                System.out.println(x.val);
                if (x.left != null){
                    nextOrder.add(x.left);}

                if (x.right != null){
                    nextOrder.add(x.right);}

            }
            currentOrder = nextOrder;
            inorderList.add(nextOrder);
            nextOrder.clear();
        }

        return inorderList;
    }


    private List<List<TreeNode>> getLevelOrder_1(TreeNode root) {
        List<List<TreeNode>> levelOrder = new LinkedList<>();
        if(root == null){
            return levelOrder;
        }

        List<TreeNode> currentLevelOrder = new LinkedList<>();
        currentLevelOrder.add(root);
        boolean rev = true;
        while(currentLevelOrder.size() > 0){
            List<TreeNode> nextLevelOrder =  new LinkedList<>();

            for(TreeNode treeNode : currentLevelOrder){

                if(treeNode.left != null){
                    nextLevelOrder.add(treeNode.left);
                }

                if(treeNode.right != null){
                    nextLevelOrder.add(treeNode.right);
                }

            }
            levelOrder.add(currentLevelOrder);
            currentLevelOrder = nextLevelOrder;
        }

        return levelOrder;
    }

    private List<List<Integer>> getLevelOrderZigZag(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }

        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.add(root);
        boolean flag = false;
        while(!treeNodeQueue.isEmpty()){
            LinkedList<Integer> tempList = new LinkedList<>();
            int size = treeNodeQueue.size();
            for(int i=0;i<size;i++){
                TreeNode tempNode = treeNodeQueue.poll();
                if(flag){
                    tempList.addFirst(tempNode.val);
                }else {
                    tempList.addLast(tempNode.val);
                }
                if(tempNode.left != null)
                treeNodeQueue.add(tempNode.left);

                if(tempNode.right != null){
                    treeNodeQueue.add(tempNode.right);
                }
            }
            result.add(tempList);
            flag = !flag;
        }
        return result;
    }

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