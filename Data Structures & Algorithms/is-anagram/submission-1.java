class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> a = new HashMap<>();
        Map<Character, Integer> b = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0; i<s.length();i++){
            a.put(s.charAt(i), a.getOrDefault(s.charAt(i), 0)+1);
            b.put(t.charAt(i), b.getOrDefault(t.charAt(i), 0)+1);
        }
        if(a.equals(b)){
            return true;
        }
        return false;
    }
}
