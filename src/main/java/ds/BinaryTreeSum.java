package ds;

/*
PROBLEM:
Given a binary tree, find sum of all branches. Returned in left to right order.
EXAMPLE:
         1
       /  \
      2    3
     / \  / \
    4  5 6  7
   / \  \
  8  9  10              ->  [15, 16, 18, 10, 11]
SOLUTION:
1. Recursion (maintain currentSum) -> time : O(n) | space : O(n)
*/

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeSum {
    public static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(Node root) {
        ArrayList<Integer> solution = new ArrayList<Integer>();
        addSums(root, 0, solution);
        System.out.println("Sum : " +solution);
        return solution;
    }

    private static void addSums(Node root, int sum, ArrayList<Integer> solution) {

        if(root==null)
            return;
        sum += root.value;
        if(root.left == null && root.right==null){
            solution.add(sum);
            return;
        }
        addSums(root.left,sum,solution);
        addSums(root.right,sum,solution);

    }

    public static void main(String[] args) {

        Node l = new Node(5);
        Node r2 = new Node(15);
        Node r = new Node(10);
        r.left=l;
        r.right=r2;
        branchSums(r);
    }
}
