public boolean no14(int[] nums) {
	boolean oneFound = false;
	boolean fourFound = false;

	int i = 0;
	while (i < nums.length && (!oneFound || !fourFound)) {
		if (nums[i] == 1) {
			oneFound = true;
		} else if (nums[i] == 4) {
			fourFound = true;
		}

		i++;
	}

	return !oneFound || !fourFound;
}
