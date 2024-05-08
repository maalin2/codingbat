public String fizzString2(int n) {
	String r = "";	

	if (n % 3 == 0) r += "Fizz";
	if (n % 5 == 0) r += "Buzz";

	if (r.equals("")) r = Integer.toString(n);

	r += "!";

	return r;
}


