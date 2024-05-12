public int[] evenOdd(int[] nums) {
	int l = 0;
	int r = nums.length - 1;

	while (l < r) {
		while (l < r && nums[l] % 2 == 0) {
			l += 1;
		}

		while (r > l && nums[r] % 2 != 0) {
			r -= 1;
		}

		if (l < r) {
			int swap = nums[l];
			nums[l]  = nums[r];
			nums[r]  = swap;
		}
	}

	return nums;  
}
