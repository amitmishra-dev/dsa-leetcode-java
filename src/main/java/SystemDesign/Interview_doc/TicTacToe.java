package SystemDesign.Interview_doc;

import java.util.ArrayList;
import java.util.List;

public class TicTacToe {
    int[] rowA;
    int[] colA;
    int diagonal;
    int antiDiagonal;
    int n;

    public TicTacToe(int n){
        rowA = new int[n];
        colA = new int[n];
        this.n=n;
    }

    public int move(int row, int col, int player) throws IllegalArgumentException{
        if(row<0 || col <0 || row  >n  || col>n)
            throw new IllegalArgumentException("Invalid row or col !");
        else if(player != 1 && player != 2)
            throw new IllegalArgumentException("Invalid player !");
        else{
            int curPlayer= player == 1 ? +1 : -1;
//            board[row][col]=player;
            rowA[row]+=curPlayer;
            colA[col]+=curPlayer;
            if(row==col){
                diagonal+= curPlayer;
            }
            else if(row == n - row - 1){
                antiDiagonal+=curPlayer;
            }
            if((Math.abs(rowA[row]) == n ||
                    Math.abs(colA[col]) == n ||
                    Math.abs(diagonal) == n ||
                    Math.abs(antiDiagonal) == n))
                return player;
        }
        return 0;
    }

    public static void main(String[] args) {
        TicTacToe t = new TicTacToe(3);
        List<Integer> res = new ArrayList<>();
        res.add( t.move(0,0,1));
        res.add( t.move(1,1,1));
        res.add( t.move(2,2,1));
        res.add( t.move(0,2,1));
        res.add( t.move(2,0,2));

        System.out.println(res);
    }
}
