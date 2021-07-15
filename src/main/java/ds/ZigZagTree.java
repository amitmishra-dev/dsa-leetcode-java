package ds;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ZigZagTree {
    public static void main(String[] args) {

        TreeNode root = new  TreeNode(10, new TreeNode(20, new TreeNode(60),new TreeNode(80)),new TreeNode(30));
        List<List<Integer>> res=zigzagLevelOrder(root);
        res.stream().forEach(System.out::print);
    }



    //  Definition for a binary tree node.
    static class TreeNode {
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


        public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            Stack<TreeNode> s = new Stack<>();
            Stack<TreeNode> srev = new Stack<>();
            boolean flag= true;
            List<List<Integer>> zigzagList= new LinkedList<>();
            if (root !=null)
                s.add(root);
            while(!s.isEmpty()   || !srev.isEmpty()){
                List<Integer> levelList= null;
                if(flag){
                    levelList=new LinkedList<>();
                    while(!s.isEmpty()){
                        TreeNode n= s.pop();
                        levelList.add( n.val);
                        if(n.left != null){
                            srev.push(n.left);
                        }
                        if(n.right != null){
                            srev.push(n.right);
                        }
                    }

                }
                if(!flag){
                    levelList=new LinkedList<>();
                    while(!srev.isEmpty()){
                        TreeNode n= srev.pop();
                        levelList.add( n.val);
                        if(n.right != null){
                            s.push(n.right);
                        }
                        if(n.left != null){
                            s.push(n.left);
                        }

                    }
                }
                flag=!flag;
                zigzagList.add(levelList);
            }
            return zigzagList;
        }
}
