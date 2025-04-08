package org.example;

public class TwoSum {


    //Input: nums = [2,7,11,15], target = 9
    //Output: [0,1]
    //Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]

    public static int[] twoSum_problem(int[] nums, int target) {

        int[] index = new int[2];


        for (int i = 0; i < nums.length; i++) {

            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    index[0] = i;
                    index[1] = j;
                    return index;

                }

            }

        }


        return new int[] {-1, -1};
    }


    public static void main(String[] args) {

        int[] num = {3,2,4};
        int target = 6;

        for (int indexes : twoSum_problem(num, target)) {
            System.out.println(indexes);

        }


    }
}
