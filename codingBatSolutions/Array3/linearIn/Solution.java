class Solution{

  public boolean linearIn(int[] outer, int[] inner) {
    int in = 0;
    int out = 0;
    int count = 0;
  
    while(in < inner.length){
      if(inner[in] == outer[out]){
        ++count;
        ++in;
        out = 0;
      }
    
      else if(out == outer.length - 1){
        ++in;
        out = 0;
      }
    
      else{
        ++out;
      }
    }
    return count == inner.length; 
  }
}
