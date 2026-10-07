package sqrt;

public class Solution {

    public static int mySqrt(int x) {
        long n = x;
        while (n * n > x) {
            n = (n + x / n) >> 1;
        }
        return (int) n;
    }
    public static void main(String[] args) {
        System.out.println(mySqrt(6));

    }
}
/*
* 9 = 3x3
* 16 = 4x4
*
*
*
*  */
