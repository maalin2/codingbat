public boolean scoresIncreasing(int[] scores) {
  for (int i = 0; i < scores.length; i++) {
    if (i + 1 < scores.length && scores[i] > scores[i+1]) {
      return false;
    } 
  }
  
  return true;
}

