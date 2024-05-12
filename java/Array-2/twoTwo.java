public boolean twoTwo(int[] nums) {
	for (int i = 0; i < nums.length; i++) {
		if (nums[i] == 2) {
			int indexNext2 = 0;

			while (i < nums.length && nums[i] == 2) {
				indexNext2++;
				i++;
			}

			if (indexNext2 == 1) {
				return false;
			}
		}
	}

	return true;
}

