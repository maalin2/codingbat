public boolean tripleUp(int[] nums) {
	for (int i = 0; i < nums.length; i++) {
		int num = nums[i];

		if (i + 2 < nums.length && nums[i + 1] == num + 1 && nums[i+2] == num + 2) {
			return true;
		}


	}	

	return false;  
}
