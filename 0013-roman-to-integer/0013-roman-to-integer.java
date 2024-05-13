class Solution {
    public int romanToInt(String s) {
        int[] si= new int[s.length()];
        int res = 0;
        
        for(int i = 0; i<s.length(); i++)
        {
            switch(s.charAt(i)) {
                case 'I' : 
                {
                    si[i] = 1;
                    break;
                }
                case 'V' : 
                {
                    si[i] = 5;
                    break;
                }
                case 'X' : 
                {
                    si[i] = 10;
                    break;
                }
                case 'L' : 
                {
                    si[i] = 50;
                    break;
                }
                case 'C' : 
                {
                    si[i] = 100;
                    break;
                }
                case 'D' : 
                {
                    si[i] = 500;
                    break;
                }
                case 'M' : 
                {
                    si[i] = 1000;
                    break;
                }
            }
        }

        int i = 0;
        for(i = 0; i < s.length() - 1; i++){
            if(si[i] < si[i+1]) res-= si[i];
            else res += si[i];
        }
        res += si[i];
        return res;
    }
}