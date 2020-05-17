import java.math.BigInteger;
class Solution {
    public int reverse(int x) {
        if( x <= Math.pow(2,31) && x >= Math.pow(2,31) * -1 ){
        boolean contains = false;
        String og = Integer.toString(x);
        
        BigInteger result;
        BigInteger neg = new BigInteger("-1");

        if(og.contains("-")){
            og = og.substring(1);
            contains = true;
        }
        String reversed = "";
        
        int j = og.length() -1;
        for(int i = 0; i < og.length(); i ++){
            reversed += og.charAt(j);
            --j;
        }
        result = new BigInteger(reversed);
        if(contains){
            result = result.multiply(neg);
        }
            
        return result.intValue();
        }
        
        return 0;
    }
}
