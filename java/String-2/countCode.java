public int countCode(String str) {
	int codes = 0;
	for (int i = 0; i < str.length() - 3; i++) {
		if (i+4 <= str.length()) {
			String s = str.substring(i,i+4);
			if (s.substring(0,2).equals("co") && 
					s.substring(3,4).equals("e")){
				codes++;
			}
		}
	}
	return codes;  
}


