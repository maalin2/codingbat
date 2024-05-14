public int[] squareUp(int n) {
	int[] sq = new int[n*n];

	int nCopy = n;
	for (int i = 0; i < n; i++) {
		int pos = n*n - i - 1;
		for (int j = 0; j < nCopy; j++) {
			sq[pos - n*j] = i + 1;
		}

		nCopy -= 1;
	}

	return sq;
}
