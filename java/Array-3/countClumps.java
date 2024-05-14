public int countClumps(int[] nums) {
	int clumps = 0;
	boolean inClump = false;

	for (int i = 1; i < nums.length; i++) {
		if (nums[i] == nums[i - 1]) {
			if (!inClump) {
				clumps++;
				inClump = true;
			}
		} else {
			inClump = false;
		}
	}

	return clumps;
}
