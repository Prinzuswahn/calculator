import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Begrüßung im Programm
        System.out.println("Willkommen bei meinem Taschenrechner: \t");

        // Einlesen von zwei Zahlen

        System.out.println("Die erste Zahl: ");
        double zahl1 = scanner.nextDouble();

        System.out.println("Die zweite Zahl: \t ");
        double zahl2 = scanner.nextDouble();

        // Auswahl fuer Rechenoperation fuerden Benutzer
        System.out.println("Welche Operation soll durchgefuehrt werden?");
        System.out.println("1 fuer Addition");
        System.out.println("2 fuer Subtraktion");
        System.out.println("3 fuer Multiplikation");
        System.out.println("4 fuer Division");

        System.out.println("Auswahl: ");
        int choice = scanner.nextInt();

        double ergebnis = 0;

        switch (choice) {
            case 1:
                ergebnis = zahl1 + zahl2;
                break;
            case 2:
                ergebnis = zahl1 - zahl2;
                break;
            case 3:
                ergebnis = zahl1 * zahl2;
                break;
            case 4:
                ergebnis = zahl1 / zahl2;
                break;
            default:
                System.out.println("Ungueltige Angabe!");
                break;

        }

        System.out.println("Das Ergebnis ist: " + ergebnis);

 /* tbc
        while (true) {

            System.out.println("Möchtest Du weiter rechnen? y/n");
            Scanner decision = new Scanner(System.in);
            String input = decision.next();


            if ("y".equals(input)) {

                System.out.println("Welche Operation willst Du durchfuehren?: +, -, *, /\t ");
                Scanner operation2 = new Scanner(System.in);
                String operator2 = operation2.nextLine();

                System.out.println("Die nächste Zahl bitte:\t ");
                Scanner dritteZahl = new Scanner(System.in);
                double zahl3 = dritteZahl.nextInt();


                switch (operator2) {
                    case "+":
                        System.out.println("Das Ergebnis: ");
                        System.out.println(addition + zahl3);
                        break;
                    case "-":
                        System.out.println("Das Ergebnis: ");
                        System.out.println(subtraktion - zahl3);
                        break;
                    case "*":
                        System.out.println("Das Ergebnis: ");
                        System.out.println(multiplikation * zahl3);
                        break;
                    case "/":
                        System.out.println("Das Ergebnis: ");
                        System.out.println(division / zahl3);
                        break;
                    default:
                        System.out.println("Ungueltige Angabe!");
                        break;

                }

            } else {

                System.out.println("Berechnung abgeschlossen.");
                break;

            }

 */
        }
    }
