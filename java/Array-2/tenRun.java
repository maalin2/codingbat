public int[] tenRun(int[] nums) {
	int[] tens = new int[nums.length];

  int multiple = -1;
  
	for (int i = 0; i < nums.length; i++) {
	  if (nums[i] % 10 == 0 || multiple % 10 != 0) {
	    multiple = nums[i];
	  }
		tens[i] = multiple;
	}

	return tens;
}

