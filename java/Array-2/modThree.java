public boolean modThree(int[] nums) {
	for (int i = 0; i < nums.length; i++) {
		if (i + 2 < nums.length &&
				((nums[i] % 2 == 0 && nums[i+1] % 2 == 0 && nums[i+2] % 2 == 0) ||
				 (nums[i] % 2 != 0 && nums[i+1] % 2 != 0 && nums[i+2] % 2 != 0))) {
			return true;
		}
	}


	return false;
}

