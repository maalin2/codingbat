public String fizzString(String str) {
	String r = "";

	if (str.length() > 0 && str.charAt(0) == 'f') r += "Fizz";
	
	if (str.length() > 0 && str.charAt(str.length() - 1) == 'b') r += "Buzz";

	if (r.equals("")) r = str;
	
	return r;
}

