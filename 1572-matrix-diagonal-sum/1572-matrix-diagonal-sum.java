class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int sum1=0;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i]==mat[j]){
                    sum+=mat[i][j];
                }
                else if((i+j)==(n-1)){
                    sum1+=mat[i][j];
                }
            }
        }
        return sum+sum1;
    }
}