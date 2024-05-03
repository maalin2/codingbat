boolean doubleX(String str) {
	if (str.length() < 2) {
		return false;
	}	

	return (str.length() > str.indexOf("x") + 1) && (str.charAt(str.indexOf("x") + 1) == 'x');
}
