public String sameEnds(String string) {
	int len = string.length();
	int start = len / 2 + 1;
	if (len % 2 == 0) {
		start -= 1;
	}

	int end = len/2;

	for (int i = 0; i <= end; i++) {
		if (string.substring(0, end).
				equals(string.substring(start))) {
			return string.substring(0, end);
		} else {
			start += 1;
			end -= 1;
		}
	}	

	return "";
}


