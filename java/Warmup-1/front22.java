public String front22(String str) {
				String front = str;
				if (str.length() > 2) {
								front = str.substring(0,2);
				}

				String result = front + str + front;


				return result;
}
