import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Restauracja extends Sklep{

    private static final String TYP = "Restauracja";
    private int iloscStolikow;
    private double zysk;

    Map<Integer, String> stoliki = new TreeMap<>();

    public Restauracja(String nazwa, Adres adres, int iloscStolikow) {
        super(nazwa, adres);
        this.iloscStolikow = iloscStolikow;
        for (int i =1; i <= iloscStolikow; i++){
            stoliki.put(i, "wolny");
        }
    }
    public String getTyp(){
        return TYP;
    }
    public void info(){
        super.info();
    }
    public void rezerwacja(String nazwisko, int nrStolika) {
        if(stoliki.get(nrStolika).equals("wolny")){
            stoliki.replace(nrStolika, "zajety");
            System.out.println("Zarezerwowano stolik " + nrStolika + " na nazwisko " + nazwisko);
        } else{
            System.out.print("Ten stolik jest już zajęty! Wolne stoliki: ");
            znajdzWolnyStolik();}
    }
    public void usunRezerwacje(int nrStolika){
        stoliki.replace(nrStolika, "wolny");
        System.out.println("Rezerwacja stolika nr "+ nrStolika +" usunieta");
    }
    public void znajdzWolnyStolik(){
        Set<Integer> wolneStoliki = new HashSet<>();
        for(Map.Entry<Integer, String> entry : stoliki.entrySet()){
            if(entry.getValue().equals("wolny")){
                wolneStoliki.add(entry.getKey());
            }
        }
        System.out.println(wolneStoliki);
    }
    public void pokazStoliki(){
        for(Map.Entry<Integer, String> entry : stoliki.entrySet()){
            System.out.println("Stolik " + entry.getKey() + " - " + entry.getValue());
        }
    }
    public void dodajKlienta(Zamowienie zamowienie){
        zamowienie.rachunek();
        this.zysk += zamowienie.getSumaZamowienia();
    }
    public double getZysk(){
        return zysk;
    }
}
