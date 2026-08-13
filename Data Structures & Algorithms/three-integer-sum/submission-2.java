class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Map<List<Integer>, Integer> res = new HashMap<>();
        int count = 1;
        for(int i=0;i<nums.length;i++){
            int tar = 0-nums[i];
            Map<Integer, Integer> map = new HashMap<>();
            for(int j=0;j<nums.length;j++){
                if(j!=i){
                    if(map.containsKey(tar-nums[j])){
                        ArrayList<Integer> temp = new ArrayList<>(Arrays.asList(
                        nums[i], nums[j], tar - nums[j]));
                        Collections.sort(temp);
                        if(res.containsKey(temp)){
                            continue;
                        }
                        res.put(temp, count++);
                        list.add(temp);
                        continue;
                    }
                    map.put(nums[j], j);
                }
                
            }
        }
        return list;
    }
}
