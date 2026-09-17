/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    
    private int preorderIndex=0;
    private Map<Integer, Integer> inorderMap = new HashMap<>(); 

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            inorderMap.put(inorder[i], i); 
        }
        TreeNode node = build(preorder, 0, inorder.length -1); 
        return node;
    }

    public TreeNode build(int[] preorder, int start, int end) {
        if(start > end) return null; 
        int nodeVal = preorder[preorderIndex++]; 
        int nodeIndex = inorderMap.get(nodeVal); 
        TreeNode node = new TreeNode(nodeVal); 
        node.left = build(preorder, start, nodeIndex - 1); 
        node.right = build(preorder, nodeIndex + 1, end); 
        return node; 
    }
}
