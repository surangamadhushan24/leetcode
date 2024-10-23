import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[0];
        for(int i =0;i< nums.length-1;i++){
            for(int j = 1;j< nums.length-i;j++){

                if(nums[i] + nums[j+i] == target){
                    arr = new int[]{i ,j+i};
                    return arr;
                }
            }
        }
        return arr;


    }
}
// [0,1,1] => 2 => [1,2]

class HelloWorld {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = s.twoSum(new int[]{3,2,4}, 7); //[2,5,5,11]  [3,2,4]
        System.out.println(Arrays.toString(arr));
    }
}