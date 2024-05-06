
public String firstTwo(String str) {
	String front = str;
	if (str.length() > 1) {
		front = str.substring(0,2);
	}  
	return front;
}

