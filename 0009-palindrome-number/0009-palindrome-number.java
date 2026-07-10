class Solution {
    public boolean isPalindrome(int x) {
        if (x<0)
            return false;
        int x1=x,rev=0;
        while(x!=0){
            rev=rev*10+(x%10);
            x/=10;
        }
        if(rev==x1)
            return true;
        else
            return false;
    }
}