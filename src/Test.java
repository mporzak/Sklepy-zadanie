public class Test {
    public static void main(String[] args) {
        Adres adres1 = new Adres("Krakow", "Wielka", "12");

        Kiosk kiosk1 = new Kiosk("U Ani", adres1);

        System.out.println(kiosk1.magazyn());

        kiosk1.wykonaj(Czynnosc.DOSTAWA, Gazety.FORBES, 2);
        kiosk1.wykonaj(Czynnosc.DOSTAWA, Gazety.NEWSWEEK, 3);
        kiosk1.wykonaj(Czynnosc.DOSTAWA, Gazety.PLAY, 4);
        kiosk1.wykonaj(Czynnosc.DOSTAWA, Gazety.FORBES, 4);
        kiosk1.wykonaj(Czynnosc.SPRZEDAZ, Gazety.PLAY, 2);
        System.out.println();
        System.out.println(kiosk1.magazyn());

        kiosk1.wykonaj(Czynnosc.SPRZEDAZ, Gazety.FORBES, 5);
        kiosk1.wykonaj(Czynnosc.SPRZEDAZ, Gazety.NEWSWEEK, 1);
        kiosk1.wykonaj(Czynnosc.DOSTAWA, Gazety.WYBORCZA, 15);

        System.out.println(kiosk1.magazyn());

        System.out.println(kiosk1.getSprzedaz(Gazety.FORBES));
        System.out.println(kiosk1.getSprzedaz(Gazety.WYBORCZA));

        kiosk1.info();




    }
}
