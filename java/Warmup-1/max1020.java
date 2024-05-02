public int max1020(int a, int b) {
				int max = a;
				int min = b;

				if (a < b) {
								max = b;
								min = a;                                                                                            }

				int result = 0;
				if (max >= 10 && max <= 20) {
								result = max;
				} else if  (min >= 10 && min <= 20){
								result = min;
				}

				return result;
}
