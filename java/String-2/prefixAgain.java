public boolean prefixAgain(String str, int n) {
	String prefix = str.substring(0, n);
	String suffix = str.substring(n);

	return suffix.indexOf(prefix) != - 1;
}
