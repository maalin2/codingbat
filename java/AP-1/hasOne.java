public boolean hasOne(int n) {
  int nCopy = n;
	while (nCopy != 0) {
		if (nCopy % 10 == 1) {
			return true;
		}	
		nCopy /= 10;
	}

	return false;
}
