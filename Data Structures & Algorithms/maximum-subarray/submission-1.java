class Solution {
    public int maxSubArray(int[] nums) {
        int left=0;
        int right=0;
        int sum=nums[left];
        int maxSum=sum;
        for(int i=1;i<nums.length;i++){
            if(sum>=nums[i] || sum>0){
                sum+=nums[i];
                maxSum=Math.max(maxSum, sum);
            }else{
                sum=nums[i];
                maxSum=Math.max(maxSum, sum);
                left=i;
            }
        }
        return maxSum;
    }
}
