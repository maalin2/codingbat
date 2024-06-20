
import java.util.List;

public List<Integer> math1(List<Integer> nums) {
	nums.replaceAll(n -> 10 * (n + 1));
	return nums;
}
