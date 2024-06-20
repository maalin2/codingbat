public boolean xyBalance(String str) {
	boolean b = false;

	if (str.indexOf("x") == -1) {
		return true;
	}

	int i = 0;
	while (i < str.length()) {
		if (str.substring(i,i+1).equals("x")) {
			b = str.substring(i).indexOf("y") > 0;
		}
		i++;
	}

	return b;
}
