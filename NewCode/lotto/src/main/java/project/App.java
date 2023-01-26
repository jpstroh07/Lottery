package project;

import javax.swing.JOptionPane;

/**
 * @author Jan
 */
public class App {

    public static void main(String[] args) {
        while (true) {
            Checker checker = new Checker();
            LottoNumber[] numbers;

            do {
                numbers = NumberCollector.getNumbers();

                if (checker.checkForBiggerSmaller(numbers)) {
                    JOptionPane.showInternalMessageDialog(null, "You entered invalid numbers");
                }

                if (checker.checkForDuplicates(numbers)) {
                    JOptionPane.showMessageDialog(null, "You entered the same numbers");
                }
            } while (checker.checkForBiggerSmaller(numbers) || checker.checkForDuplicates(numbers));

            LottoNumber[] randNumbers = NumberDrawer.getDrawnNumbers();
            int same = checker.checkForSame(numbers, randNumbers);

            JOptionPane.showMessageDialog(null, "Your numbers: " + checker.getArrayString(numbers) + "\nDrawn numbers: "
                    + checker.getArrayString(randNumbers));
            JOptionPane.showMessageDialog(null, "You have " + same + " same number(s)");

            if (same < 6) {
                JOptionPane.showMessageDialog(null, "Unfortunately, you have lost!");
            } else {
                JOptionPane.showMessageDialog(null, "Congratulations, you have won!");
            }

            int again = JOptionPane.showConfirmDialog(null, "Do you want to play again?", "Again?",
                    JOptionPane.YES_NO_CANCEL_OPTION);

            if (again != 0) {
                JOptionPane.showMessageDialog(null, "See ya!");
                System.exit(0);
            }
        }
    }
}