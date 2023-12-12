/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 */

public class Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        int inedxi=0,inedxj=0;
        boolean b=false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    inedxi=i;
                    inedxj=j;
                    b=true;
                    break;


                }
                if(b && inedxi!=inedxj) break;

            }
        }
        int[] arr2 = new int[2];
        arr2[0] = inedxi;
        arr2[1] = inedxj;

        return arr2;


    }

    public static void main(String[] args) {

    }

}
