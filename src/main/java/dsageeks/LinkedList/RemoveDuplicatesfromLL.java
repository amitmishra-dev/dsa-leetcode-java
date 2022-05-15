package dsageeks.LinkedList;

import java.util.HashSet;

public class RemoveDuplicatesfromLL {
    static Node head= null;


    private static void print(Node head) {
        Node temp=head;
        while (temp != null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        head= new Node(10);
        Node node1= new Node(20);
        head.next= node1;
        Node node2= new Node(10);
        node1.next= node2;
        Node node3= new Node(10);
        node2.next= node3;
        print(head);
        removeDuplicates(head);
        System.out.println("=========");
        print(head);
    }

    private static void removeDuplicates(Node head) {
        Node cur= head;
        Node prev= head;
        HashSet<Integer> hset= new HashSet<>();
        while(cur!=null){
            if(!hset.contains(cur.data)){
                hset.add(cur.data);
                prev=cur;
            }
            else
                prev.next=cur.next;
            cur=cur.next;
        }
    }
}
