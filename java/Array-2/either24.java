public boolean either24(int[] nums) {
	boolean valid2 = false;
	boolean valid4 = false;
	for (int i = 0; i < nums.length; i++) {
		if (nums[i] == 2) {
			if (i+1 < nums.length && nums[i+1]== 2) {
				valid2 = true;
			}
		} else if (nums[i] == 4) {
			if (i + 1 <nums.length && nums[i+1]==4) {
				valid4 = true;
			}
		}
	}

	return (valid2) ^ (valid4);
}

