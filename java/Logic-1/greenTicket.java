public int greenTicket(int a, int b, int c) {
	if (a == b && a == c) {
		return 20;
	}

	if (a != b && a != c && b != c) {
		return 0;
	}

	return 10;
}

