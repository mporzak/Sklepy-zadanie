public class Adres {
    private String miasto;
    private String ulica;
    private String nrLokalu;

    public Adres(String miasto, String ulica, String nrLokalu){
        this.miasto = miasto;
        this.ulica = ulica;
        this.nrLokalu = nrLokalu;
    }
    public String toString(){
        return miasto + ", ulica " + ulica +" " + nrLokalu;
    }
}
