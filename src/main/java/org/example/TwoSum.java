package org.example;

import java.util.HashMap;

public class TwoSum {


    //Input: nums = [2,7,11,15], target = 9
    //Output: [0,1]
    //Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]

    public static int[] twoSum_problem(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {

            int diff = target -nums[i];      //9-2 = 7, now we have to look for 7 in array
            if (map.containsKey(diff)){
                return new int[]{map.get(diff),i};

            }
            else
                map.put(nums[i],i);
        }


        return new int[]{};
    }


    public static void main(String[] args) {

        int[] num = {2,7,11,15};
        int target = 9;

        for (int indexes : twoSum_problem(num, target)) {
            System.out.println(indexes);

        }


    }
}
