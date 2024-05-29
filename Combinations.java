import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/combinations/
public class Combinations {
    public static List<List<Integer>> combine(int n, int k) {
        List<Integer> smallList = new ArrayList<>();
        List<List<Integer>> finalList = new ArrayList<>();
        helper(n, k, smallList, finalList, 1);
        return finalList;
    }

    public static void helper(int n, int k, List<Integer> smallList, List<List<Integer>> finalList, int index) {
        // base case
        if (smallList.size() == k) {
            finalList.add(new ArrayList<>(smallList));
            return;
        }
        for (int i = index; i <= n; i++) {
            smallList.add(i);
            helper(n, k, smallList, finalList, i + 1);
            smallList.remove(smallList.size() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(combine(4, 2));
    }
}
