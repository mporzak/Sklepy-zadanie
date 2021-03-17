public interface Transakcje {

    int getIlosc(Gazety g);
    int getSprzedaz(Gazety g);
    void wykonaj(Czynnosc c, Gazety g, int ilosc);
}
