
import java.util.Map;

public Map<String, Boolean> wordMultiple(String[] strings) {
	Map<String, Boolean> map = new HashMap<>();
	for (String string : strings) {
		if (!map.containsKey(string)) {
			map.put(string, false);
		} else {
			map.put(string,true);
		}
	} 

	return map; 
}

