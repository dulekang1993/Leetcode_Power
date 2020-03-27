package Leetcode_1305_All_Elements_in_Two_Binary_Search_Trees;

import TreeNode.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution2 {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> res1 = new ArrayList<>();
        List<Integer> res2 = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        dfs(root1, res1);
        dfs(root2, res2);
        // merge & sort
        int i = 0, j = 0;
        while(i < res1.size() && j < res2.size()){
            if(res1.get(i) == res2.get(j)){
                res.add(res1.get(i));
                res.add(res2.get(j));
                i++;
                j++;
            }else if(res1.get(i) < res2.get(j)){
                res.add(res1.get(i));
                i++;
            }else{
                res.add(res2.get(j));
                j++;
            }
        }
        while(i < res1.size() || j < res2.size()){
            if(i < res1.size()){
                res.add(res1.get(i));
                i++;
            }
            if(j < res2.size()){
                res.add(res2.get(j));
                j++;
            }
        }
        return res;
    }
    // inorder
    private void dfs(TreeNode root, List<Integer> res){
        if(root == null) return;
        dfs(root.left, res);
        res.add(root.val);
        dfs(root.right, res);
        return;
    }
}
