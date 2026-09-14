class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zeros = 0;
        int last = 0;

        // Find how many zeros can actually be duplicated
        while (last + zeros < n) {
            if (arr[last] == 0) {
                zeros++;
            }
            last++;
        }

        // Handle the zero that reaches the last position
        if (last + zeros > n) {
            last--;
            zeros--;
            arr[n - 1] = 0;
        }

        last--;

        // Shift everything backwards
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + zeros] = 0;
                zeros--;
                arr[i + zeros] = 0;
            } else {
                arr[i + zeros] = arr[i];
            }
        }
    }
}