public int[] shiftLeft(int[] nums) {
	int[] nums2 = new int[nums.length];
  
	for (int i = 0; i < nums.length; i++) {
		nums2[i] = nums[(i + 1) % nums.length];
	}

	return nums2;
}
