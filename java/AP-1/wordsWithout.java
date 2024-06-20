public String[] wordsWithout(String[] words, String target) {
	int count = 0;

	for (int i = 0; i < words.length; i++) {
		String word = words[i];
		if (word.equals(target)) {
			words[i] = "";
			count++;
		}
	}  

	String[] without = new String[words.length - count];
	int j = 0;
	for (int i = 0; i < without.length; i++) {
		while (words[j].equals("")) {
			j++;
		}

		without[i] = words[j];
		j++;
	}

	return without;
}


