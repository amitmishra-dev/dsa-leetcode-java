package dsageeks.LinkedList;

public class findMiddle {
    static Node head= null;

    public static Node findMiddle(Node head) {
        Node slow= head;
        Node fast= head;

        if(head!=null) {
            while (fast!=null && fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
        }
        return slow;
    }

    public static void main(String[] args) {
        head= new Node(10);
        Node node1= new Node(20);
        head.next= node1;
        Node node2= new Node(30);
        node1.next= node2;
        Node node3= new Node(40);
        node2.next= node3;
        Node res= findMiddle(head);
        System.out.println(res.data );
    }
}
