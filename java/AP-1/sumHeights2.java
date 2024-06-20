import java.lang.Math;

public int sumHeights2(int[] heights, int start, int end) {
	int sumDelta = 0;

	for (int i = start; i < end; i++) {
		int delta = heights[i+1] - heights[i];
		int deltaAbs = Math.abs(delta);

		if (delta > 0) {
			deltaAbs *= 2;
		}

		sumDelta += deltaAbs;
	}

	return sumDelta;
}

