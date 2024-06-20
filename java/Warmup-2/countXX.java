public int countXX(String str) {
	int count = 0;	

	int i = 0;
	while (i + 1 < str.length()) {
		if (str.substring(i, i+2).equals("xx")) {
			count++;
		}
		i++;
	}

	return count;
}
