package project;

public class Checker {

    public int checkForSame(LottoNumber[] num1, LottoNumber[] num2) {
        int same = 0;

        for (LottoNumber number : num1) {
            for (int i = 0; i < num2.length; i++) {
                if (number.equals(num2[i]) && number.isSuperNumber() == false && num2[i].isSuperNumber() == false) {
                    same++;
                }
            }
        }

        if (num1[6].getValue() == num2[6].getValue()) {
            same++;
        }

        return same;
    }

    public boolean checkForBiggerSmaller(LottoNumber[] num) {
        for (LottoNumber lottoNumber : num) {
            if (lottoNumber.getValue() < 0 || lottoNumber.getValue() >= 50) {
                return true;
            }
        }

        if (num[6].getValue() >= 10) {
            return true;
        }

        return false;
    }

    public boolean checkForDuplicates(LottoNumber[] num) {
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length - 1; j++) {
                if (num[i].getValue() == num[j].getValue() && num[i].isSuperNumber() == false
                        && num[j].isSuperNumber() == false) {
                    return true;
                }
            }
        }

        return false;
    }

    public String getArrayString(LottoNumber[] numbers) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < numbers.length - 1; i++) {
            builder.append(numbers[i].getValue()).append(", ");
        }

        builder.append(numbers[numbers.length - 1].getValue());

        return builder.toString();
    }
}