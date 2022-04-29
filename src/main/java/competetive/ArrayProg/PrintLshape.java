package competetive.ArrayProg;

public class PrintLshape {
    public static void main(String args[]) {
        int n = 4;
        int m = 3;
        int a[][] = {   { 1, 2, 3 },
                        { 4, 5, 6 },
                        { 7, 8, 9 },
                        { 10, 11, 12 } };
        traverseLshape(a, n, m);
    }

    private static void traverseLshape(int[][] a, int n, int m) {

        int colConst=0;
        int rowConst=n-1;
        while(colConst < m && rowConst>=0) {
            for (int row = 0; row <= rowConst; row++) {
                System.out.print(" " + a[row][colConst] );

            }

            colConst++;

            for (int col = colConst; col < m; col++) {
                System.out.print(" "+a[rowConst][col]);

            }
            rowConst--;
        }
    }
}
