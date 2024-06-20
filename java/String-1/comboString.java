public String comboString(String a, String b) {
	String sh = a;
	String lo = b;

	if (b.length() < a.length()) {
		sh = b;
		lo = a;
	}

	return sh + lo + sh;  
}

