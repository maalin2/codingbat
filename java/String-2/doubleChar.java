public String doubleChar(String str) {
	String result= "";
	for (int i = 0; i < str.length(); i++) {
		String ch = str.substring(i, i+1);
		result += ch + ch;
	}
	return result;
}

