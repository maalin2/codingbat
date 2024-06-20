public int scoresSpecial(int[] a, int[] b) {
	int specialA = findSpecial(a);
	int specialB = findSpecial(b);

	return specialA + specialB;
}

int findSpecial(int[] arr) {
	int max = 0;

	for (int n : arr) {
		if (n % 10 == 0 && n > max) {
			max = n;
		}
	}

	return max;
}
