
import java.util.Map;

public Map<String, String> pairs(String[] strings) {
	Map<String, String> map = new HashMap<>();
	for (String string : strings) {
		map.put(string.substring(0,1), 
		string.substring(string.length() - 1));
	} 

	return map; 
}

