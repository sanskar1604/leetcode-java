class Solution {
    public int maximumSum(int[] arr) {
        int nodelete = arr[0];
        int onedelete = Integer.MIN_VALUE;
        int result = arr[0];

        for(int i = 1; i < arr.length; i++){
            int prevnodelete = nodelete;
            int prevonedelete = onedelete;

            nodelete = Math.max(arr[i], arr[i] + nodelete);
            int v1 = 0;
            if(prevonedelete == Integer.MIN_VALUE){
                v1 = arr[i];
            }else{
                v1 = prevonedelete + arr[i];
            }

            onedelete = Math.max(v1, prevnodelete);

            result = Math.max(result, Math.max(nodelete, onedelete));
        }

        return result;
    }
}