class Solution {
    public boolean exist(char[][] board, String word) {
        int n= board.length;
        int m = board[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(search(i,j,n,m,board,0,word)){
                    return true;
                }
            }
        }
        return false;
    }

    //backtracking function
    boolean search(int i,int j,int n,int m, char[][] board, int len, String word ){
        if(len == word.length()) return true;
        if(i==n || i<0 || j<0 || j==m || board[i][j] != word.charAt(len)){
            return false;
        }

        char ch = board[i][j];
        board[i][j] = '#';

        boolean op1 = search(i+1,j,n,m,board,len+1,word);
        boolean op2 = search(i-1,j,n,m,board,len+1,word);
        boolean op3 = search(i,j+1,n,m,board,len+1,word);
        boolean op4 = search(i,j-1,n,m,board,len+1,word);

        board[i][j] = ch;

        return op1 || op2 || op3 || op4 ;

    }
}
