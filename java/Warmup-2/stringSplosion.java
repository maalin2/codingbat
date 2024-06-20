public String stringSplosion(String str) {
	String result = "";

	int i = 0;
	while (i < str.length()) {
		result += str.substring(0,i + 1);
		i++;
	}

	return result;
}
