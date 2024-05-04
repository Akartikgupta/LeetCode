

import java.util.*;
public class Missing_Common_Value {
    public static void main(String[] args) {
        int nums1[] = { 1, 2 };
        int nums2[] = { 2, 4 };
        System.out.println(getCommon(nums1, nums2));
    }

    public static int getCommon(int[] nums1, int[] nums2) {
        for (int i = 0; i <= nums1.length - 1; i++) {
            for (int j = 0; j <= nums2.length - 1; j++) {
                if (nums1[i] == nums2[j]) {
                    int com = nums1[nums1.length - 1];
                    if (nums1[i] <= com) {
                        return nums1[i];
                    }
                }
            }
        }
        return -1;
    }
}
