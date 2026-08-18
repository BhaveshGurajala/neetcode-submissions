class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int top = 0, bot = m-1;
        int row = -1;
        while(top<=bot){
            int mid = top + (bot-top)/2;
            if(target>matrix[mid][n-1]){
                top=mid+1;
            }else if(target<matrix[mid][0]){
                bot=mid-1;
            }else{
                row=mid;
                break;
            }
        }

        if (row == -1) return false;

        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (target > matrix[row][mid]) {
                l = mid + 1;
            } else if (target < matrix[row][mid]) {
                r = mid - 1;
            } else {
                return true;
            }
        }

        return false;
    }
}