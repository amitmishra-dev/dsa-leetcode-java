package dsageeks.LinkedList;

import java.util.HashSet;

public class DetectLoopInLL {
    static Node head= null;
    static HashSet<Node> hset= new HashSet<>();


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
        Node node2= new Node(30);
        node1.next= node2;
        Node node3= new Node(40);
        node2.next= node3;
        node3.next=node1;
        //print(head);
        Detectloop1(head);

        System.out.println("====After=====");
       // print(head);
    }
    //set 10 -20 -30-40

    private static boolean Detectloop(Node head) {
        Node cur= head;


        while(cur!=null){
            if(hset.contains(cur)) {
                System.out.println("loop exist");
                removeLoop(hset,head);
                break;
            }
            hset.add(cur);
            cur=cur.next;
        }
        return false;
    }

    private static void removeLoop(HashSet<Node> hset, Node head) {
        Node cur= head;
        while(cur != null){

            if(hset.contains(cur.next)) {
                System.out.println("loop removed");
                cur.next = null;
            }
        }
       // head= cur;
    }

    private static boolean Detectloop1(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null){
            slow= slow.next;
            fast=fast.next.next;

            if(slow==fast) {
                System.out.println("+++++++");
                return true;
            }


        }
        return false;
    }

}
