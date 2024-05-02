public String notString (String str) {
	String result = "";
	
	if (str.length() > 2 && str.substring(0,3).equals("not")) {
		result = str;
	} else {
		result = "not " + str;
	}

	return result;

}
