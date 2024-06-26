public int bigDiff(int[] nums) {
	int min = nums[0];

	for (int num : nums) {
		if (num < min) {
			min = num;
		}
	}

	int max = nums[0];
	
	for (int num : nums) {
		if (num > max) {
			max = num;
		}
	}

	return max - min;
}

