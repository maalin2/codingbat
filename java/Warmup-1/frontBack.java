public String frontBack(String str) {
				String result = "";


				if (str.length() < 2) {
								result = str;
				}

				if (str.length() == 2) {
								result = str.substring(1) + str.substring(0,1);
				}

				if (str.length() > 2) {
								result = str.substring(str.length() - 1) + str.substring(1, str.length() - 1) + str.substring(0,1);
				}

				return result;

}
