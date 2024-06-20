public int countYZ(String str) {
	int count = 0;
	String str2 = str.toLowerCase();


	String word = "";
	for (int i = 0; i < str.length(); i++) {
		char ch = str2.charAt(i);

		if (i + 1 < str.length() && 
				Character.isLetter(str.charAt(i + 1)))	{
			word += ch;

		} else {
			if (ch == 'y' || ch == 'z') {
				count++;
			}
			word = "";
		}
	}

	return count;
}

