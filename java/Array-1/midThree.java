public int[] midThree(int[] nums) {
	int i = nums.length/2;
	return new int[] {nums[i-1],nums[i], nums[i+1]};  
}


