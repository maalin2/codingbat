import java.lang.Math;

public int sumHeights(int[] heights, int start, int end) {
  int sumDelta = 0;
  
  for (int i = start; i < end; i++) {
    int delta = Math.abs(heights[i+1] - heights[i]);
		sumDelta += delta;
  }
  
  return sumDelta;
}

