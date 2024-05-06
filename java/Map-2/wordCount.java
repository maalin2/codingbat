import java.util.Map;

public Map<String, Integer> wordCount(String[] strings) {
	Map<String, Integer> map = new HashMap<>();
	for (String string : strings) {
		if (!map.containsKey(string)) {
			map.put(string, 1);
		} else {
			map.put(string, map.get(string) + 1);
		}
	} 

	return map; 
}

