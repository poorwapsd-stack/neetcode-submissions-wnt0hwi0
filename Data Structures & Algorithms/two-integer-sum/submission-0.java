class Solution {
    public int[] twoSum(int[] nums, int target) {
        
      Map<Integer, Integer> map= new HashMap<>(); 
      int[] arr = new int[2];
      for(int i = 0; i < nums.length; i++){
        int sum = target - nums[i];
        if(!map.containsKey(sum)){
          map.put(nums[i], i);
        }else{
          arr[0] = map.get(sum);
          arr[1] = i;
        }
      }     
    return arr;
    }
    
}
