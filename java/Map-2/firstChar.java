import java.util.Map;

public Map<String, String> firstChar(String[] strings) {
	Map<String, String> map = new HashMap<>();
	
	for (String string : strings) {
		String first = string.substring(0,1);

		if (map.containsKey(first)) {
			map.put(first, map.get(first) + string);
		}	else {
			map.put(first, string);
		}
	}

	return map;  
}

