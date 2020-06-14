public String middleTwo(String str) {
  // placeholder for middle
  int middle = 0;
  
  // get me the middle
  middle = str.length()/2 ;
  
  /*
  * 0 indexed, so reduce start by one, substring is non-inculsive with its end so stop
  * one further than you need
  */
  return str.substring(middle -1 ,middle + 1);
}
