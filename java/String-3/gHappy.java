public boolean gHappy(String str) {
	int len = str.length();

	for (int i = 0; i < len; i++) {
		if (str.charAt(i) == 'g') {
			if ((i - 1 < 0 || str.charAt(i - 1) != 'g') && 
					(i + 1 >= len || str.charAt(i + 1) != 'g')) {
				return false;
			} 
		}
	}

	return true;
}

