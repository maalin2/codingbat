public int blackjack(int a, int b) {
 if (a > 21 && b > 21) {
		return 0;
	}

	int max = a;
	if (a > 21) {
		max = b;
	} 

	if (b > a && b <= 21) {
		max = b;
	}

	return max;
}
