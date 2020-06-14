public String withouEnd2(String str) {
  // of the string is length less than 3, removing front and end results in an empty string
  if(str.length() < 3) return "";
  // otherwise return the substring with the first and last letter missing
  return str.substring(1,str.length() - 1);
}
