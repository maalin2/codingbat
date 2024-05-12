public boolean isEverywhere(int[] nums, int val) {
	for (int i = 0; i < nums.length; i++) {
		if (i + 1 < nums.length) {
			if (nums[i] != val && nums[i+1] != val) {
				return false;
			}
		}
	}

	return true;  
}
