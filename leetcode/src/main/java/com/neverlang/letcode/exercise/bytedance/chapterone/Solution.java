package com.neverlang.letcode.exercise.bytedance.chapterone;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null||s.isEmpty()){
            return 0;
        }
        char[] temp = s.toCharArray();
        //a b c a b c b b
        int result = 0;
        int i,j = 0;
        System.out.println(temp);
        System.out.println(temp.length);
        /*while (j<temp.length){

        }*/


        return 1;
    }

    public static void main(String[] args) {
        Solution a = new Solution();
        a.lengthOfLongestSubstring("aa");
    }


}