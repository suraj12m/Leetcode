import java.util.*;
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                int fst=s.pop();
                int sec=s.peek();
                s.push(fst);
                s.push(fst+sec);}
            else if(operations[i].equals("D"))
                s.push(s.peek()*2);
            else if(operations[i].equals("C"))
                s.pop();
            else
                s.push(Integer.parseInt(operations[i]));
        }   
        int sum=0;
        for(int score:s){
            sum+=score;
        }
        return sum;
        
    }
}