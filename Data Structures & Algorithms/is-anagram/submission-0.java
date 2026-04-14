class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch1 = s.toLowerCase().toCharArray();
        char[] ch2 = t.toLowerCase().toCharArray();
         Arrays.sort(ch1);
         Arrays.sort(ch2);

        if(Arrays.equals(ch1, ch2)){
            return true;
            //System.out.println("is");
        }else{
            return false;
        }
    }
}
