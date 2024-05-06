import java.util.List;

public List<Integer> noNeg(List<Integer> nums) {
	nums.removeIf(n -> n < 0);
	return nums;
	
}

