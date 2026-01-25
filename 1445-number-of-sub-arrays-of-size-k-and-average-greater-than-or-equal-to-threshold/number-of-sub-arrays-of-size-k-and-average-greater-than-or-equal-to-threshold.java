class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left = 0, right = 0, avg = 0, sum = 0, count = 0;

        for(int i = 0; i < k; i++){
            sum += arr[i];
        }
        avg = sum/k;

        if(avg >= threshold){
            count++;
        }

        for(int i = k; i < arr.length; i++){
            sum = sum - arr[i-k] + arr[i];
            avg = sum/k;

            if(avg >= threshold){
                count++;
            }
        }

        return count;
    }
}