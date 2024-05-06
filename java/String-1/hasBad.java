public boolean hasBad(String str) {
	if (str.length() < 3) {
		return false;
	} else {
		return (str.length() > 2 && str.substring(0,3).equals("bad")) || (str.length() > 3 && str.substring(1,4).equals("bad"));
	}
}


