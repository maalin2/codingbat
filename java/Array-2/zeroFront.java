public int[] zeroFront(int[] nums) {
	for (int i = 0; i < nums.length; i++) {
	  if (nums[i] == 0) {
	    int findNonZero = 0;
	    
	    while (nums[findNonZero] == 0) {
	      findNonZero += 1;
	    }
	    
	    int swap = nums[i];
	    nums[i] = nums[findNonZero];
	    nums[findNonZero] = swap;
	  }
	}
  
	return nums;
}

