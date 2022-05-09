package dsageeks.LinkedList;

public class sortTheLL {
    static Node head= null;

    public static void sort(Node head) {
        Node prev= head;
        Node next= head;
        Node temp=null;
        if(head!=null) {
            while (next != null) {
                if (next.data == 0 && next!=prev) {
                    temp=next;
                    next=next.next;
                    insertHead(temp);
                    prev.next=next;
                }
                prev = next;
                next = next.next;
            }
        }
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

    public static void main(String[] args) {
        head= new Node(1);
        Node node1= new Node(1);
        head.next= node1;
        Node node2= new Node(0);
        node1.next= node2;
        Node node3= new Node(1);
        node2.next= node3;
        print(head);
        sortBySplit(head);
        //sort(head);
        System.out.println("==========after sort======");
        print(head);
    }

    private static void print(Node head) {
        Node temp=head;
        while (temp != null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }



  //  =================

    public static void sortBySplit(Node head) {
        Node head0= new Node(Integer.MIN_VALUE);
        Node head1= new Node(Integer.MIN_VALUE);
        Node temp1= head1;
        Node temp=head;
        while (temp!=null) {
            if(temp.data==1){
                head1.next=temp;
                head1=head1.next;
            }
            else{
                head0.next=temp;
                head0=head0.next;
            }
            temp=temp.next;
        }
        head1.next=null;
        head0.next=temp1.next;
    }

}

