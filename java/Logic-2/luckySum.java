public int luckySum(int a, int b, int c) {
	int sum = a + b + c;
	
	if (a == 13) {
		sum = 0;
	}

	if (b == 13 && a != 13) {
		sum = a;
	}
	
	if (c == 13 && b != 13 && a != 13) {
		sum = a + b;
	}

  return sum;
}

