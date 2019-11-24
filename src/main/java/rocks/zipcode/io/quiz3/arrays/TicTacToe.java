package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    private String [][] board;
    private Boolean victory;


    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() { board = new String [3][3];

    }

    public String[] getRow(Integer value) {
        return this.board[value];
    }

    public String[] getColumn(Integer value) {
        return new String[]{board[0][value], board[1][value], board[2][value]};
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        if(board[rowIndex][0] == board[rowIndex][1] && board[rowIndex][1] == board[rowIndex][2])  {
            return true;
        }   return false;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        if(board[0][columnIndex] == board[1][columnIndex] && board[1][columnIndex] == board[2][columnIndex])    {
            return true;
        }   return false;
    }

    public String getWinner() {


        return null;
    }

    public String[][] getBoard() {
        return null;
    }




    public boolean checkForWin(String isXOrO)   { return true;

    }
}
