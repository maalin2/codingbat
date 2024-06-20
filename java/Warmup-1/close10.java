import java.lang.Math;

public int close10(int a, int b) {
	int aDiff = Math.abs(a - 10);
	int bDiff = Math.abs(b - 10);

	int value = 0;

	if (aDiff < bDiff) {
		value = a;
	}

	if (bDiff < aDiff) {
		value = b;
	}


	return value;
}
