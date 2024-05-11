public String mirrorEnds(String string) {
	String mirror = "";

	for (int i = 0; i < string.length(); i++) {
		char forward = string.charAt(i);
		char backward = string.charAt(string.length() - 1 - i);

		if (forward == backward) {
			mirror += forward;
		} else {
			return mirror;
		}
	}

	return mirror;  
}
