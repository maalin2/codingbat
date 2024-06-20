def not_string(str):
	res = "not " + str
	
	if len(str) > 1 and str[0:3] == "not":
		res = str
	
	return res

