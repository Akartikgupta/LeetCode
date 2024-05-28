import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        List<Integer> smallList = new ArrayList<>();
        List<List<Integer>> finalList = new ArrayList<>();
        helper(nums, smallList, finalList);
        return finalList;
    }

    public static void helper(int nums[], List<Integer> smallList, List<List<Integer>> finalList) {
        // base case
        if (nums.length == smallList.size()) {
            finalList.add(new ArrayList<Integer>(smallList));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!smallList.contains(nums[i])) {
                smallList.add(nums[i]);
                helper(nums, smallList, finalList);
                smallList.remove(smallList.size() - 1);
            }
        }

    }

    public static void main(String[] args) {
        int ar[] = { 1, 2, 3 };

        System.out.println(permute(ar));

    }
}
