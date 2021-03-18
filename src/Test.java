import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Adres adres1 = new Adres("Krakow", "Wielka", "12");

        Kiosk kiosk1 = new Kiosk("U Ani", adres1);
        Kiosk kiosk2 = new Kiosk("U Jasia", adres1);

        Zamowienie z1 = new Zamowienie(1);
        z1.zamawiam(Menu.FRYTKI, Menu.KAWA, Menu.KAWA, Menu.FRYTKI, Menu.FRYTKI, Menu.HAMBURGER, Menu.KAWA, Menu.KAWA);
        z1.rachunek();
        System.out.println(z1.getKto());



    }
}
