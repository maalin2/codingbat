public boolean scoresClump(int[] scores) {
	for (int i = 0; i < scores.length; i++) {
		if (i+2 < scores.length && 
				(scores[i+1] - scores[i] <= 2 && scores[i+2] - scores[i+1] <= 2 &&
				scores[i+2] - scores[i] <= 2)) {
			return true;
		}
	}

	return false;
}

