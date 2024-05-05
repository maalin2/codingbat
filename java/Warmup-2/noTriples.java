public boolean noTriples(int[] nums) {
	boolean b = false;


	int i = 0;
	while (i < nums.length - 2 && !b) {
		b = nums[i] == nums[i+1] && nums[i+1] == nums[i+2]; 
		i++;
	}

	return !b;
}
