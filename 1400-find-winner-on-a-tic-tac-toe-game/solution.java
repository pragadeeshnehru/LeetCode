class Solution {
    int n = 3;
    public String tictactoe(int[][] moves) {
        char[][] board = new char[n][n];
        for(int i =0;i<moves.length;i++){
            int row = moves[i][0];
            int col = moves[i][1];
            if((i&1) == 0){
                // EVEN X MOVE
                board[row][col] = 'X';
                if(hasWon(board,row,col,'X')) return "A";
            } else {
                // ODD O MOVE
                board[row][col] = 'O';
                if(hasWon(board,row,col,'O')) return "B";
            }
        }
        return moves.length == n*n ? "Draw" : "Pending";
    }

    private boolean hasWon(char[][] board,int row,int col, char player){
        boolean win = true;
        // ROWS
        for(int i=0;i<n;i++){
            if(board[row][i] != player){
                win = false;
            }
        }
        if(win) return true;

        //COLUMNS
        win = true;
        for(int i=0;i<n;i++){
            if(board[i][col]!= player){
                win = false;
            }
        }
        if(win) return true;

        //RIGHT DIAGONAL
        if(row == col){
            win = true;
            for(int i = 0; i < n; i++){
                if(board[i][i] != player){
                    win = false;
                }                
            }
            if(win) return true;     
        }

        //LEFT DIAGONAL
        if(col == n - row - 1){
            win = true;
            for(int i=0;i< n ; i++){
                if(board[i][n-i-1]!= player){
                    win = false;
                }
            }
            if(win) return true;
        }
        //PLAYER LOST
        return false;
    }

}
