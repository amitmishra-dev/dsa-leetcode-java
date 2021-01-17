package ds;


class Node
{
    public int value;
    public Node left;
    public Node right;

    public Node(int value) {
        this.value = value;
    }
}
public class ClosestBST {

    public static void main(String[] args) {

        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(5);

        System.out.println(findClosestValueInBst(root, 4));
    }

    private static int findClosestValueInBst(Node root, int target) {
        double closest = Double.MAX_VALUE;
        Node node = root;
        while (node != null){
            if (Math.abs(target - node.value) < Math.abs(target - closest)){
                closest = node.value;
            }
            // compare
            if (target < node.value){
                node = node.left;
            }
            else if (target > node.value){
                node = node.right;
            }
            else { break; }
        }
        return (int)closest;
    }
}
