package dsageeks.LinkedList;

public class LinkListOperation {
    static Node head= null;
    public static void main(String[] args) {
        head= new Node(10);
        Node node12= new Node(20);
        head.next= node12;

        Node res= insertHead(new Node(30));
        System.out.println(res.data);
    }

    private static Node insertHead(Node node1) {
        Node temp=head;

            if(head==null)
                return node1;
            else {
                node1.next = head;
                head= node1;
            }

    return head;
    }

    private static void insertAtEnd(Node tail) {
        Node temp=head;

        if(head==null)
            return ;

            while(temp.next!=null){
                temp= temp.next;
            }
            temp.next=tail;

    }
}
