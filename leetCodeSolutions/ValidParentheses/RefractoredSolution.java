class RefractoredSolution {
    public boolean isValid(String s) {
        // b/c I only care about what is the potential match (queue) system, use a stack
        Stack x = new Stack();
        
        // empty string it must match
        if(s.length() == 0) return true;
        
        // if it is a length of one it can't match
        if(s.length() == 1) return false; 
            // go through and push or pop each element
            for(int i = 0; i < s.length(); ++i){
                // if char is one of the opening, push to stack
                if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                    x.push(s.charAt(i));
                }
                // if it is closing check
                if(s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}'){
                    if(x.empty()) return false;
                    // if it does not match it can't ever so return false
                    if( (s.charAt(i) == ')') && (!x.peek().equals('(')) ) return false;
                    if( (s.charAt(i) == '}') && (!x.peek().equals('{')) ) return false;
                    if( (s.charAt(i) == ']') && (!x.peek().equals('[')) ) return false;
                    // if you make it through it must match so pop and continue 
                    x.pop();
                }
            }
        // if list isn't empty than it must be false
        return x.empty();
    }
}
