class Solution {
    public void rotate(int[][] matrix) {
        int n, m;
        n = matrix.length;
        m = matrix[0].length; 
        // matrix transpose
        for(int i=0; i<n; i++) {
            for(int j=i; j<m; j++) {
                int temp = matrix[i][j]; 
                matrix[i][j] = matrix[j][i]; 
                matrix[j][i] = temp; 
            }
        }

        // print
        // for(int i=0; i<n; i++) {
        //     for(int j=0; j<m; j++) {
        //         System.out.print(matrix[i][j] + " "); 
        //     }
        //     System.out.println(); 
        // }

        // swap columns
        for(int i=0; i<n; i++) {
            for(int j=0; j<m/2; j++) {
                int temp = matrix[i][j]; 
                matrix[i][j] = matrix[i][m-j-1]; 
                matrix[i][m-j-1] = temp; 
            }
        }

        // System.out.println(); 

        // // print
        // for(int i=0; i<n; i++) {
        //     for(int j=0; j<m; j++) {
        //         System.out.print(matrix[i][j] + " "); 
        //     }
        //     System.out.println(); 
        // }
    }
}
