/* Klasa ta ma obsługiwać czynności związane z zamawianiem potraw w restauracji,
min: notować nazwy zamawianych potraw, drukować paragon itd
 */
import java.util.*;

public class Zamowienie<T> {

    //id klienta dowolnego typu
    private T idKlienta;
    private double sumaZamowienia;
    List<Menu> noweZamowienie = new ArrayList<>();

    public Zamowienie(T idKlienta){
        this.idKlienta = idKlienta;
    }

    public T getKto(){
        return idKlienta;
    }
    //metoda umozliwiajaca zamowienie dowolnej liczby elementow z Menu
    public void zamawiam(Menu...args){
        for(Menu m : args){
            noweZamowienie.add(m);
        }
    }
    //wypisz ilosc danej potrawy, jej nazwe i cene oraz calkowita sume zamowienia
    public void rachunek(){
       int iloscPowtorzen;
        Set<Menu> set = new HashSet<>(noweZamowienie);
        for(Menu m : set){
            iloscPowtorzen = Collections.frequency(noweZamowienie, m);
            System.out.println(iloscPowtorzen + " raz(y) "+ m + " po " + m.getCena());
            sumaZamowienia += iloscPowtorzen * m.getCena();
        }
        System.out.println("---------------------");
        System.out.println("Razem: " + sumaZamowienia + " zl");
    }

    public double getSumaZamowienia() {
        return sumaZamowienia;
    }
}
