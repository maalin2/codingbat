public boolean xyzMiddle(String str) {
	if (str.length() < 2) {
		return false;
	}

	int index = str.indexOf("xyz");
	if (index == -1) {
		return false;
	}

	int len = str.length();
	int middle = len / 2;
	if (len % 2 == 0) {
		return str.substring(middle-1, middle+2).equals("xyz") || 
			str.substring(middle-2, middle+1).equals("xyz");
	} else {
		return str.substring(middle - 1, middle + 2).equals("xyz");
	}
}


