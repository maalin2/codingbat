public int[] seriesUp(int n) {
	int[] result = new int[n*(n+1) / 2];

	int i = 0;

	for (int j = 0; j < n; j++) {
		for (int j = 0; k < j; k++) {
			result[i + 2] = k;
		} 
		
	}



	return result;
}
