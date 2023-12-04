class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> counter = new HashMap<>();
        for (char i: s.toCharArray()){
            counter.put(i, counter.getOrDefault(i, 0)+1);
        }
        for (char i: t.toCharArray()){
            counter.put(i, counter.getOrDefault(i, 0)-1);
        }
        for (int val: counter.values()){
            if (val != 0){
                return false;
            }
        }

        return true;
    }
}