package competetive.dynamicProg;

public class MinPathSum {
    public static void main(String[] args) {
        int grid[][]= {{1,2,3},{4,5,6}};
        System.out.println(minPathSum(grid));
    }

    private static int minPathSum(int[][] grid) {
        int r= grid.length;
        int c= grid[0].length;
        int[][] dpArr = new int[r][c];
        dpArr[0][0]=grid[0][0];
        //fill row
        for (int i = 1; i < c; i++) {
            dpArr[0][i]=dpArr[0][i-1]+grid[0][i];
            System.out.println("row :: "+dpArr[0][i]);
        }

        //fill col
        for (int j = 1; j < r; j++) {
            dpArr[j][0]=dpArr[j-1][0]+grid[j][0];
            System.out.println("col :: "+dpArr[j][0]);
        }

        //fill rest
        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                dpArr[i][j]=grid[i][j]+ Math.min(dpArr[i-1][j],dpArr[i][j-1]);
                System.out.println("rest :: "+dpArr[i][j]);
            }

        }
        return dpArr[r-1][c-1];
    }
}
