import java.util.Scanner;

public class Regnemaskine {
    //brug char
    //switch cases
    // husk break
    public static void main(String[] args) {
        char operator;
        double tal1, tal2, resultat;

        Scanner input = new Scanner(System.in);
        System.out.println("Indtast et tal");
        tal1 = input.nextDouble();

        System.out.println("Indtast en operator, +, -, /, *");
        operator = input.next().charAt(0);

        System.out.println("Indtast et tal mere");
        tal2 = input.nextDouble();

        switch (operator) {
            case '*':
                resultat = tal1 + tal2;
                System.out.println(tal1 + " + " + tal2 + " = " + resultat);

                break;

            case '-':
                resultat = tal1 - tal2;
                System.out.println(tal1 + " - " + tal2 + " = " + resultat);

                break;

            case '/':
                resultat = tal1 - tal2;
                System.out.println(tal1 + " / " + tal2);
                break;

            case '*':
                resultat = tal1 - tal2;
                System.out.println(tal1 + " * " + tal2);
                break;

            default:
                System.out.println("ugyldig operator");

                break;
            //Default


        }
    }
}
