public int caughtSpeeding(int speed, boolean isBirthday) {
	int verdict = 0;
	int low = 60;
	int high = 80;
	if (isBirthday) {
		high = 85;
		low = 65;
	}

	if (speed > low && speed <= high) {
		verdict = 1;
	}

	if (speed > high) {
		verdict = 2;
	}

  return verdict;
}

