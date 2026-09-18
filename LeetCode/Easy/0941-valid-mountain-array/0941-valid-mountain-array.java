class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        int i = 0;

        // Climb up
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }

        // Peak cannot be first or last
        if (i == 0 || i == n - 1) {
            return false;
        }

        // Go down
        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == n - 1;
    }
}