public String frontTimes(String str, int n) {
	String front = str;

	if (str.length() > 3) {
		front = str.substring(0,3);
	}

	String res = "";
	for (int i = 0; i < n; i++) {
		res += front;
	}

  return res;
}

