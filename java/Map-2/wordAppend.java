import java.util.Map;

public String wordAppend(String[] strings) {
	String result = "";	

	Map<String, Integer> map = new HashMap<>();

	for (String string : strings) {
		if (map.containsKey(string)) {
			map.put(string, map.get(string) + 1);
			if (map.get(string) % 2 == 0) {
				result += string;
			}
		} else {
			map.put(string, 1);
		}
	}

	return result;
}
