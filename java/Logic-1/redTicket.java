public int redTicket(int a, int b, int c) {
	if (a == b && a == c) {
		if (a == 2) {
		  return 10;
		} else {
		  return 5;
		}
	}

	if (a != b && a != c) {
	  return 1;
	} 
	
	return 0;  
}
