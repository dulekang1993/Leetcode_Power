package Leetcode_590_Nary_Tree_Postorder_Traversal;

import java.util.ArrayList;
import java.util.List;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }
    private void helper(Node root, List<Integer> res){
        if(root == null) return;
        for(Node n : root.children){
            helper(n, res);
        }
        res.add(root.val);
    }
}
