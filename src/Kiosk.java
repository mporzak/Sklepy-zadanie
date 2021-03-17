import java.util.ArrayList;
import java.util.Collections;

public class Kiosk extends Sklep implements Transakcje{

    private int towarDostepny;
    private int towarSprzedany;
    private static final String TYP = "Kiosk";
    private double koszt;
    private double zysk;
    private double przychod;
    ArrayList<Gazety> gazetyWKiosku = new ArrayList<>();
    ArrayList<Gazety> gazetySprzedane = new ArrayList<>();

    public Kiosk(String nazwa, Adres adres) {
        super(nazwa, adres);
    }

    public String magazyn(){
        for(Gazety g : Gazety.values()){
            System.out.println(g.name() + " - " + getIlosc(g) +" szt.");
        }
        return "";
    }

    public String getTyp(){
        return TYP;
    }

    public void info(){
        super.info();
        System.out.println(magazyn());
    }

    @Override
    public int getIlosc(Gazety g) {
        int liczbaPowtorzen = Collections.frequency(gazetyWKiosku, g);
        g.setLiczbaGazety(liczbaPowtorzen);
        return liczbaPowtorzen;
    }

    @Override
    public int getSprzedaz(Gazety g) {
        int liczbaPowtorzen = Collections.frequency(gazetySprzedane, g);
        System.out.print("Spzedaz gazety " + g.name().toString() + " wyniosla ");
        return liczbaPowtorzen;
    }

    @Override
    public void wykonaj(Czynnosc c, Gazety g, int ilosc) {
        if(c.equals(Czynnosc.DOSTAWA)){
            for(int i =0; i < ilosc; i++){
                gazetyWKiosku.add(g);
            }
            this.koszt += g.getCenaHurtowa() * ilosc;
            this.towarDostepny += ilosc;
        } else if (c.equals(Czynnosc.SPRZEDAZ)){
            for(int i =0; i < ilosc; i++){
                gazetyWKiosku.remove(g);
                gazetySprzedane.add(g);
            }
            this.przychod += g.getCenaDetaliczna() * ilosc;
            this.towarDostepny -= ilosc;
            this.towarSprzedany += ilosc;
        }
    }

    public double getZysk(){
        zysk = przychod - koszt;
        return zysk;
    }
    public double getKoszt(){
        return koszt;
    }
}
