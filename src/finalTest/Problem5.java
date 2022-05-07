package src.finalTest;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Question 5:
 * Given an integer array nums and an integer k,
 * return the kth largest element in the array.
 *
 * Note that it is the kth largest element in the sorted order,
 * not the kth distinct element.
 */

public class Problem5 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int k = 2;
        System.out.println(new SolutionFive1().findKthLargest(nums, k));
        System.out.println(new SolutionFive2().findKthLargest(nums, k));
    }
}

class SolutionFive1 {
    public int findKthLargest(int[] nums, int k) {
        if(k > nums.length) return -1;//wrong number k
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a,b) -> b -a);
        for(int i = 0; i < nums.length; i++){
            priorityQueue.add(nums[i]);
        }
        for(int j = 0; j < k - 1; j++){
            priorityQueue.poll();
        }
        return priorityQueue.peek();
    }
}

class SolutionFive2{
    public int findKthLargest(int[] nums, int k) {
       Arrays.sort(nums);
       return nums[nums.length - k];
    }
}