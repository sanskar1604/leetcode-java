class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        // 2. Initialize with first interval
        int start = intervals[0][0];
        int end = intervals[0][1];

        // 3. Traverse intervals
        for (int i = 1; i < intervals.length; i++) {
            int currStart = intervals[i][0];
            int currEnd = intervals[i][1];

            // Overlapping intervals
            if (currStart <= end) {
                end = Math.max(end, currEnd);
            } 
            // Non-overlapping
            else {
                result.add(new int[]{start, end});
                start = currStart;
                end = currEnd;
            }
        }

        // Add last interval
        result.add(new int[]{start, end});

        // 4. Convert List to Array
        return result.toArray(new int[result.size()][]);
    }
}