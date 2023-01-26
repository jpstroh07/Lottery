package glueck;

import java.util.*;
import javax.swing.*;

public class Lottoziehung {

	public static void main(String[] args) {
		/*
		 * @author Jan
		 */

		while (true) {
			final int ZIEHUNG = 7;
			int Gleich = 0;
			int Wiederholung = 0;
			int SZahl = 0;
			boolean sz = false;
			String Eingabe1 = "";
			String Eingabe2 = "";
			String Eingabe3 = "";
			String Eingabe4 = "";
			String Eingabe5 = "";
			String Eingabe6 = "";
			int[] Zahl = new int[ZIEHUNG];

			do {

				Eingabe1 = JOptionPane.showInputDialog("Lottoziehung! Gib deine erste Zahl bis 49 ein:");
				Zahl[1] = Integer.parseInt(Eingabe1);
				Wiederholung++;

				Eingabe2 = JOptionPane.showInputDialog(
						"(Bereits eingegebene Zahlen:" + Zahl[1] + ") Gib deine zweite Zahl bis 49 ein:");
				Zahl[2] = Integer.parseInt(Eingabe2);
				Wiederholung++;

				Eingabe3 = JOptionPane.showInputDialog("(Bereits eingegebene Zahlen:" + Zahl[1] + ", " + Zahl[2]
						+ ") Gib deine dritte Zahl bis 49 ein:");
				Zahl[3] = Integer.parseInt(Eingabe3);
				Wiederholung++;

				Eingabe4 = JOptionPane.showInputDialog("(Bereits eingegebene Zahlen:" + Zahl[1] + ", " + Zahl[2] + ", "
						+ Zahl[3] + ") Gib deine vierte Zahl bis 49 ein:");
				Zahl[4] = Integer.parseInt(Eingabe4);
				Wiederholung++;

				Eingabe5 = JOptionPane.showInputDialog("(Bereits eingegebene Zahlen:" + Zahl[1] + ", " + Zahl[2] + ", "
						+ Zahl[3] + ", " + Zahl[4] + ") Gib deine fünfte Zahl bis 49 ein:");
				Zahl[5] = Integer.parseInt(Eingabe5);
				Wiederholung++;

				Eingabe6 = JOptionPane.showInputDialog("(Bereits eingegebene Zahlen:" + Zahl[1] + ", " + Zahl[2] + ", "
						+ Zahl[3] + ", " + Zahl[4] + ", " + Zahl[5] + ") Gib deine sechste Zahl bis 49 ein:");
				Zahl[6] = Integer.parseInt(Eingabe6);
				Wiederholung++;

				String Eingabe7 = JOptionPane.showInputDialog("Gib deine Superzahl ein:");
				SZahl = Integer.parseInt(Eingabe7);
				Wiederholung++;

				if ((Zahl[1] == Zahl[2]) || (Zahl[1] == Zahl[3]) || (Zahl[1] == Zahl[4]) || (Zahl[1] == Zahl[5])
						|| (Zahl[1] == Zahl[6]) || (Zahl[2] == Zahl[1]) || (Zahl[2] == Zahl[3]) || (Zahl[2] == Zahl[4])
						|| (Zahl[2] == Zahl[5]) || (Zahl[2] == Zahl[6]) || (Zahl[3] == Zahl[1]) || (Zahl[3] == Zahl[2])
						|| (Zahl[3] == Zahl[4]) || (Zahl[3] == Zahl[5]) || (Zahl[3] == Zahl[6]) || (Zahl[4] == Zahl[1])
						|| (Zahl[4] == Zahl[2]) || (Zahl[4] == Zahl[3]) || (Zahl[4] == Zahl[5]) || (Zahl[4] == Zahl[6])
						|| (Zahl[5] == Zahl[1]) || (Zahl[5] == Zahl[2]) || (Zahl[5] == Zahl[3]) || (Zahl[5] == Zahl[4])
						|| (Zahl[5] == Zahl[6]) || (Zahl[6] == Zahl[1]) || (Zahl[6] == Zahl[2]) || (Zahl[6] == Zahl[3])
						|| (Zahl[6] == Zahl[4]) || (Zahl[6] == Zahl[5])) {
					Wiederholung = 0;
					JOptionPane.showMessageDialog(null,
							"Du hast gleiche Zahlen abgegeben! Ziehung muss von neuem beginnen...");
				}
				if ((Zahl[1] >= 50) || (Zahl[2] >= 50) || (Zahl[3] >= 50) || (Zahl[4] >= 50) || (Zahl[5] >= 50)
						|| (Zahl[6] >= 50)) {
					Wiederholung = 0;
					JOptionPane.showMessageDialog(null,
							"Du hast zu große Zahlen abgegeben! Ziehung muss von neuem beginnen...");
				}
				if (Zahl[1] == 0) {
					Wiederholung = 0;
				}
			} while (!(Wiederholung == 7));

			JOptionPane.showMessageDialog(null, "Jetzt die Ziehung...");

			final int ANZAHL = 6;
			final int MAX = 49;
			int[] Lottozahl = new int[MAX + 1];
			int[] Zufall = new int[ANZAHL + 1];

			for (int i = 1; i < Lottozahl.length; i++)
				Lottozahl[i] = 0;

			for (int Nr = 1; Nr < Zufall.length; Nr++) {

				do {
					Zufall[Nr] = (int) (Math.random() * MAX) + 1;

				} while (Lottozahl[Zufall[Nr]] == 1);

				Lottozahl[Zufall[Nr]] = 1;
			}
			int SZahlZ = (int) (Math.random() * 9);

			Arrays.sort(Zufall);
			for (int Nr = 1; Nr < Zufall.length; Nr++)
				System.out.println(Nr + ". Ziehung: " + Zufall[Nr]);
			System.out.println("Superzahl: " + SZahlZ);
			Arrays.sort(Zahl);

			if ((Zufall[1] == Zahl[1]) || (Zufall[1] == Zahl[2]) || (Zufall[1] == Zahl[3]) || (Zufall[1] == Zahl[4])
					|| (Zufall[1] == Zahl[5]) || (Zufall[1] == Zahl[6]))
				Gleich = Gleich + 1;
			if ((Zufall[2] == Zahl[1]) || (Zufall[2] == Zahl[2]) || (Zufall[2] == Zahl[3]) || (Zufall[2] == Zahl[4])
					|| (Zufall[2] == Zahl[5]) || (Zufall[2] == Zahl[6]))
				Gleich = Gleich + 1;
			if ((Zufall[3] == Zahl[1]) || (Zufall[3] == Zahl[2]) || (Zufall[3] == Zahl[3]) || (Zufall[3] == Zahl[4])
					|| (Zufall[3] == Zahl[5]) || (Zufall[3] == Zahl[6]))
				Gleich = Gleich + 1;
			if ((Zufall[4] == Zahl[1]) || (Zufall[4] == Zahl[2]) || (Zufall[4] == Zahl[3]) || (Zufall[4] == Zahl[4])
					|| (Zufall[4] == Zahl[5]) || (Zufall[4] == Zahl[6]))
				Gleich = Gleich + 1;
			if ((Zufall[5] == Zahl[1]) || (Zufall[5] == Zahl[2]) || (Zufall[5] == Zahl[3]) || (Zufall[5] == Zahl[4])
					|| (Zufall[5] == Zahl[5]) || (Zufall[5] == Zahl[6]))
				Gleich = Gleich + 1;
			if ((Zufall[6] == Zahl[1]) || (Zufall[6] == Zahl[2]) || (Zufall[6] == Zahl[3]) || (Zufall[6] == Zahl[4])
					|| (Zufall[6] == Zahl[5]) || (Zufall[6] == Zahl[6]))
				Gleich = Gleich + 1;
			if ((SZahlZ == SZahl)) {
				sz = true;
			}
			JOptionPane.showMessageDialog(null,
					"Deine Zahlen waren: " + Zahl[1] + ", " + Zahl[2] + ", " + Zahl[3] + ", " + Zahl[4] + ", " + Zahl[5]
							+ ", " + Zahl[6] + " und deine Superzahl war " + SZahl + ". Die gezogenen Zahlen waren:  "
							+ Zufall[1] + ", " + Zufall[2] + ", " + Zufall[3] + ", " + Zufall[4] + ", " + Zufall[5]
							+ ", " + Zufall[6] + " und die Superzahl war " + SZahlZ);

			if (sz == true) {
				if (Gleich >= 2)
					JOptionPane.showMessageDialog(null,
							"Du hast " + Gleich + " gleiche Zahlen und deine Superzahl war richtig!");
				if (Gleich == 1)
					JOptionPane.showMessageDialog(null, "Du hast eine gleiche Zahl und deine Superzahl war richtig!");
				if (Gleich == 0)
					JOptionPane.showMessageDialog(null,
							"Keine deiner angegebenen Zahlen war richtig, aber deine Superzahl war richtig!");
				if (Gleich == 6) {
					JOptionPane.showMessageDialog(null,
							"Du hast den Jackpot von 0 EUR geknackt! Herzlichen Glückwunsch!!!");
				}
			} else {
				if (Gleich >= 2)
					JOptionPane.showMessageDialog(null, "Du hast " + Gleich + " gleiche Zahlen!");
				if (Gleich == 1)
					JOptionPane.showMessageDialog(null, "Du hast eine gleiche Zahl!");
				if (Gleich == 0)
					JOptionPane.showMessageDialog(null, "Keine deiner angegebenen Zahlen war richtig!");
			}
			if (Gleich >= 3)
				JOptionPane.showMessageDialog(null, "Du hast einen Preis gewonnen!");
			else
				JOptionPane.showMessageDialog(null, "Du hast leider nichts gewonnen! Beim nächsten Mal mehr Glück!");

			System.out.println("Zahl 1: " + Zahl[1] + "; Zahl 2: " + Zahl[2] + "; Zahl 3: " + Zahl[3] + "; Zahl 4: "
					+ Zahl[4] + "; Zahl 5: " + Zahl[5] + "; Zahl 6: " + Zahl[6] + "; Superzahl: " + SZahl);

			int Nochmal = JOptionPane.showConfirmDialog(null, "Möchtest du noch einmal dein Glück versuchen?",
					"Nochmal?", JOptionPane.YES_NO_CANCEL_OPTION);

			if (Nochmal == 0) {
				System.out.println(
						"                                                                                                                                                                      ");
				System.out.println(
						"                                                                                                                                                                   ");
				System.out.println(
						"                                                                                                                                                                   ");
				System.out.println(
						"                                                                                                                                                                   ");
				System.out.println(
						"                                                                                                                                                                   ");
				System.out.println(
						"                                                                                                                                                                   ");
				System.out.println(
						"                                                                                                                                                                   ");
				System.out.println(
						"                                                                                                                                                                   ");
				System.out.println(
						"                                                                                                                                                                   ");
				System.out.println(
						"                                                                                                                                                                   ");
				System.out.println(
						"                                                                                                                                                                   ");
				System.out.println(
						"                                                                                                                                                                   ");
				System.out.println(
						"                                                                                                                                                                   ");
				System.out.println(
						"                                                                                                                                                                   ");
				System.out.println(
						"                                                                                                                                                                   ");
				System.out.println(
						"                                                                                                                                                                   ");
				System.out.println(
						"                                                                                                                                                                   ");
				System.out.println(
						"                                                                                                                                                                   ");
				System.out.println(
						"                                                                                                                                                                   ");
				System.out.println(
						"                                                                                                                                                                   ");
				System.out.println(
						"                                                                                                                                                                   ");
			}

			if ((Nochmal == 1) || (Nochmal == 2)) {
				JOptionPane.showMessageDialog(null, "Dann bis zum nächsten Mal!!");
				break;
			}
		}
	}
}
