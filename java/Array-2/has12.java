public boolean has12(int[] nums) {
	boolean find2 = false;
	for (int i = 0; i < nums.length; i++) {
		if (nums[i] == 1) {
			find2 = true;
		} else if (nums[i] == 2 && find2) {
			return true;
		}
	}

	return false;
}
