class Solution {
    public boolean isValid(String s) {
        // b/c I only care about what is the potential match (queue) system, use a stack
        Stack x = new Stack();
        
        // empty string it must match
        if(s.length() == 0){
            return true;
        }
        
        
        // if it is a length of one it can't match
        if(s.length() > 1){
            //TODO this could be refractored with a single function instead of three seperate checks
            //TODO uses a lot of memory each time, char key maybe instead?
            
            
            // go through and push or pop each element
            for(int i = 0; i < s.length(); ++i){
                // if char is one of the opening, push to stack
                if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                    x.push(s.charAt(i));
                }
            
                // if it is a closing ')' check if it matches
                if(s.charAt(i) == ')'){
                
                // if the stack is empty it must be false
                if(x.empty()){
                    return false;
                }
                // if it equals, pop the top b/c there is a match
                if(x.peek().equals('(')){
                    x.pop();
                }
                // it can't now recover so false    
                else{
                    return false;

                }
            }
            
            // if the char is closing '}' check if it matches    
            if(s.charAt(i) == '}'){
                // if it is empty it must be false
                if(x.empty()){
                    return false;
                }
                // if it matches, pop the top of stack
                if(x.peek().equals('{')){
                    x.pop();
                }
                // not match means false
                else{
                    return false;
                    
                }
            }
            
            // if the char equals closing ']' check if it matches
            if(s.charAt(i) == ']'){
                // emtpy must mean false
                if(x.empty()){
                    return false;
                }
                // if matches pop the top and keep going
                if(x.peek().equals('[')){
                    x.pop();
                }
                // if not match it must be false
                else{
                    return false;
                    
                }
            }
        
        }
        // only true if the list is empty at the end    
        return x.empty();
        }
        // this catches if the list is of length 1
        return false;
    }
}
