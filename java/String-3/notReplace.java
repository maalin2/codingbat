public String notReplace(String str) {
	String result = "";

	for (int i = 0; i < str.length(); i++) {
		boolean validIs = (i + 1 < str.length() && str.substring(i, i + 2).equals("is")) &&
			!(i - 1 >= 0 && Character.isLetter(str.charAt(i - 1))) &&	
			!(i + 2 < str.length() && Character.isLetter(str.charAt(i + 2)));

		if (validIs) {
			result += "is not";
			i++;
		} else {
			result += str.charAt(i);
		}
	}

	return result;
}

