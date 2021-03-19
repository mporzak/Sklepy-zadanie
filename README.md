## Zadanie ##

Następujące klasy:


* "Sklep",
* "Kiosk",
* "Galeria",
* "Zamowienie",
* "Restauracja".
* "Hipermarket".

Typy: "Kiosk", "Galeria", "Restauracja", "Hipermarket" są też typami "Sklep". Każde z wymienionych klas ma następującą strukturę i funkcjonalność:


### Sklep: ###

Klasa ta posiada następujące pola i metody:

* prywatną zmienną typu int, która będzie nadawać numer identyfikujący sklep. 
* prywatną zmienną typu Adres przechowującą adres sklepu (klasa Adres, podana w pliku poniżej),
* konstruktor definiujący nazwę i adres sklepu,
* bezparametrową metodę "getTyp()" zwracającą stringa o typie sklepu, np. "Kiosk",
* bezparametrową metodę "getZysk()" typu double, zwracającą wartość zysku w danym sklepie,
* bezparametrową metodę "getNazwa()" zwracającą stringa o nazwie sklepu, np. "Tesco",
* bezparametrową metodę "getAdres()" zwracającą stringa o adresie sklepu, np. "Kraków, ul. Wiśniowa 12",
* bezparametrową metodę "Info()" typu void, która wypisuje informacje o sklepie (zobacz na dole zadania).


### Kiosk: ### 

Klasa ta dziedziczy po klasie "Sklep" i interfejsie "Transakcje", posiada:

* dwie zmienne: jedna z nich przechowuje dane dotyczące ilości towaru w kiosku, a druga ilości sprzedanych towarów,
* konstruktor definiujący nazwę i adres kiosku
* metodę "magazyn()": bezparametrowa, zwracająca string i wypisująca listę towaru w kiosku
* metodę "koszt()": koszty poniesione z powodu zakupu towaru,
* metodę "dochod()": wyliczająca dochód kiosku,
* metodę "getZysk()" typu double, która zwraca zysk kiosku,
* metodę "Info()" typu void
* Interfejs "Transakcje"


### Galeria: ### 

Klasa ta dziedziczy po klasie "Sklep", zawiera:

* prywatną zmienną przechowującą tablicę sklepów w galerii
* konstruktor, który definiuje nazwę, adres i tablicę sklepów,
* bezparametrową metodę "getTyp()" 
* bezparametrową metodę "ListaSklepow()" 
* bezparametrową metodę "getZysk()" typu double, która zwraca zysk z galerii (wszystkich sklepów w galerii),
* bezparametrową metodę "Info()"


### Zamowienie: ### 

Klasa ta ma obsługiwać czynności związane z zamawianiem potraw w restauracji, min: notować nazwy zamawianych potraw, drukować paragon itd. 

* zmienną przechowującą identyfikator klienta. Może to być numer, nazwisko, znak
* metodę "getKto()" zwracającą zmienną identyfikującą klienta,
* metodę "zamawiam" z nieokreśloną liczbą argumentów (mogą się powtarzać) typu "Menu", który jest typem wyliczeniowym 
* metoda "getCena" zwracająca cenę potrawy.
* metoda "rachunek()" typu void, która wypisuje rachunek zamówienia
* metoda "kwota()", która zwraca kwotę do zapłaty 


### Restauracja: ### 

Klasa ta dziedziczy po klasie "Sklep", zawiera:

* prywatną zmienną typu int określająca ilość stolików w restauracji,
* prywatną zmienną typu double określająca zysk restauracji,
* konstruktor, który definiuje nazwę, adres i liczbę stolików,
* metodę "void rezerwacja" z dwoma parametrami: pierwszy typu String ogreślający nazwisko rezerwującego, drugi typu int określający numer stolika. 
* metodę "usun_rezerwacje"
* metodę "dodajKlienta", która tworzy nowe zamówienie. 

### Hipermarket: ### 

Klasa ta dziedziczy po klasie "Sklep" i ma następujące pola i metody:

* prywatną zmienną typu double przechowującą zysk hipermarketu (także ze sprzedaży paliw na stacji),
* konstruktor definiujący nazwę i adres,
* bezparametrową metodę "getTyp()" zwracającą stringa = "Hipermarket",
* metodę "void zarobek(int klienci, double sredniWydatek)" zwiększającą zysk hipermarketu o 5% z utargu. 
* bezparametrową metodę "getZysk()",
* bezparametrową metodę "Info()",
* zagnieżdżoną klasę "StacjaPaliw" składającą się z:
	* prywatnej tablicy 4-elementowej typu double określającej zysk ze sprzedaży jednego litra z każdego z rodzajów paliw. Rodzaje paliw jakie możemy zatankować określa nam     zmienna typu wyliczeniowego o nazwie "Paliwo"
	* konstruktora definiującego tą tablicę,
	* metody o nazwie "zatankuj", zwiększającej zysk stacji paliw, a związku z tym także hipermarketu, o zatankowane przez klienta paliwo
	* metody o nazwie "zyskStacji".
