class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> rowSets[] = new HashSet[9]; 
        Set<Character> colSets[] = new HashSet[9]; 
        Set<Character> gridSets[][] = new HashSet[3][3]; 

        for(int i=0; i<9; i++) { 
            rowSets[i] = new HashSet<>(); 
            colSets[i] = new HashSet<>(); 
            gridSets[i/3][i%3] = new HashSet<>(); 
        }

        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++){
                if(board[i][j] == '.') 
                    continue; 
                char e = board[i][j]; 
                boolean isRowValid = rowSets[i].add(e); 
                boolean isColValid = colSets[j].add(e); 
                boolean isGridValid = gridSets[i/3][j/3].add(e); 
                if(!isRowValid || !isColValid || !isGridValid) return false; 
            } 
        }

        return true; 
    }
}
