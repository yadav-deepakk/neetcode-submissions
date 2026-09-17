class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left=0, right=matrix[0].length-1, top=0, bottom=matrix.length-1; 
        List<Integer> list = new ArrayList<>(); 
        while (left<=right && top<=bottom) {
            for(int i=left; i<=right; i++) list.add(matrix[top][i]); 
            top++; 
            for(int i=top; i<=bottom; i++) list.add(matrix[i][right]); 
            right--; 
            if (left > right || top > bottom) break; 
            for(int i=right; i>=left; i--) list.add(matrix[bottom][i]); 
            bottom--; 
            for(int i=bottom; i>=top; i--) list.add(matrix[i][left]); 
            left++;
        }
        return list; 
    }
}
