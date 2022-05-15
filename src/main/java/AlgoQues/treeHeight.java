package AlgoQues;

public class treeHeight {

    public static void main(String[] args) {
        long[] tree= {1,1,-1,1,1,1};
        height(tree);
    }
        private static long height(long[] tree){

            long height=0;
            if(tree.length ==0)
                return 0;
            else
                height= 1;

            long lc= -1;
            long rc= -1;

            for(int i=0;i<tree.length;i++){
                System.out.println(i);
                if((2*i+1) < tree.length)
                    lc= tree[(2*i+1)];
                if((2*i+2) <tree.length)
                    rc= tree[(2*i+2)];

                if((lc != -1) || (rc !=-1 )){

                    System.out.println("height ++"+ lc +" : " + rc);
                    height++;
                    lc=-1;
                    rc=-1;
                }
            }
            return height;

        }


}
