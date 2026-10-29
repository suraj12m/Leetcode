import java.util.Stack;
class Solution {
    public String removeDuplicates(String s) {
        Stack <Character> s1= new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!s1.isEmpty() && s.charAt(i)==s1.peek())
                s1.pop();
            else
                s1.push(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for(char ch:s1)
            sb.append(ch);
        return sb.toString();
    }
}