class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        long ans=0;
        int sign=1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
             if(i==0 && s.charAt(0)=='-'){
                sign=-1;
                continue;
            }
             if(i==0 && s.charAt(0)=='+'){
                sign=1;
                continue;
            }
                if(!Character.isDigit(ch))
                    break;
                int a=ch-'0';
                if(sign==1 && ans>(2147483647L-a)/10)
            return 2147483647;
        if(sign==-1 && ans>(2147483647L-a)/10)
            return -2147483648;
                ans=ans*10+a;
        }
        
        
        return (int)(ans*sign);
    }
}