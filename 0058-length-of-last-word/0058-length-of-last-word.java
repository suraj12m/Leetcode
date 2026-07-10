class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        s=" "+s;
        String w="";
        int len=s.length();
        int n=0;
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            if (ch==' '){
                w="";
            }
            else{
             w=w+ch;
             n=w.length();
            }
        }
        return(n);

    }
}