package Queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

    // BFS Level Order Traversal
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new LinkedList<>();
        ArrayDeque <Integer> que=new ArrayDeque<>();
        que.add(root.val);
        
        int levelsize=que.size();
        while(!que.isEmpty()){
            que.add(temp.left);
            que.add(temp.right);

            while(levelsize!=0){

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // Build Tree:
        // 10
        // / \
        // 20 30
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);

        // Run BFS
        List<List<Integer>> levels = levelOrder(root);
        System.out.println("Tree Level Order: " + levels);
        // Output: [[10], [20, 30]]
    }
}
