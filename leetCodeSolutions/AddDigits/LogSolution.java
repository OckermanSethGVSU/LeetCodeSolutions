class LogSolution {
    /*
    * O(log(n)) approach; just keep adding the digits until it works. 
    */
    public int addDigits(int num) {
        
        // second num to check if it is one digit
        int changedNum = 0;
        // keep going until a solution is found
        while(num > 0){
            // add the last digit of sum onto the changed number
            changedNum += num % 10;
            
            // takeoff the last digit of num
            num = num / 10;
            
            // if changed num is not one digit and you went through all possibilities, try again
            if(changedNum > 9 && num == 0){
                num = changedNum;
                changedNum = 0;
            }
        }
        return changedNum;
        
        
    }
}
