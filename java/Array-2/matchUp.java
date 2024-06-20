import java.lang.Math;
public int matchUp(int[] nums1, int[] nums2) {
	int count = 0;
	
	int len = nums1.length;
	for (int i = 0; i < len; i++) {
		int diff = Math.abs(nums1[i] - nums2[i]);

		if (diff <= 2 && diff != 0) {
			count++;
		}
	}

	return count;
}

