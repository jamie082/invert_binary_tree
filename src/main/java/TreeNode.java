public class TreeNode {
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
 }
 
class Solution {
    public TreeNode invertTree(TreeNode root) {
        //if the tree is empty, return null
        if(root == null){
            return null;
        }

        //create a temporary TreeNode to store the left child
        TreeNode temp = root.left;

        //swap the left and right children
        root.left = root.right;
        root.right = temp;

        //recursively invert the left and right subtrees
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}