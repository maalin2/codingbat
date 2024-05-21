public boolean array220(int[] nums, int index) {
  if (index >= nums.length) {
    return false;
  }
  
  if (index + 1 < nums.length && nums[index+1] == nums[index] * 10) {
    return true;
  } else {
    return array220(nums, index + 1);
  }
}

