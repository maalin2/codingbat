public boolean endOther(String a, String b) {
	String s = a.toLowerCase();
	String t = b.toLowerCase();

	if (s.length() <= t.length()) {
		return t.substring(t.length() - s.length()).equals(s);
	}

	if (t.length() <= s.length()) {
		return s.substring(s.length() - t.length()).equals(t);
	}


	return false;
}


