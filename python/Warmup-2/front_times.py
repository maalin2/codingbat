def front_times(str, n):
	front = str
	
	if len(str) > 3:
		front = str[0:3]

	res = ''

	for i in range(n):
		res += front

	return res
