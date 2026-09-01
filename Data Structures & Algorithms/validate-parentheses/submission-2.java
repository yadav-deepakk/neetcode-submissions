class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if("([{".indexOf(c)!=-1) {
                stack.push(c); 
            } else if(")}]".indexOf(c)!=-1 && stack.isEmpty()) {
                return false; 
            } else {
                char top = stack.peek();
                if(top=='[' && c==']') stack.pop(); 
                else if(top=='(' && c==')') stack.pop(); 
                else if(top=='{' && c=='}') stack.pop(); 
                else return false; 
            }
        }
        return stack.size() == 0; 
    }
}
