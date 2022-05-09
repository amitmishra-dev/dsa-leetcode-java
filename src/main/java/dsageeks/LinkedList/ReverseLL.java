package dsageeks.LinkedList;

public class ReverseLL {
    static Node head= null;

    public static Node revLL(Node head) {
        Node prev= null;
        Node cur= head;
        Node next=head;

        while(cur!=null) {
            next= cur.next;
            cur.next= prev;
            prev=cur;
            cur=next;

        }

        return prev;
    }
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
        print(head);
        head=revLL(head);
        System.out.println("=========");
        print(head);
    }
}
