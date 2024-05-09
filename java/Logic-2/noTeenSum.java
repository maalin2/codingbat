public int fixTeen(int n) {
	int fix = n;
	if ((n >= 13 && n <= 19) && (n != 15 && n != 16)) {
		fix = 0;
	}
	return fix;	
}

public int noTeenSum(int a, int b, int c) {
	int sum = fixTeen(a) + fixTeen(b) + fixTeen(c);
	return sum;
}


