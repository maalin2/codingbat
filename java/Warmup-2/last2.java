public int last2(String str) {
	int count = 0;

	if (str.length() > 1) {

		String end = str.substring(str.length() - 2);
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i+2).equals(end)) count++;
		}
	}

	return count;
}

