public int[] maxEnd3(int[] nums) {
	int max = nums[0];
	if (nums[2] > max) max = nums[2];

	return new int[] {max, max, max};  
}

