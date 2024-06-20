public boolean loneTeen(int a, int b) {
	boolean aTeen = a <= 19 && a >= 13;
	boolean bTeen = b <= 19 && b >= 13;

	// simple
	return aTeen ^ bTeen; 
}
