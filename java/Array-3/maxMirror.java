public int maxMirror(int[] nums) {
  int max = 0;
  
  for (int i = 0; i < nums.length; i++) {
    for (int j = nums.length - 1; j >= 0; j--) {
      int left = i;
      int right = j;
      int mirror = 0;
      
      while (left < nums.length && right >= 0 && nums[left] == nums[right]) {
        mirror++;
        left++;
        right--;
      }
      
      if (mirror > max) {
        max = mirror;
      }
    }
  }
  
  return max;
}

