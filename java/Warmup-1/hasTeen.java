public boolean hasTeen(int a, int b, int c) {
				int i = 0;
				boolean teen = false;

				int[] num = {a,b,c};
				while (i < 3 && !teen) {
								teen = num[i] <= 19 && num[i] >= 13; 

								i++;
				}

				return teen;
}
