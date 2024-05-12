public int centeredAverage(int[] nums) {
	int avg = 0;

	int min = nums[0];
	int minIndex = 0;

	for (int i = 0; i < nums.length; i++) {
		if (nums[i] < min) {
			min = nums[i];
			minIndex = i;
		}
	}

	int max = nums[0];
	int maxIndex = 0;

	for (int i = 0; i < nums.length; i++) {
		if (nums[i] > max) {
			max = nums[i];
			maxIndex = i;
		}
	}

	int sum = 0; 
	for (int i = 0; i < nums.length; i++) {
		if (i != minIndex && i != maxIndex) {
			sum += nums[i];
		}
	}
	int n = nums.length - 2;
	if (max == min) {
		n = 1;
		sum -= min;
	}
	avg = sum / n;

	return avg;
}

