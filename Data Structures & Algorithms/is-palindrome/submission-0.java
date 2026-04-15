class Solution {
    public boolean isPalindrome(String s) {
       
        String strchar = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int start = 0;
        int end = strchar.length() - 1;
        while(start< end){
            if(strchar.charAt(start) == strchar.charAt(end)){
                start ++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
}
