public boolean stringE(String str) {
				boolean e = false;

				int i = 0;
				int count = 0;
				while (i < str.length()) {
								if (str.charAt(i) == 'e') {
												count++;
								}

								e = count <= 3 && count >= 1;
								i++;
				}

				return e;
}
