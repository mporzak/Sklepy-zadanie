public class Hipermarket extends Sklep{

    private static final String TYP = "Hipermarket";
    private double zysk;

    public Hipermarket(String nazwa, Adres adres) {
        super(nazwa, adres);
    }
    public String getTyp(){
        return TYP;
    }
    public void zarobek(int klienci, double sredniWydatek){
        zysk += ((klienci * sredniWydatek)*0.05);
    }
    public double getZysk(){
        return zysk;
    }
    public void info(){
        super.info();
    }

    public class StacjaPaliw{
        private double zyskStacji;
        private double[] cenyPaliwa = new double[3];

        public StacjaPaliw(double[] cenyPaliwa){
            this.cenyPaliwa = cenyPaliwa;
        }
        public void zatankuj(Paliwo rodzajPaliwa, double zatankowanaIlosc){
            double cena=0;
            switch (rodzajPaliwa){
                case BENZYNA:
                    cena = cenyPaliwa[0];
                    break;
                case OLEJ:
                    cena = cenyPaliwa[1];
                    break;
                case LPG:
                    cena = cenyPaliwa[2];
                    break;
            }
            zyskStacji += (cena * zatankowanaIlosc);
            zysk += zyskStacji;
        }

        public double getZyskStacji() {
            return zyskStacji;
        }
    }
}
