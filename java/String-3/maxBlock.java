public int maxBlock(String str) {
	if (str.equals("")) {
		return 0;
	}

	int maxLen = 1;
	char blockChar = str.charAt(0);
	int blockLen = 1;
	for (int i = 1; i < str.length(); i++) {
		if (str.charAt(i) == blockChar) {
			blockLen++;

			if (maxLen < blockLen) {
				maxLen = blockLen;
			}
		} else {
			blockLen = 1;
			blockChar = str.charAt(i);
		}
	}

	return maxLen;
}


