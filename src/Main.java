import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Begrüßung1
        System.out.println("Willkommen bei meinem Taschenrechner: \n");

        // Einlesen von zwei Zahlen

        System.out.println("Die erste Zahl bitte:\t ");
        Scanner ersteZahl = new Scanner(System.in);
        double zahl1 = ersteZahl.nextInt();

        System.out.println("Welche Operation soll durchgeführt werden? +, -, *, /\t ");
        Scanner dritte = new Scanner(System.in);
        String operator = dritte.nextLine();

        System.out.println("Die zweite Zahl bitte:\t ");
        Scanner zweiteZahl = new Scanner(System.in);
        double zahl2 = zweiteZahl.nextInt();

        // Variablen für Zwischenergebnisse
        double addition = zahl1 + zahl2;
        double subtraktion = zahl1 - zahl2;
        double multiplikation = zahl1 * zahl2;
        double division = zahl1 / zahl2;


        switch (operator) {
            case "+":
                System.out.println("Das Ergebnis: ");
                System.out.println(addition);
                break;
            case "-":
                System.out.println("Das Ergebnis: ");
                System.out.println(subtraktion);
                break;
            case "*":
                System.out.println("Das Ergebnis: ");
                System.out.println(multiplikation);
                break;
            case "/":
                System.out.println("Das Ergebnis: ");
                System.out.println(division);
                break;
            default:
                System.out.println("Ungueltige Angabe!");
                break;

        }

        while (true) {

        System.out.println("Möchtest Du weiter rechnen? y/n");
        Scanner decision = new Scanner(System.in);
        String input = decision.next();



        if ("y".equals(input)) {

            System.out.println("Gib eine Operation ein: +, -, *, /\t ");
            Scanner vierte = new Scanner(System.in);
            String operator2 = vierte.nextLine();

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

        System.out.println("Programmabbruch!");
        break;

                }
            }
        }
    }