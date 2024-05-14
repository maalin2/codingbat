public int[] fix45(int[] nums) {
  int next5 = 0;

	for (int i = 0; i < nums.length - 1; i++) {
		if (nums[i] == 4 && nums[i+1] != 5) {
			while(nums[next5] != 5 ||
					 (next5 > 0 && nums[next5 - 1] == 4)) {
				next5++;
			}

			int temp = nums[i+1];
			nums[i+1] = nums[next5];
			nums[next5] = temp;
		}
	}


	return nums;
}
