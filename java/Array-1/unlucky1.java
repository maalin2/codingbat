public boolean unlucky1(int[] nums) {
	if (nums.length > 1 && nums[0] == 1 && nums[1] == 3)
		return true;

	if (nums.length > 2 && nums[1] == 1 && nums[2] == 3)
		return true;

	int len = nums.length; 
	if (nums.length > 2 && nums[len - 2] == 1 && nums[len - 1] == 3) 
		return true;

	return false;
}

