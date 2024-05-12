class Solution {
    public int reverse(int x) {

        int res=0;
        int temp=Math.abs(x);
    
        while(x!=0){
            int rem=temp%10;
            res=(res*10)+rem;
            temp=temp/10;
        }
        if(res>Integer.MAX_VALUE || res<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            res=res*(-1);
        }
        return (int)res;

    }
}