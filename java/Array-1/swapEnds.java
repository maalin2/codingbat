public int[] swapEnds(int[] nums){
	int last = nums[nums.length - 1];
	int first = nums[0];

	nums[nums.length - 1] = first;
	nums[0] = last;

	return nums;
}


