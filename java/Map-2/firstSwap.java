import java.util.Map;

public String[] firstSwap(String[] strings) {
	Map<String, Integer> map = new HashMap<>();

	for (int i = 0; i < strings.length; i++) {
		String ch = strings[i].substring(0,1);

		if (map.containsKey(ch)){
			int match = map.get(ch);

			if (match != -1) {
				String swap = strings[match];
				strings[match] = strings[i];
				strings[i] = swap;
			}

			map.put(ch, -1);
		} else {
			map.put(ch, i);
		}
	}

	return strings;
}

