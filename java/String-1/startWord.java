public String startWord(String str, String word) {
	String result = "";

	if (word.length() <= str.length() && 
	str.substring(1).indexOf(word.substring(1)) != -1) {
		result = str.substring(0, word.length());
	}

	return result;  
}


