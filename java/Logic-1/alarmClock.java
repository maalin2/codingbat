public String alarmClock(int day, boolean vacation) {
	boolean weekday = day > 0 && day < 6;
	String clock = "";
	
	if (vacation) {
		if (weekday) {
			clock = "10:00";
		} else {
			clock = "off";
		}
	} else {
		if (weekday) {
			clock = "7:00";
		} else {
			clock = "10:00";
		}
	}
	
	return clock;
}

