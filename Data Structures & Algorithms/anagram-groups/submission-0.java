class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> s = new ArrayList<>();
        for(String str : strs){
            char[] ch = str.toLowerCase().toCharArray();
            Arrays.sort(ch);
            String newString = new String(ch);
            if(!map.containsKey(newString)){
                map.put(newString, new ArrayList());
                map.get(newString).add(str);
            }else{
                map.get(newString).add(str);
            }

        }
        s = new ArrayList<>(map.values());
        return s;

    }
}
