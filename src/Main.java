import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite naziv kruga.");
        String naziv = input.nextLine();
        System.out.println("Unesite radius kruga");
        double radius = Double.parseDouble(input.nextLine());

        Krug prviKrug = new Krug(naziv, radius);
        prviKrug.calcOpseg();
        prviKrug.calcPovrsina();
        System.out.println(prviKrug.toString());

        System.out.println("Unesite naziv pravokutnika.");
        naziv = input.nextLine();
        System.out.println("Unesite sirinu pravokutnika.");
        double sirina = Double.parseDouble(input.nextLine());
        System.out.println("Unesite visinu pravokutnika.");
        double visina = Double.parseDouble(input.nextLine());

        Pravokutnik prviPravokutnik = new Pravokutnik(naziv, sirina, visina);
        prviPravokutnik.calcOpseg();
        prviPravokutnik.calcPovrsina();
        System.out.println(prviPravokutnik.toString());

        System.out.println("Unesite naziv trokuta.");
        naziv = input.nextLine();
        System.out.println("Unesite stranicu a trokuta.");
        double a = Double.parseDouble(input.nextLine());
        System.out.println("Unesite stranicu b trokuta.");
        double b = Double.parseDouble(input.nextLine());
        System.out.println("Unesite stranicu c trokuta.");
        double c = Double.parseDouble(input.nextLine());

        Trokut prviTrokut = new Trokut(naziv, a, b, c);
        prviTrokut.calcOpseg();
        prviTrokut.calcPovrsina();
        System.out.println(prviTrokut.toString());

        input.close();
    }
}
