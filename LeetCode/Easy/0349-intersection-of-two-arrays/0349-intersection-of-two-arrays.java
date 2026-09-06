class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int n : nums1)
            set.add(n);

        for (int n : nums2) {
            if (set.remove(n))
                list.add(n);
        }

        int ans[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            ans[i] = list.get(i);

        return ans;
    }
}