public boolean squirrelPlay(int temp, boolean isSummer) {
	int high = 90;

	if (isSummer) {
		high = 100;
	}

	return temp >= 60 && temp <= high;

}

