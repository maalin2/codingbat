public boolean sum28(int[] nums) {
	int twos = 0;

	for (int i = 0; i < nums.length; i++) {
		if (nums[i] == 2) {
			twos++;
		}
	}

	return twos == 4; 
}
