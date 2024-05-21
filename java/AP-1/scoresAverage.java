public int scoresAverage(int[] scores) {
	int front = average(scores, 0, scores.length/2);
	int back = average(scores, scores.length/2, scores.length);

	int max = front;
	if (back > max) {
		max = back;
	}

	return max;
}

int average(int[] scores, int start, int end) {
	int sum = 0;
	for (int i = start; i < end; i++) {
		sum += scores[i];
	}
	int n = end - start;
	return (sum) / n;
}
