import java.lang.Math;

public boolean closeFar(int a, int b, int c) {
	if ((Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2) || 
	    (Math.abs(a - c) <= 1 && Math.abs(b - c) >= 2 && Math.abs(a - b) >= 2)) {
		return true;
	}

	return false;
}
