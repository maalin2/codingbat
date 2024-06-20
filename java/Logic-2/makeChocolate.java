public int makeChocolate(int small, int big, int goal) {
	int rem = 0;
	if (goal > 5*big) {
		rem = goal - (5*big);
	} else {
		rem = goal % 5;
	}

	if (rem <= small) {
		return rem;
	}

	return -1;
}



