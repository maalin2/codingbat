import java.lang.Math;

public boolean nearHundred(int n) {
	return (Math.abs(n - 200) <= 10) || (Math.abs(n - 100) <= 10);
}
