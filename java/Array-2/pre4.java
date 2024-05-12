public int[] pre4(int[] nums) {
  int find4 = 0;
	
	while (nums[find4] != 4) {
		find4++;
	}

	int[] b4 = new int[find4];

	for (int i = 0; i < find4; i++) {
		b4[i] = nums[i];
	}


	return b4;
}

