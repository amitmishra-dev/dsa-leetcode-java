package ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Queue;
import java.util.Stack;

public class SumTree {
    public static void main(String[] args) {

        TreeNode root = new  TreeNode(10, new TreeNode(20, new TreeNode(50),new TreeNode(40)),new TreeNode(50));

        treeSumKthLevel(root, 2);
        //calculateTreeSum(root);

    }

    private static void treeSumKthLevel(TreeNode root, int k) {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root ==null)
            return;
        queue.add(root);
        queue.add(null);
        int sum =0;
        int count=1;
        while(!queue.isEmpty()){

            TreeNode n = queue.peek();
            queue.poll();


            if(n != null){
                //if(k==count)
                    sum+=n.val;
                if(n.left  != null)
                    queue.add(n.left);
                if(n.right != null)
                    queue.add(n.right);
            }
            else if(!queue.isEmpty())  {

                System.out.println(" At Kth level:" + count+": sum : "+ sum );
                sum=0;
                count++;
                if(queue.size()>0)
                    queue.add(null);
            }

        }
//    if(sum !=0)
//        System.out.println(" At Kth level:" + count+": sum : "+ sum );



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


        public static void calculateTreeSum(TreeNode root) {
            Stack<TreeNode> s = new Stack<>();
            Stack<TreeNode> srev = new Stack<>();
            int level = 2;
            boolean flag = true;
            HashMap<Integer, ArrayList> hashTree = new HashMap<>();
            ArrayList<Integer> levelList = null;
            if (root != null)
                s.add(root);
            while (!(s.isEmpty() )|| (!srev.isEmpty())){
                if (flag) {
                    while (!s.isEmpty()) {
                        TreeNode ele = s.pop();
                        levelList = new ArrayList<>();
                        if (ele.left != null) {
                            srev.push(ele.left);
                            levelList.add(ele.left.val);
                        }
                        if (ele.right != null) {
                            srev.push(ele.right);
                            levelList.add(ele.right.val);
                        }
                    }
                    System.out.println("level true"+ level+"");
                    levelList.stream().forEach(System.out::println);
                    System.out.println("=======================");
                    hashTree.put(level++, levelList);
                }
                if (!flag) {
                    while (!srev.isEmpty()) {
                        TreeNode ele = srev.pop();
                        levelList = new ArrayList<>();
                        if (ele.left != null) {
                            s.push(ele.left);
                            levelList.add(ele.left.val);
                        }
                        if (ele.right != null) {
                            s.push(ele.right);
                            levelList.add(ele.right.val);
                        }
                    }
                    System.out.println("level false"+ level+"");
                    levelList.stream().forEach(System.out::println);
                    hashTree.put(level++, levelList);
                }
                flag=!flag;

            }

            for (Map.Entry<Integer,ArrayList> entry: hashTree.entrySet()) {
                ArrayList<Integer> sum = entry.getValue();
                Optional<Integer> res= sum.stream().reduce((a,b)->a+b);
                if(res.isPresent())
                System.out.println("Level "+entry.getKey()+" sum =>" + res.get());
            }
           // hashTree.forEach((k,v)-> System.out.println(k + ":: "+v.stream().reduce((a,b)->a+b)));

        }
}
