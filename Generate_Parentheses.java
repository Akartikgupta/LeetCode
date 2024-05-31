import java.util.ArrayList;
import java.util.List;
// https://leetcode.com/problems/generate-parentheses/

public class Generate_Parentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        helper(0, 0, 0, "", result, n);
        return result;
    }

    private static void helper(int opening, int closing, int index, String output, List<String> result, int n) {
        // base case
        if (index == n * 2) {
            result.add(output);
            return;
        }
        // opening<n
        if (opening < n) {
            helper(opening + 1, closing, index + 1, output + "(", result, n);
        }
        // opening > closing
        if (opening > closing) {
            helper(opening, closing + 1, index + 1, output + ")", result, n);
        }
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));

    }
}
