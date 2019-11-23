package leetcode.facebook;

class MultiplyString {
    public String multiply(String num1, String num2) {
        StringBuilder output = new StringBuilder();
        // to check is result need to negative of r positive
        boolean isNegative = false;

        if (num1.charAt(0) == '-' && num2.charAt(0) == '-') {
            num1 = num1.substring(1, num1.length());
            num2 = num2.substring(1, num2.length());
        }

        if (num1.charAt(0) == '-') {
            num1 = num1.substring(1, num1.length());
            isNegative = true;
        }

        if (num2.charAt(0) == '-') {
            num2 = num2.substring(1, num2.length());
            isNegative = true;
        }

        num1 = new StringBuilder(num1).reverse().toString();
        num2 = new StringBuilder(num2).reverse().toString();
        int[] sumArray = new int[num1.length() + num2.length()];
        for (int i = 0; i < num1.length(); i++) {
            for (int j = 0; j < num2.length(); j++) {
                int tempSum = sumArray[i + j] + ((num1.charAt(i) - '0') * (num2.charAt(j) - '0'));
                sumArray[i + j] = tempSum % 10;
                sumArray[i + j + 1] += tempSum / 10;
            }
        }
        for (int i = sumArray.length - 1; i >= 0; i--) {
            output.append(sumArray[i]);
        }

        while (output.length() > 1 && output.charAt(0) == '0') {
            output.deleteCharAt(0);
        }

        if (isNegative) {
            output.insert(0, '-');
        }

        return output.toString();
    }

    public static void main(String o[]) {
        MultiplyString multiplyString = new MultiplyString();
        System.out.println(multiplyString.multiply("321", "124"));
        System.out.println(multiplyString.multiply("11", "11"));
        System.out.println(multiplyString.multiply("-11", "11"));
        System.out.println(multiplyString.multiply("-11", "-11"));
        System.out.println(multiplyString.multiply("11", "-11"));
        System.out.println(multiplyString.multiply("11", "0"));
        System.out.println(multiplyString.multiply("0", "0"));
    }
}