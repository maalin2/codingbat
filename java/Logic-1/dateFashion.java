public int dateFashion(int you, int date) {
	int verdict = 1;
	
	if (you >= 8 || date >= 8) {
		verdict = 2;
	}

	if (you <= 2 || date <= 2) {
		verdict = 0;
	}

	return verdict;  
}

