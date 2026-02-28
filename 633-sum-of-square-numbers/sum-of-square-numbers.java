class Solution {
    public boolean judgeSquareSum(int c) {
        long i = 0;
        long j = (long)Math.sqrt(c);
        boolean isSum = false;
        while(i <= j){
            if(i * i + j * j > c){
                j--;
            }else if(i * i + j * j < c){
                i++;
            }
            else{
                isSum = true;
                break;
            }
        }
        return isSum;
    }
}