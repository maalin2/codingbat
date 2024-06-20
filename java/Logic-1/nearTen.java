public boolean nearTen(int num) {
	int mod = num % 10;
	return mod == 8 || mod == 9 || mod == 0 || mod == 1 || mod == 2;
}

