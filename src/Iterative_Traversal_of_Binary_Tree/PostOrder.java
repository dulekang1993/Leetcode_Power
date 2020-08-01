package Iterative_Traversal_of_Binary_Tree;

import TreeNode.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class PostOrder {

    // 1
    public void postOrder(TreeNode root){
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode lastVisited = root;
        while(!stack.isEmpty() || root != null){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.peek();
            if(root.right == null || root.right == lastVisited){
                System.out.println(root.val);
                lastVisited = stack.pop();
                root = null;
            }else {
                root = root.right;
            }
        }
    }

    // 2
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> ans = new LinkedList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        if(root == null) return ans;
        stack.push(root);
        while(!stack.isEmpty()){
            root = stack.pop();
            ans.addFirst(root.val);
            if(root.left != null) stack.push(root.left);
            if(root.right != null) stack.push(root.right);
        }
        return ans;
    }
}
