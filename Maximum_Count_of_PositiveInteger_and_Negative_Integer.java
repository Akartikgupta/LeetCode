
public class Maximum_Count_of_PositiveInteger_and_Negative_Integer {
    public static void main(String[] args) {

        int arr[] = { -3, -2, -1, 0, 0, 1, 2 };
        System.out.println(maximumCount(arr));

    }

    public static int maximumCount(int[] nums) {
        int pos = 0;
        int neg = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                pos++;
            } else if (nums[i] < 0) {
                neg++;
            }
        }
        if (pos > neg) {
            return pos;
        } else {
            return neg;
        }
    }

}
