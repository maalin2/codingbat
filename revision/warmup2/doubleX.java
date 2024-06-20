boolean doubleX(String str) {
	int index = str.indexOf("x");

	if (index == -1) {
		return false;
	}

	if (index + 1 < str.length()) {
		return str.charAt(index + 1) == 'x';
	}
	
	return false;
}

