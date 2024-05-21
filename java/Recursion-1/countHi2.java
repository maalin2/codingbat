public int countHi2(String str) {
  // solve from the right
  int len = str.length();
  if (len < 2) {
    return 0;
  }
  
  if (str.substring(len-2, len).equals("hi")) {
    if ((len - 3 >= 0 && str.charAt(len - 3) != 'x') || 
        len == 2) {
      return 1 + countHi2(str.substring(0, len - 2));
    } else {
      return countHi2(str.substring(0, len - 1));
    }
  } else {
    return countHi2(str.substring(0, len - 1));
  }
}

