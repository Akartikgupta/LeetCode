// Approach is to find the sum of n number in an array
//  Sn=n(n+1)/2
// after finding the sum of n numbers
// find the sum of array's element
// then subtract the sum - array's sum 
public class Missing_Number {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5 };
        System.out.println(missingNumber(arr));

    }

    public static int missingNumber(int[] nums) {
        int pr = 0;
        int last = nums[nums.length - 1]; // last =5
        int sum = last * (last + 1) / 2;// sum =15
        // calculating the sum of array's element
        for (int i = 0; i <= nums.length - 1; i++) {
            pr = pr + nums[i];
        }
        return sum - pr;

    }

}
