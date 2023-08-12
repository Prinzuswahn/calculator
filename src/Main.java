import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Begrüßung1
        System.out.println("Mein Taschenrechner: ");

        // Einlesen von zwei Zahlen

        System.out.println("Die erste Zahl bitte:\t ");
        Scanner ersteZahl = new Scanner(System.in);
        int zahl1 = ersteZahl.nextInt();

        System.out.println("Die zweite Zahl bitte:\t ");
        Scanner zweiteZahl = new Scanner(System.in);
        int zahl2 = zweiteZahl.nextInt();

        System.out.println("Welche Operation soll durchgeführt werden? +, -, *, /\t ");
        Scanner dritte = new Scanner(System.in);
        String operator  = dritte.nextLine();

        // Ergebnis der zwei Zahlen in var ergebnis

        /* Ausgabe von 1. und 2. Zahl + anschließender Ausgabe der Summe

        System.out.println("Erste Zahl ist: " + zahl1 + " \nZweite Zahl ist: " + zahl2);
        System.out.println("\nDas Ergebnis von " + zahl1 + " + " + zahl2 + " ist " + ergebnis ); */

        switch (operator) {
            case "+":
                System.out.println("Das Ergebnis: ");
                System.out.println(zahl1 + zahl2);
                break;
            case "-":
                System.out.println("Das Ergebnis: ");
                System.out.println(zahl1 - zahl2);
                break;
            case "*":
                System.out.println("Das Ergebnis: ");
                System.out.println(zahl1 * zahl2);
                break;
            case "/":
                System.out.println("Das Ergebnis: ");
                System.out.println(zahl1 / zahl2);
                break;
            default:
                System.out.println("Ungueltige Angabe!");
                break;

        }

        System.out.println("Möchtest Du weiter rechnen? y/n");
            Scanner decision = new Scanner(System.in);
            String input = decision.next();

        if ( "y".equals (input)) {
            System.out.println("Gib eine weitere Operation ein: +, -, *, /\t ");

            Scanner vierte = new Scanner(System.in);
            String operator1  = vierte.nextLine();

            System.out.println("Die dritte Zahl bitte:\t ");
            Scanner dritteZahl = new Scanner(System.in);
            int zahl3 = dritteZahl.nextInt();

            System.out.println("Die vierte Zahl bitte:\t ");
            Scanner vierteZahl = new Scanner(System.in);
            int zahl4 = vierteZahl.nextInt();

            switch (operator1) {
                case "+":
                    System.out.println("Das Ergebnis: ");
                    System.out.println(zahl1 + zahl2 + zahl3 + zahl4);
                    break;
                case "-":
                    System.out.println("Das Ergebnis: ");
                    System.out.println(zahl1 - zahl2 - zahl3 - zahl4);
                    break;
                case "*":
                    System.out.println("Das Ergebnis: ");
                    System.out.println(zahl1 * zahl2 * zahl3 * zahl4);
                    break;
                case "/":
                    System.out.println("Das Ergebnis: ");
                    System.out.println(zahl1 / zahl2 / zahl3 / zahl4);
                    break;
                default:
                    System.out.println("Ungueltige Angabe!");
                    break;

            }

        } else {
            System.out.println("Eingabe beendet");
        }



    }

}