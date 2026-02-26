import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<GeometrijskiLik> geoLikovi = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite naziv kruga.");
        String naziv = input.nextLine();
        System.out.println("Unesite radius kruga");
        double radius = Double.parseDouble(input.nextLine());

        Krug prviKrug = new Krug(naziv, radius);
        Krug drugiKrug = new Krug("krugic2", 5);
        geoLikovi.add(prviKrug);
        geoLikovi.add(drugiKrug);

        System.out.println("Unesite naziv pravokutnika.");
        naziv = input.nextLine();
        System.out.println("Unesite sirinu pravokutnika.");
        double sirina = Double.parseDouble(input.nextLine());
        System.out.println("Unesite visinu pravokutnika.");
        double visina = Double.parseDouble(input.nextLine());

        Pravokutnik prviPravokutnik = new Pravokutnik(naziv, sirina, visina);
        Pravokutnik drugiPravokutnik = new Pravokutnik("pravokutnic2", 6, 8);
        geoLikovi.add(prviPravokutnik);
        geoLikovi.add(drugiPravokutnik);

        System.out.println("Unesite naziv trokuta.");
        naziv = input.nextLine();
        System.out.println("Unesite stranicu a trokuta.");
        double a = Double.parseDouble(input.nextLine());
        System.out.println("Unesite stranicu b trokuta.");
        double b = Double.parseDouble(input.nextLine());
        System.out.println("Unesite stranicu c trokuta.");
        double c = Double.parseDouble(input.nextLine());

        Trokut prviTrokut = new Trokut(naziv, a, b, c);
        Trokut drugiTrokut = new Trokut("trokutic2", 3, 4, 6);
        geoLikovi.add(prviTrokut);
        geoLikovi.add(drugiTrokut);

        Collections.sort(geoLikovi);

        for(GeometrijskiLik g: geoLikovi) {
            System.out.println(g);
        }

        input.close();
    }
}
