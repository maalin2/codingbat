public class stringSplosion {
	public static String stringSplosion(String str) {
		StringBuilder res = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			res.append(str, 0, i + 1);
		}

		return res.toString();
	}

	public static void main(String[] args) {
		System.out.println(stringSplosion("code"));
	}

}
