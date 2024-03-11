class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < board.length; i++){
            Set<Character> row = new HashSet<>();
            Set<Character> col = new HashSet<>();
            Set<Character> sqr = new HashSet<>();

            for(int j = 0; j < board.length; j++){
                if(board[i][j] != '.' && !row.add(board[i][j])){
                    return false;
                }
                if(board[j][i] != '.' && !col.add(board[j][i])){
                    return false;
                }

                int rowIndex = 3*(i/3);
                int colIndex = 3*(i%3);

                if(board[rowIndex + j/3][colIndex + j%3] != '.' && !sqr.add(board[rowIndex + j/3][colIndex + j%3])){
                    return false;
                }
            }
        }
        return true;
    }
}