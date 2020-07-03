public int fibonacci(int n) {
  // base case 0 returns 0
  if(n == 0) return 0;
  // base case 1 returns 1
  if(n == 1) return 1;
  // otherwise it is equal to the sum of the former two numbers 
  return fibonacci(n -1) + fibonacci(n-2);
}
