class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<Map, Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0; i<strs.length; i++){
            String s = strs[i];

            Map<Character, Integer> a = new HashMap<>();
            for (char c : s.toCharArray()) {
                a.put(c, a.getOrDefault(c,0)+1);
            }
            
            if(map.containsKey(a)){
                res.get(map.get(a)).add(s);
            }else{
                map.put(a, count);
                res.add(new ArrayList<>(List.of(s)));
                count++;
            }

        }
        return res;
    }
}
