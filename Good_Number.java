// https://leetcode.com/problems/find-the-number-of-good-pairs-i/
public class Good_Number {
    public static int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int result = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int rem = nums1[i] % (nums2[j] * k);
                if (rem == 0) {
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int nums1[] = { 1, 3, 4 };
        int nums2[] = { 1, 3, 4 };
        System.out.println(numberOfPairs(nums1, nums2, 1));

    }
}
