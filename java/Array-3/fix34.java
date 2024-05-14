public int[] fix34(int[] nums) {
	int find4 = 0;

	for (int i = 0; i < nums.length; i++) {
		if (nums[i] == 3) {
			while (nums[find4] != 4) {
				find4++;
			}

			int swap = nums[i+1];
			nums[i+1] = nums[find4];
			nums[find4] = swap;
		}
	}

	return nums;
}

