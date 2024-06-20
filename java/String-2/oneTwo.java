public String oneTwo(String str) {
	String result = "";
	for (int i = 0; i < str.length(); i += 3) {
		if (i+3 <= str.length()) {
			String s = str.substring(i, i+3);
			result += s.charAt(1);
			result += s.charAt(2);
			result += s.charAt(0);
		}
	}		


	return result; 
}

