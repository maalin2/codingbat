public String wordEnds(String str, String word) {
	String result = "";

	int wordLen = word.length();
	int len = str.length();
	for (int i = 0; i < len; i++) {
		if (i + wordLen <= len &&
				str.substring(i, i + wordLen).equals(word)) {
			if (i > 0) {
				result += str.charAt(i - 1);
			}

			if (i + wordLen < len) {
				result += str.charAt(i + wordLen);
			}
		}
	}

	return result;
}

