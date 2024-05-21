public boolean dividesSelf(int n) {
  int nCopy = n;
  while (nCopy != 0) {
    int digit = nCopy % 10;
    if (digit == 0) {
      return false;
    }
    
    if (n % digit != 0) {
      return false;
    }
    
    nCopy /= 10;
  }
  
  return true;
}
