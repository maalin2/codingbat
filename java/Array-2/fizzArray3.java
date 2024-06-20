public int[] fizzArray3(int start, int end) {
	int[] fizz = new int[end - start];

	for (int i = start; i < end; i++) {
		fizz[i - start] = i;
	}

	return fizz;  
}

