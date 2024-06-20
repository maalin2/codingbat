public int[] withoutTen(int[] nums) {
	int j = 0;

	int[] nums2 = new int[nums.length];

	for (int i = 0; i < nums.length; i++) {
		if (nums[i] % 10 != 0) {
			nums2[j] = nums[i];
			j++;
		}
	}

	return nums2;
}
