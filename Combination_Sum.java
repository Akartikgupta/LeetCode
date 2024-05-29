import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/combination-sum/description/
public class Combination_Sum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> small = new ArrayList<>();
        List<List<Integer>> finalList = new ArrayList<>();
        helper(candidates, target, 0, small, finalList);
        return finalList;
    }

    static void helper(int[] nums, int target, int index, List<Integer> smallList, List<List<Integer>> finalList) {
        // base case
        if (target == 0) {
            finalList.add(new ArrayList<Integer>(smallList));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = index; i < nums.length; i++) {
            smallList.add(nums[i]);
            helper(nums, target - nums[i], i, smallList, finalList);
            smallList.remove(smallList.size() - 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 6, 7 };
        System.out.println(combinationSum(arr, 7));
    }
}
