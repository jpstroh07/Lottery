package project;

import javax.swing.*;

public class NumberCollector {
    
    public static LottoNumber[] getNumbers() {
        LottoNumber[] numbers = new LottoNumber[7];
        StringBuilder givenNumbers = new StringBuilder("Given numbers: ");

        for(int i = 0; i < 6; i++) {
            int quant = i + 1;
            String value = JOptionPane.showInputDialog( givenNumbers + "| Give your " + quant + ". number");

            numbers[i] = new LottoNumber(Integer.parseInt(value), false);

            givenNumbers.append(value).append(", ");
        }

        String supVal = JOptionPane.showInputDialog("Give your super number");
        numbers[6] = new LottoNumber(Integer.parseInt(supVal), true);

        return numbers;
    }  
}