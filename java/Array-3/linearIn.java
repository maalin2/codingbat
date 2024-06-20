boolean linearIn(int[] outer, int[] inner) {
	int outerIndex = 0;
	int innerIndex = 0;

	while (outerIndex < outer.length && innerIndex < inner.length) {
		if (outer[outerIndex] == inner[innerIndex]) {
			innerIndex++;
		}

		outerIndex++;
	}

	return innerIndex == inner.length;
}

