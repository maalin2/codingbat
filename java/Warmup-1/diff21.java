import java.lang.Math;

public int diff21(int n) {
	int diff = Math.abs(n - 21);
	
	if (n > 21) {
		diff *= 2;
	}

	return diff;

}

