public class Count_Good_Numbers {
    public static int countGoodNumbers(long n) {
        int MOD = 1000000007;
        int evenChoices = 5; // Digits: 0, 2, 4, 6, 8
        int oddChoices = 4; // Digits: 2, 3, 5, 7

        // Calculate the number of even and odd positions
        long evenCount = (n + 1) / 2;
        long oddCount = n / 2;

        // Compute the result with modulo at each multiplication step
        long evenResult = 1;
        for (int i = 0; i < evenCount; i++) {
            evenResult = (evenResult * evenChoices) % MOD;
        }

        long oddResult = 1;
        for (int i = 0; i < oddCount; i++) {
            oddResult = (oddResult * oddChoices) % MOD;
        }

        // Final result
        long totalResult = (evenResult * oddResult) % MOD;

        return (int) totalResult;
    }

    public static void main(String[] args) {
        int ans = countGoodNumbers(4);
        System.out.println(ans);
    }
}
