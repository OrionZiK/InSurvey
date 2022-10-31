package com.zinc.permissionroot3;

/**
 * @author OrionZinc
 * @date 2022/10/28 16:45
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length == 1){
            return nums.length;
        }
        int i = 0, j = 1;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                j++;

            }else{
                i++;
                nums[i]=nums[j];
                j++;
            }
        }
        return i+1;
    }
}






//class Solution {
//    public int removeDuplicates(int[] nums) {
//        // 使用双指针
//        if(nums==null || nums.length == 1){
//            return nums.length;
//        }
//        int i = 0,j =1;
//        while(j<nums.length){
//            if(nums[i]==nums[j]){
//                j++;
//            }else{
//                i++;
//                nums[i]=nums[j];
//                j++;
//            }
//        }
//        return i+1;
//    }
//}