
class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        //if not even
        if(len%2 != 0){
            return false;
        } 
        Stack<Character> par = new Stack<>();
        for(int i = 0;i<len;i++){
            char ch = s.charAt(i);
            if(ch == '[' || ch == '{' || ch == '('){
                par.push(ch);
                continue;
            }
            if(par.isEmpty()){
                return false;
            }
            if(ch == ']' && par.peek() == '['){
                par.pop();
            }
            else if(ch == '}' && par.peek() == '{'){
                par.pop();
            }
            else if(ch == ')' && par.peek() == '('){
                par.pop();
            }
            else{
                return false;
            }
        }
        if(par.isEmpty()){
            return true;
        }
        return false;
    }
}