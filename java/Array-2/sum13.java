public int sum13(int[] nums) {
	int sum = 0;
	for (int i = 0; i < nums.length; i++) {
		if (nums[i] != 13) {
			sum += nums[i];
		} else {
			if (i + 1 < nums.length) {
				i++;
			}
		}
		
	} 

  return sum;
}
