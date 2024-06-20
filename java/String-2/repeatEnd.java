public String repeatEnd(String str, int n) {
	String result = "";
	String end = str.substring(str.length() - n);
	for (int i = 0; i < n; i++) {
		result += end;
	}
	return result;
}

