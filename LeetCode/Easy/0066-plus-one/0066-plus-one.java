class Solution {
    public int[] plusOne(int[] arr) {

        int i = arr.length - 1;

        while (i >= 0 && arr[i] == 9) {
            arr[i] = 0;
            i--;
        }

        if (i >= 0) {
            arr[i]++;
            return arr;
        }

        int[] ans = new int[arr.length + 1];
        ans[0] = 1;
        return ans;
    }
}