public int maxTriple(int[] nums) {
	if (nums.length == 1) {
		return nums[0];
	} else {
		int max = nums[0];
		if (nums[nums.length / 2] > max) {
			max = nums[nums.length / 2];
		}

		if (nums[nums.length - 1] > max) {
			max = nums[nums.length - 1];
		}

		return max;
	}
}

