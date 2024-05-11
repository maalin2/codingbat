public String starOut(String str) {
	String res = "";

	for (int i = 0; i < str.length(); i++) {
		if (!((i > 0 &&
						str.charAt(i - 1) == '*') ||
					(str.charAt(i) == '*') ||
					i < str.length() - 1 && 
					str.charAt(i + 1) == '*')) {
			res += str.charAt(i);
		}
	}

	return res;
}

