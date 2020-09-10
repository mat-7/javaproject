package com.algorithm.binarySearch;

/** 二分查找
 * @author xwfjava
 * @create 2020-09-09 14:47
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,3,3,5,5,8,8,8,10,10,13,14,19,19};
        System.out.println(binarySearch(nums, 3));
        System.out.println(left_bound(nums,-1));
        System.out.println(right_bound(nums, 20));
    }

    public static int binarySearch(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        while (left <= right){
            int mid = left + (right - left)/2;
            if (nums[mid] > target){
                right = mid - 1;
            } else if (nums[mid] < target){
                left = mid + 1;
            } else if (nums[mid] == target){
                return mid;
            }
        }
        return -1;
    }

    public static int left_bound(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        while (left <= right){
            int mid = left + (right - left)/2;
            if (nums[mid] > target){
                right = mid - 1;
            } else if (nums[mid] < target){
                left = mid + 1;
            } else if (nums[mid] == target){
                right = mid - 1;// 找左边界
            }
        }
        // 最后要检查 left 越界的情况
        if (left >= nums.length || nums[left] != target) return -1;
        return left;
    }

    public static int right_bound(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        while (left <= right){
            int mid = left + (right - left)/2;
            if (nums[mid] > target){
                right = mid - 1;
            } else if (nums[mid] < target){
                left = mid + 1;
            } else if (nums[mid] == target){
                left = mid + 1;// 找右边界
            }
        }
        // 最后要检查 right 越界的情况
        if (right < 0 || nums[right] != target) return -1;
        return right;
    }
}
