import java.lang.Math;

public int stringMatch(String a, String b) {
	int pos = 0;

	int end = Math.min(a.length(), b.length());
	for (int i = 0; i < end - 1; i++) {
		if (a.substring(i, i+2)
				.equals(b.substring(i, i+2))) {
			pos++;
		}
	}

	return pos;
}
