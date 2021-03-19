import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Adres adres1 = new Adres("Krakow", "Wielka", "12");
        Adres adres2 = new Adres("Warszawa", "Urocza", "129");

        Kiosk kiosk1 = new Kiosk("U Ani", adres1);
        Restauracja rest1 = new Restauracja("Pyszna", adres1, 5);
        List<Sklep> sklepy1 = new ArrayList<>();
        sklepy1.add(kiosk1);
        sklepy1.add(rest1);
        Galeria galeria1 = new Galeria("Tarasy", adres1, sklepy1);

        kiosk1.wykonaj(Czynnosc.DOSTAWA, Gazety.FORBES, 15);
        kiosk1.wykonaj(Czynnosc.DOSTAWA, Gazety.WYBORCZA, 20);
        kiosk1.wykonaj(Czynnosc.SPRZEDAZ, Gazety.WYBORCZA, 18);
        kiosk1.wykonaj(Czynnosc.SPRZEDAZ, Gazety.FORBES, 12);
        //kiosk1.magazyn();

        Zamowienie z1 = new Zamowienie(1);
        Zamowienie z2 = new Zamowienie("Klient1");
        z1.zamawiam(Menu.FRYTKI, Menu.KAWA, Menu.KAWA, Menu.FRYTKI, Menu.FRYTKI, Menu.HAMBURGER, Menu.KAWA, Menu.KAWA);
        z2.zamawiam(Menu.KOTLET, Menu.FRYTKI, Menu.HERBATA);

        rest1.rezerwacja("Nowak", 2);
        rest1.rezerwacja("Kowal", 5);
        System.out.println();

        rest1.pokazStoliki();
        System.out.println();
        rest1.rezerwacja("Baran", 2);
        rest1.usunRezerwacje(5);
        //rest1.pokazStoliki();

        rest1.dodajKlienta(z1);
        rest1.dodajKlienta(z2);

        galeria1.info();

        double[] cenyS1 = {5.40, 4.90, 2.70};

        Hipermarket h1 = new Hipermarket("Tesco", adres1);
        Hipermarket.StacjaPaliw s1 = h1.new StacjaPaliw(cenyS1);

        s1.zatankuj(Paliwo.LPG, 50);
        s1.zatankuj(Paliwo.BENZYNA, 40);

        //System.out.println(s1.getZyskStacji());
        h1.zarobek(5, 10);

        h1.info();

        kiosk1.info();
    }
}
