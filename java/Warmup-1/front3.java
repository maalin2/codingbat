public String front3(String str) {
				String front = str;
				if (str.length() > 3) {
								front = str.substring(0,3);
				}

				String result = "";
				for (int i = 0; i < 3; i++) {
								result += front;
				}
				
				return result;
}
