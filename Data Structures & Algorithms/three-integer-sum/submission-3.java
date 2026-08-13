class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            // TODO: if nums[i] == nums[i-1] (and i > 0), skip this i — continue
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    // TODO: add [nums[i], nums[left], nums[right]] to result
                    result.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));
                    // TODO: move left++ and right--
                    left++;
                    right--;
                    // TODO: while left < right and nums[left] == nums[left-1], left++
                    while(left<right && nums[left] == nums[left-1]){
                        left++;
                    }
                    // TODO: while left < right and nums[right] == nums[right+1], right--
                    while(left<right && nums[right] == nums[right+1]){
                        right--;
                    }
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}