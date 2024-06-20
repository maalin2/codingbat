public boolean equalIsNot(String str) {
	int is = 0;
	int not = 0;

	int len = str.length();
	for (int i = 0; i < len - 1; i++) {
		if (i <= len - 2 && str.substring(i, i + 2).equals("is")) {
			is++;
		}

		if (i <= len - 3 && str.substring(i, i + 3).equals("not")) {
			not++;
		}

	}


	return is == not;
}
