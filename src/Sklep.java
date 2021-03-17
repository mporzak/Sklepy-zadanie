public class Sklep {
    private int id = 1;
    private String nazwa;
    private Adres adres;
    private String typ;
    private double zysk;

    public Sklep(String nazwa, Adres adres){
        this.nazwa = nazwa;
        this.adres = adres;
        id++;
    }
    public String getTyp(){
        return typ;
    }
    public double getZysk(){
        return zysk;
    }
    public String getNazwa(){
        return nazwa;
    }
    public String getAdres(){
        return adres + "";
    }
    public void info(){
        System.out.print("ID: " + id + "\n" + getNazwa() + "\n" + getAdres() + "\n" + getTyp() + "\n" + getZysk() +"\n");
    }
}

