import java.lang.Math;

public String minCat(String a, String b) {
	if (a.length() < b.length()) {
		return a + b.substring(b.length() -  a.length());
	}

	if (b.length() < a.length()) {
		return a.substring(a.length() - b.length() ) + b;
	}
	
	return a + b;
}


