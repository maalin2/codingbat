public String mixString(String a, String b) {
	String result = "";
	String aChar = "";
	String bChar = "";
	int i = 0;
	while (i < a.length() && i < b.length()) {
		aChar = a.substring(i,i+1);
		bChar = b.substring(i,i+1);
		result += aChar + bChar;
		i++;
	}

	result += a.substring(i) + b.substring(i);	  

	return result;
}

