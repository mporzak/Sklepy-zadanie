import java.net.PortUnreachableException;

public enum Gazety {

    WPROST(2.5, 3),
    NEWSWEEK(2.25, 2.75),
    WYBORCZA(1.8, 2),
    FORBES(4.9, 5.7),
    PLAY(7, 7.5);

    private double cenaHurtowa;
    private double cenaDetaliczna;
    private int liczbaGazety;

    Gazety(double cenaHurtowa, double cenaDetaliczna){
        this.cenaHurtowa = cenaHurtowa;
        this.cenaDetaliczna = cenaDetaliczna;
    }
    public double getCenaHurtowa(){
        return cenaHurtowa;
    }

    public double getCenaDetaliczna() {
        return cenaDetaliczna;
    }
    public String toString(){
        return values().toString() + ", cena hurtowa " + cenaHurtowa +", cena detaliczna " + cenaDetaliczna;
    }
    public int getLiczbaGazety(){
        return liczbaGazety;
    }
    public void setLiczbaGazety(int liczbaGazety){
        this.liczbaGazety = liczbaGazety;
    }
}
