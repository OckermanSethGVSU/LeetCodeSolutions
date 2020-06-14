public int factorial(int n) {
  // get it to its base case
  if(n == 1) return 1;
  // otherwise multiply by n and go down towards base case
  return n * factorial(n-1);
}
