class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0];
        int maxSum=sum;
        for(int i=1;i<nums.length;i++){
            if(sum>=nums[i] || sum>0){
                sum+=nums[i];
                maxSum=Math.max(maxSum, sum);
            }else{
                sum=nums[i];
                maxSum=Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}
