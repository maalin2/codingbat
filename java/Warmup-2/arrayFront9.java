public boolean arrayFront9(int[] nums) {
	if (nums.length == 0) {
		return false;
	}
	
	int end = 4;
	if (nums.length < 4) {
		end = nums.length;
	}

	int i = 0;
	boolean b = false;
	while (i < end && !b) {
		b = nums[i] == 9;
		i++;
	}


	return b;
	
}
