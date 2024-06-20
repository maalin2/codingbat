public String startOz(String str) {
	String result = str;

	if (str.length() > 1) { 
		result = "";
		if (str.substring(0,1).equals("o")) {
			result += "o";
		}

		if (str.substring(1,2).equals("z")) {
			result += "z";
		}

	}

	return result;
}
