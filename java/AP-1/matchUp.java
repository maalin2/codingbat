public int matchUp(String[] a, String[] b) {
	int count = 0;

	for (int i = 0; i < a.length; i++) {
		String aStr = a[i];
		String bStr = b[i];
		
		if ((aStr.length() > 0 && bStr.length() > 0) &&
				aStr.charAt(0) == bStr.charAt(0)) {
			count++;
		}
	}

	return count;  
}


