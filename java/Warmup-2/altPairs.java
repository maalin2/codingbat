
public String altPairs(String str) {
	String result = "";

	int i = 0;
	while (i < str.length()) {
		result += str.charAt(i);
		if (i + 1 < str.length()) {
			result += str.charAt(i+1);
		}
		i+= 4;
	}	

	return result;


}

