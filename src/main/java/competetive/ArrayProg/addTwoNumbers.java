package competetive.ArrayProg;

import java.util.LinkedList;

//  Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
class Solution {
    public static LinkedList<ListNode> addTwoNumbers(ListNode l1, ListNode l2) {

        LinkedList<ListNode> nodell= new LinkedList<ListNode>();
        int count =0;
        int nextSum =0;
 //       ListNode prev = new ListNode();
        int sum=0;
        while(l1 != null && l2!= null) {
            sum=l1.val + l2.val;
            System.out.println("===sum===>> "+ sum);
            ListNode prev = new ListNode(nextSum);
            if (sum > 9) {
                prev.val = nextSum + sum % 10;
                nextSum=(int) sum/10;
                //prev.next.val = (int) sum/10;
            } else {
                prev.val = nextSum + sum % 10;
            }
            nodell.push(prev);
        }

      //  nodell.stream().filter(n->).forEach(System.out::println);
        return nodell;
    }

    public static void main(String[] args) {
        ListNode n1= new ListNode(10);
        ListNode n2= new ListNode(1);
        ListNode n3= new ListNode(12);
        ListNode n4= new ListNode(13);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;

        ListNode n11= new ListNode(30);
        ListNode n12= new ListNode(1);
        ListNode n13= new ListNode(2);
        ListNode n14= new ListNode(11);
        n11.next=n12;
        n12.next=n13;
        n13.next=n14;

        System.out.println(addTwoNumbers(n1,n11));
    }
}

