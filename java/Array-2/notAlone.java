public int[] notAlone(int[] nums, int val) {
	for (int i = 0; i < nums.length; i++) {
		if (nums[i] == val) {
			if ((i + 1 < nums.length && nums[i+1] != nums[i]) && 
					(i - 1 >= 0 && nums[i-1] != nums[i])) {
				int replace = nums[i+1];
				if (nums[i-1] > replace) {
					replace = nums[i-1];
				}

				nums[i] = replace;
			}
		}
	}

	return nums;
}

