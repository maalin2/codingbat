import java.lang.Math;

public boolean love6(int a, int b) {
	int sum = a + b;
	int diff = Math.abs(a - b);

	return (a == 6 || b == 6 || sum == 6 || diff == 6);
}

