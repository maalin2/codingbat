public String plusOut(String str, String word) {
  String result = "";

	for (int i = 0; i < str.length(); i++) {
		if (i + word.length() <= str.length()) {
			String test = str.substring(i, i + word.length());

			if (test.equals(word)) {
				result += word;
				i	+= word.length() - 1;
			} else {
				result += "+";
			}
		} else {
				result += "+";
		}
	}

	return result;
}
