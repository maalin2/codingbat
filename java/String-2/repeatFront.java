public String repeatFront(String str, int n) {
	String result = "";
	String front = str.substring(0,n);
	for (int i = 0; i < n; i++) {
		result += front;
		front = front.substring(0, n - 1 - i);
	}
	return result;
}

