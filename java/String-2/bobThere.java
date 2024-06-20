public boolean bobThere(String str) {
	int bobs = 0;

	for (int i = 0; i < str.length() - 2; i++) {
		String s = str.substring(i, i+3);
		if(s.substring(0,1).equals("b") && 
				s.substring(2,3).equals("b")) {
			bobs++;
		}
	}

	return bobs > 0; 
}
