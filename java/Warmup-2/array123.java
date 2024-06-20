public boolean array123(int[] nums) {
	boolean b = false;

	int i = 0;
	while (i < nums.length - 2 && !b) {
		b = nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3;
		i++;
	}

	return b;

}
