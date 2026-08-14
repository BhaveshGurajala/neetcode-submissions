class Solution {
    public int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int res=0;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(mid==left){
                res=Math.min(nums[mid], nums[right]);
                break;
            }
           else if(nums[mid]>nums[left] && nums[mid]>nums[right]){
                left=mid;
            }else if(nums[mid]<nums[right] && nums[mid]<nums[left]){
                right=mid;
            }else if(nums[mid]>nums[left] && nums[mid]<nums[right]){
                res=nums[left];
                break;
            }else{
                res=nums[mid];
                break;
            }
        }
        return res;
    }
}