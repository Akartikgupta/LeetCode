import java.util.ArrayList;
import java.util.List;

public class Letter_Combinations_of_PhoneNumber {
    // 2-9
    static final String keys[] = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public static List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<String>();
        } else {
            return helper(digits);
        }
    }

    public static List<String> helper(String digits) {
        // Base Case
        if (digits.length() == 0) {
            List<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        // digits = "23"
        char singleChar = digits.charAt(0); // '2'
        // '2' - Ascii (50)
        // '0' - Ascii (48)
        // '2'-'0' => 50-48 = 2
        int index = singleChar - '0';
        String str = keys[index];
        List<String> finalList = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            List<String> tempList = helper(digits.substring(1)); // def
            for (int j = 0; j < tempList.size(); j++) {
                finalList.add(str.charAt(i) + tempList.get(j));
            }
        }
        return finalList;
    }
    // private static final String key[] = { "", "", "abc", "def", "ghi", "jkl",
    // "mno", "pqrs", "tuv", "wxyz" };

    // public static List<String> letterCombinations(String digits) {
    // if (digits.length() == 0 || digits == null) {
    // return new ArrayList<>();
    // } else {
    // return helper(digits);
    // }

    // }

    // // Digits=23
    // public static List<String> helper(String digits) {
    // if (digits.length() == 0) {
    // List<String> newList = new ArrayList<String>();
    // newList.add("");
    // return newList;
    // }
    // // 2 yaha se nikal ke aa gya
    // char firstDigit = digits.charAt(0);
    // // '2' - Ascii (50)
    // // '0' - Ascii (48)
    // // '2'-'0' => 50-48 = 2
    // int index = firstDigit - '0';
    // List<String> newList = new ArrayList<>();
    // String str = key[index];

    // for (int i = 0; i < str.length(); i++) {
    // List<String> oldList = helper(digits.substring(1)); // def
    // for (int j = 0; j < oldList.size(); j++) {
    // newList.add(str.charAt(i) + newList.get(j));
    // }
    // }
    // return newList;
    // }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));

    }
}
