public int countPairs(String str) {
  if (str.length() == 0) {
    return 0;
  }
  
  if (str.length() > 2 && str.charAt(0) == str.charAt(2)) {
    return 1 + countPairs(str.substring(1));
  } else {
    return countPairs(str.substring(1));
  }
}

