class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int[][] temp = new int[n+1][2];

        int idx = 0;
        boolean inserted = false;

        for(int i = 0; i < n; i++){
            if(!inserted && intervals[i][0] >= newInterval[0]){
                temp[idx++] = newInterval;
                inserted = true;
            }
            temp[idx++] = intervals[i];
        }
        if(!inserted){
            temp[idx++] = newInterval;
        }

        return merge(temp, idx);
    }

    public int[][] merge(int[][] temp, int size){
        int[][] ans = new int[size][2];

        int start1 = temp[0][0];
        int end1 = temp[0][1];
        int idx = 0;
        for(int i = 1; i < size; i++){
            int start2 = temp[i][0];
            int end2 = temp[i][1];

            if(start2 <= end1){
                end1 = Math.max(end1, end2);
                continue;
            }else{
                ans[idx][0] = start1;
                ans[idx][1] = end1;
                idx++;
                start1 = start2;
                end1 = end2;
            }
        }
        ans[idx][0] = start1;
        ans[idx][1] = end1;
        idx++;

        return java.util.Arrays.copyOf(ans, idx);
    }
}