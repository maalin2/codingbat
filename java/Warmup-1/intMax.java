public int intMax(int a, int b, int c) {
	int max = a;

	if (max < b) {
		max = b;
	}
	
	if (max < c) {
		max = c;
	}

	return max;
}
