package plusOne;

import java.util.Arrays;

class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]< 9){// 8, 7 ,6 etc.......
                digits[i]++;
                return  digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;

    }

    public static void main(String[] args) {
        var solution = new Solution();
        System.out.println(Arrays.toString(solution.plusOne(new int[]{ 9,9, 9})));
    }
}
