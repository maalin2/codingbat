public String everyNth(String str, int n) {
				int i = 0;
				String result = "";
				while (i < str.length()) {
								result += str.substring(i , i + 1);
								i += n;
				}

				return result;

}
