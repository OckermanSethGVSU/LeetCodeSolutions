public int bunnyEars(int bunnies) {
  // if there are no bunnies, there are no ears
  if(bunnies == 0) return 0;
  // if there is one bunny, there are two ears
  if(bunnies == 1) return 2;
  // otherwise, keep going down to base case, and adding two for each bunny
  return 2 + bunnyEars(bunnies-1);
}
