public boolean in3050(int a, int b) {
	boolean a40 = a <= 40 && a >= 30;
	boolean b40 = b <= 40 && a >= 30;

	boolean a50 = a <= 50 && a >= 40;
	boolean b50 = b <= 50 && b >= 40;

	return (a40 && b40) || (a50 && b50); 

}
