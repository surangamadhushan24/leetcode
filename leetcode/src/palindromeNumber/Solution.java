package palindromeNumber;

class Solution {
    public boolean isPalindrome(int x) {
        int res = 0;
        int num = x;

        for (; x != 0; x /= 10) {
            res = res * 10 + x % 10;
        }

        if(res<0){
            return false;
        }
       if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ){
           return false;
       } else if (res == num) {
           return true;

       }
       else {
           return false;
       }

    }


}

