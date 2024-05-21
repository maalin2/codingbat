public int strDist(String str, String sub) {
  int subLen = sub.length();
  int len = str.length();
  if (len < subLen) {
    return 0;
  }
  
  if (str.substring(0,subLen).equals(sub)) {
    if (str.substring(len - subLen).equals(sub)) {
      return str.length();
    } else {
      return strDist(str.substring(0, len - 1), sub);
    }
  } else {
    return strDist(str.substring(1), sub);
  }
}

