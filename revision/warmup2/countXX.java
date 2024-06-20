int countXX(String str) {
	boolean lastX = false;
	int count = 0;

	for (int i = 0; i < str.length(); i++) {
		if (str.charAt(i) == 'x') {
			if (lastX) {
				count++;
			} else {
				lastX = true;
			}
		} else {
			lastX = false;
		}
	}

	return count;
}

