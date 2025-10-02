class Solution {
    public static int intersectSize(int a[], int b[]) {
        // Your code here
        Set<Integer> set = new HashSet<>();
        int count = 0;

        // Insert elements of first array
        for (int num : a) {
            set.add(num);
        }

        // Check for common elements
        for (int num : b) {
            if (set.contains(num)) {
                count++;
                set.remove(num); // remove to ensure distinct counting
            }
        }

        return count;
    }
}