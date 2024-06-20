public String withoutString(String base, String remove) {
    String result = "";
    int removeLen = remove.length();
    int len = base.length();
    String base2 = base.toLowerCase();
    String remove2 = remove.toLowerCase(); 

    int i = 0;
    while (i < len) {
        if (i + removeLen <= len && base2.substring(i, i + removeLen).equals(remove2)) {
            i += removeLen;
        } else {
            result += base.charAt(i);
            i++;
        }
    }

    return result;
}
