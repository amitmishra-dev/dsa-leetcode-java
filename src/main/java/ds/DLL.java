package ds;

public class DLL {
    int val;
    DLL prev;
    DLL next;

    public DLL(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public DLL getPrev() {
        return prev;
    }

    public void setPrev(DLL prev) {
        this.prev = prev;
    }

    public DLL getNext() {
        return next;
    }

    public void setNext(DLL next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "DLL{" +
                "val=" + val +
                ", prev=" + prev +
                ", next=" + next +
                '}';
    }

    public static void main(String[] args) {
        DLL dll = new DLL(10);
        dll.toString();
        dll=insert(dll,30);
        dll.toString();
        delete(dll,50);
        dll.toString();
    }

    private static DLL insert(DLL head, int val) {
        DLL dll1= new DLL(val);
        DLL p= head;
        while(p.next !=null){
            p=p.next;
        }
        dll1.setPrev(p);
        p.setNext(dll1);
        return head;
    }

    private static DLL delete(DLL head, int del) {
        if(head!=null){
            DLL p= head;
            DLL fut=null;
            while(p !=null){
                if(p.next.getVal()==del) {
                    fut = p.getNext().getNext();
                    p.next = fut;
                    fut.setPrev(p);
                }
                p=p.next;
            }
        }
        return head;
    }
}
