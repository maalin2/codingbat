public int round10(int n) {
	int round = (n / 10) * 10;
	if (n % 10 >= 5) {
		round = (1 +(round / 10)) * 10;
	}
	return round;
}

public int roundSum(int a, int b, int c) {
	return round10(a) + round10(b) + round10(c);
}
