public int[] zeroMax(int[] nums) {
	int maxOdd = 0;

	for (int i = nums.length - 1; i >= 0; i--) {
		if (nums[i] % 2 != 0) {
			if (nums[i] > maxOdd) {
				maxOdd = nums[i];
			}
		} else if (nums[i] == 0) {
			nums[i] = maxOdd; 
		}
	}

	return nums;
}
