public int maxSpan(int[] nums) {
	int max = 0;

	for (int i = 0; i < nums.length; i++) {
		int val = nums[i];
		int rightMostIndex = 0;
		for (int j = i; j < nums.length; j++) {
			if (nums[j] == val) {
				rightMostIndex = j;
			}
		}
		int span = rightMostIndex - i + 1;
		if (span > max) {
			max = span;
		}
	}

	return max;
}

