public String zipZap(String str) {
	String result = "";

	int i = 0;
	while (i < str.length()) {
		if (i + 3 > str.length()) {
			result += str.substring(i);
			i+= 3;
		} else {
			if (str.charAt(i) == 'z' && 
					str.charAt(i+2) == 'p') {
				result += "zp";
				i+=3 ;
			} else {
				result += str.charAt(i);
				i++; 
			}
		}
	}

	return result;   
}
