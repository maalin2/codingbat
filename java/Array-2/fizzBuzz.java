public String[] fizzBuzz(int start, int end) {
	String[] fb = new String[end - start];

	for (int i = 0; i < fb.length; i++) {
		int n = i + start;
		String str = "";

		if (n % 3 == 0) {
			str += "Fizz";
		}

		if (n % 5 == 0) {
			str += "Buzz";
		}


		if (str.equals("")) {
			str = String.valueOf(n);
		}

		fb[i] = str;
	}

	return fb;
}
