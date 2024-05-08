public int maxMod5(int a, int b) {
	if (a == b) {
		return 0;
	}


	if (a % 5 == b % 5) {
		int min = a;
		if (a >= b) min = b;
		return min;
	} else {
		int max = a;
		if (a < b) max = b;
		return max;
	}

  
}
