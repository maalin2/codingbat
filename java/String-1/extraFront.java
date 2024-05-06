public String extraFront(String str) {
	String front = str;
	if (str.length() > 2) {
		front = str.substring(0,2);
	}  

	return front + front + front;
}

