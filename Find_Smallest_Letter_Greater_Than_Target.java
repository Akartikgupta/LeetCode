


import java.util.Arrays;

public class Find_Smallest_Letter_Greater_Than_Target {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int result[] = { -1, -1 };
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                result[0] = mid; // Start index of the range

                // Search left for the start of the range
                while (result[0] > 0 && nums[result[0] - 1] == target) {
                    result[0]--;
                }

                result[1] = mid; // End index of the range

                // Search right for the end of the range
                while (result[1] < nums.length - 1 && nums[result[1] + 1] == target) {
                    result[1]++;
                 }
                // Target found and range determined, exit the loop
                break; 
            }
        }

        return result;

    }

}
