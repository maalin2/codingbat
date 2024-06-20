public int[] post4(int[] nums) {
	int find4 = 0;

	for (int i = 0; i < nums.length; i++) {
		if (nums[i] == 4) {
			find4 = i;
		}
	}

	int[] after4 = new int[nums.length - 1 - find4];

	for (int i = 0; i < after4.length; i++) {
		after4[i] = nums[i + 1 + find4];
	}


	return after4;
}
