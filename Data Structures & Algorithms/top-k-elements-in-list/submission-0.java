class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[k];
        for(int i = 0; i < nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        List<Map.Entry<Integer, Integer>> lst = new ArrayList<>(map.entrySet());
        lst.sort((a,b)-> b.getValue() - a.getValue());
        for(int i = 0 ; i < k; i++){
            arr[i] = (Integer) lst.get(i).getKey();
        }
    return arr;
    }
}
