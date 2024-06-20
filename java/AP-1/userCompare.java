public int userCompare(String aName, int aId, String bName, int bId) {
	int strCompare = aName.compareTo(bName);

	if (strCompare != 0) {
		if (strCompare > 0) {
			return 1;
		} else {
			return -1;
		}
	} else {
		if (aId > bId) {
			return 1;
		} else if (aId < bId) {
			return -1;
		} else {
			return 0;
		}
	}
}
