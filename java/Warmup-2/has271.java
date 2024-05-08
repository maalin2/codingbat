import java.lang.Math;

public boolean has271(int[] nums) {
	boolean b = false;

	int i =0;
	while (i < nums.length - 2 && !b) {
		int num = nums[i];
		b = nums[i+1] == num + 5 && 
			Math.abs(nums[i+2] - num + 1) <= 2;
		i++;
	}

	return b;
}

