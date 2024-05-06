import java.util.List;

public List<Integer> square56(List<Integer> nums) {
	nums.replaceAll(n -> 10 + (n * n));
	nums.removeIf(n -> ((n % 10 == 5) || (n % 10 == 6)));
	return nums;
	
}

