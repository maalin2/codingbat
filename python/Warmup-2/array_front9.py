def array_front9(nums):
	end = 4
	if len(nums) < 4:
		end = len(nums)

	nums2 = nums[0:end]
	for num in nums2:
		if num == 9:
			return True


	return False
