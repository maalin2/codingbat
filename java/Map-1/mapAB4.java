import java.lang.Math;

public Map<String, String> mapAB4(Map<String, String> map) {
	if (map.containsKey("a") && map.containsKey("b")) {
		String a = map.get("a");
		String b = map.get("b");

		if (a.length() == b.length()) {
			map.put("a", "");
			map.put("b", "");
		} else {
			map.put("c", a);
			if (b.length() > a.length()) {
				map.put("c", b);
			}
		}
	}


	return map;  
}


