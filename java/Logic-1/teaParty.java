public int teaParty(int tea, int candy) {
	int v = 0;
	
	if (tea >= 5 && candy >= 5) v = 1;

	if (tea >= 2 * candy || candy >= 2 * tea) v = 2;

	if (tea < 5 || candy < 5) v = 0;	

	return v;  
}

