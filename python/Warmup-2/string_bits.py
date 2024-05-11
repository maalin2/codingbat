def string_bits(str):
	res = ''

	i = 0
	while i < len(str):
		res += str[i]
		i += 2

	return res
