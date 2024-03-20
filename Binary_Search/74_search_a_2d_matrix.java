class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Brute force method O(n^2)
        // for(int i = 0; i < matrix.length; i++){
        //     for(int j = 0; j < matrix[i].length; j++){
        //         if(matrix[i][j] == target){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        //Tried in O(n)
        // int val = 0;
        // for(int i = 1; i < matrix.length; i++){
        //     if(matrix[i][0] > target){
        //         val = i-1;
        //         break;
        //     }else if(matrix[i][0] == target){
        //         return true;
        //     }else{
        //         val = matrix.length-1;
        //     }
        // }
        // for(int i = 0; i < matrix[val].length; i++){
        //     if(matrix[val][i] == target){
        //         return true;
        //     }
        // }
        // return false;

        //Binary_Search Method O(log(m*n))
        int i = 0;
        int j = matrix[0].length -1;

        while(i < matrix.length){
            int temp = matrix[i][j]; //last element
            if (target == temp){
                return true;
            } else if (target > temp) {
                i++;
            } else {
                int start = 0;
                int end = matrix[i].length - 1;
                while (start <= end) {
                    int mid = start + (end - start)/2;
                    if (matrix[i][mid] == target) {
                        return true;
                    } else if (matrix[i][mid] < target){
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
                break;
            }
        }
        return false;
    }
}