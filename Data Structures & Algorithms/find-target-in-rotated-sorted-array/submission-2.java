class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(target==nums[mid]){
                return mid;
            }else if(nums[left]<=nums[mid]){
                if(target<nums[mid] && nums[left]<=target){
                    right=mid-1;
                }
                // else if(nums[left]==target){
                //     return left;
                // }
                else{
                    left=mid+1;
                }
            }else{
                if(target>nums[mid] && target<=nums[right]){
                    left=mid+1;
                }
                // else if(nums[right]==target){
                //     return right;
                // }
                else{
                    right=mid-1;
                }
            }
        }
        return -1;
    }
}
