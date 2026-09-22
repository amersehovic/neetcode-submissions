class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row = 0; row < 9; row++) {
            Set<Character> seen = new HashSet<>();
            for(int i = 0; i < 9; i++) {
                if(seen.contains(board[row][i])) {
                    return false;
                }
                if(board[row][i] != '.') {
                    seen.add(board[row][i]);
                }
            }
        }

        for(int col = 0; col < 9; col++) {
            Set<Character> seen = new HashSet<>();
            for(int i = 0; i < 9; i++) {
                if(seen.contains(board[i][col])) {
                    return false;
                }
                if(board[i][col] != '.') {
                    seen.add(board[i][col]);
                }
            }
        }

        for(int sqr = 0; sqr < 9; sqr++) {
            Set<Character> seen = new HashSet<>();
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    int row = (sqr / 3) * 3 + i;
                    int col = (sqr % 3) * 3 + j;
                    if(seen.contains(board[row][col])) {
                        return false;
                    }
                    if(board[row][col] != '.') {
                        seen.add(board[row][col]);
                    }
                }
            }
        }

        return true;
    }
}
