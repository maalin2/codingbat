public boolean catDog(String str) {
	int cats = 0;
	int dogs = 0;

	for (int i = 0; i < str.length() - 2; i++) {
		String s = str.substring(i, i+3);

		if (s.equals("cat")) cats++;
		if (s.equals("dog")) dogs++;
	}

	return cats == dogs; 
}
