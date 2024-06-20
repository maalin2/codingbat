public boolean xyzThere(String str) {
	if (str.length() < 3) {
		return false;
	}

	if (str.contains("xyz")) {
		if (str.length() > 3 && str.lastIndexOf(".") == str.lastIndexOf("xyz") - 1) {
			return false;
		}
		return true;
	}

	return false;
}


