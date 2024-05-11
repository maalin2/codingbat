public int sumNumbers(String str) {
    int sum = 0;
    int num = 0;
    boolean inNumber = false;
    
    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if (Character.isDigit(c)) {
            inNumber = true;
            num = num * 10 + Integer.parseInt(str.substring(i, i + 1));
        } else {
            if (inNumber) {
                sum += num; 
                num = 0;
                inNumber = false;
            }
        }
    }
    
    if (inNumber) {
        sum += num;
    }
    
    return sum;
}


