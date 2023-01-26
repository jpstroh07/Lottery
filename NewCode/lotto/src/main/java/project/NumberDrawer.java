package project;

public class NumberDrawer {
    
    public static LottoNumber[] getDrawnNumbers() {
        final int MAX = 49;
        final int DRAWS = 6;

        LottoNumber[] allNumbers = new LottoNumber[MAX + 1];
        LottoNumber[] drawnNumbers = new LottoNumber[DRAWS + 1];

        for (int i = 0; i < allNumbers.length; i++) {
            allNumbers[i] = new LottoNumber(i, false);
        }

        for (int i = 0; i < drawnNumbers.length; i++) {
            do {
                drawnNumbers[i] = new LottoNumber((int) (Math.random() * MAX) + 1, false);
            } while (allNumbers[drawnNumbers[i].getValue()].isDrawn());

            allNumbers[drawnNumbers[i].getValue()].setDrawn();
        }

        drawnNumbers[6] = new LottoNumber((int) (Math.random() * 9) + 1, true);

        return drawnNumbers;
    }
}