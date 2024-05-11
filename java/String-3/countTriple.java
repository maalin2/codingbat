public int countTriple(String str) {
	int triple = 0;

	int len = str.length();
	for (int i = 0; i < len - 2; i++) {
		if ((i + 2 < len) && (str.charAt(i) == str.charAt(i + 1) && str.charAt(i + 2) == str.charAt(i))) {
			triple++;
		}

	}

	return triple;  
}


