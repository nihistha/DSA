import java.util.ArrayList;
import java.util.List;

public class Nqueens {
    public static boolean isSafe (int row, int col, char[][] board){
        //checking for horizontal
        for(int i = 0;i<board.length;i++){
            if(board[row][i]=='Q'){
                return false;
            }
        }
        //for verticfal
        for (int j = 0;j<board.length;j++){
            if (board[j][col] == 'Q'){
                return false;
            }
        }
        
        int r = row;
        int c = col;
        for (; r>=0 && c >= 0;c--,r--){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        //upper right diagonal
        r = row;
        c = col;
        for (;c<board.length && r<board.length;c++,r++){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        //lower 
        return true;
    }

    public static void helper(char[][] board,int col,List<List<String>> solnList){
        if (col == board.length){

            return;
        }
        for (int row = 0;row<board.length;row++){
            if(isSafe(row ,col,board)){
                board [row][col] ='Q';
                board [row ][col]='.';
                helper(board,col,solnList);
            }
        }
    }

    public static void main(String[] args) {
        char board[][]= new char[4][4];   
        List<List<String>> solnList = new ArrayList<List<String>>();
     }
}
