public String stringBits(String str) {
	int i = 0;

	String result = "";

	while (i < str.length()) {
		result += str.substring(i, i+1);
		i+= 2;
	}

	return result;
}
