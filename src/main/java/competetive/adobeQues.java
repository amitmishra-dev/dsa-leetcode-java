//package competetive;
//
//public class adobeQues {
//
//    public static void main(String[] args) {
//        maxDiff(root, node,0);
//    }
//
//    int maxDiff(node root, node maxNode, int maxDiff){
//
//        if(root==null)
//            return 0;
//
//        if(root.val > maxNode.val){
//            maxNode= root;
//        }
//        if(root.val>0 maxDiff < (maxNode.val-root.val)){
//            maxDiff= (maxNode.val-root.val);
//        }
//
//        return Math.max(maxDiff(root.left, maxNode,maxdiff), maxDiff(root.right, maxNode,maxdiff));
//    }
//
//}
//  10 , 0 , 0
//          10> 0
//      maxNode=10
//     maxdiff= 0
//
//  5, 10, 0
//  n=  10
//  d= 10-5=5
//
//  -12,10,5
//  n=12
//  d=5
//  //10+12=22
//  1,12,5
//  n=12
//  d=12-1=11
//
//
//
//// keep track of max root parent
////max diff calculation
////recursive (root, maxroot, maxdiff)
//
//
// positive (all positive nodes )
// Negative (root= null)
// Negative(all negative nodes)
// Negative ( root= 0)
//
//
//        10
//     5       15
//  -12    3 8      20
//1
//
