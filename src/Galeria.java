import java.util.ArrayList;
import java.util.List;

public class Galeria extends Sklep{
    private static final String TYP = "Galeria";
    private double zysk;
    List<Sklep> sklepyGaleria;

    public Galeria(String nazwa, Adres adres, List<Sklep> sklepyGaleria) {
        super(nazwa, adres);
        this.sklepyGaleria = sklepyGaleria;
    }
    public String getTyp(){
        return TYP;
    }
    public void dodajSklep(Sklep sklep){
        sklepyGaleria.add(sklep);
    }
    public void usunSklep(Sklep sklep){
        sklepyGaleria.remove(sklep);
    }
    public void listaSklepow(){
        System.out.println("Lista sklepow: ");
        for(Sklep sklep : sklepyGaleria){
            System.out.println(sklep.getTyp() + " " + sklep.getNazwa());
        }
    }
    @Override
    public void info() {
        super.info();
        listaSklepow();
        System.out.println();
    }

    @Override
    public double getZysk() {
        for(Sklep sklep : sklepyGaleria){
            zysk += sklep.getZysk();
        }
        return zysk;
    }
}
