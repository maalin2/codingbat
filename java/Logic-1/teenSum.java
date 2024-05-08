public int teenSum(int a, int b) {
	int sum = a+b;
	if ((b <= 19 && b >= 13) || (a <= 19 && a >= 13)) {
		sum = 19;
	} 

	return sum; 
}

