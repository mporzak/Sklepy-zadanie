public enum Menu {
    KOTLET(10.0),
    NALESNIKI(7.5),
    SUROWKA(2.5),
    FRYTKI(6.0),
    ZAPIEKANKA(7.0),
    HAMBURGER(10.5),
    KAWA(3.5),
    HERBATA(2.0);

    private double cena;

    Menu(double cena){
        this.cena = cena;
    }
    public double getCena(){
        return cena;
    }
}
