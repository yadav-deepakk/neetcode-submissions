class Solution {

    public void markIsland(int n, int m, char[][] grid, boolean[][] visited) {
        if(n<0 || n>grid.length-1) return; 
        if(m<0 || m>grid[0].length-1) return; 
        if(grid[n][m] == '0' || visited[n][m]) return;         
        visited[n][m] = true;  
        markIsland(n-1,m,grid,visited); 
        markIsland(n+1,m,grid,visited); 
        markIsland(n,m-1,grid,visited); 
        markIsland(n,m+1,grid,visited); 
    }

    public int numIslands(char[][] grid) {
        int n, m; 
        n = grid.length; // rows
        m = grid[0].length; // cols
        int islands = 0; 
        boolean[][] visited = new boolean[n][m]; 
        // for(int i=0;i<n;i++) Arrays.fill(visited[i], false); 
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    islands++; 
                    markIsland(i,j,grid,visited);
                }
            }
        }
        return islands; 
    }
}
