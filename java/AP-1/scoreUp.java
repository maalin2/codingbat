public int scoreUp(String[] key, String[] answers) {
	int score = 0;

	for (int i = 0; i < answers.length; i++) {
		String answer = answers[i];
		String correct = key[i];

		if (answer.equals(correct)) {
			score += 4;
		} else if (!answer.equals("?")) {
			score -= 1;
		}
	}  
	
	return score;
}
