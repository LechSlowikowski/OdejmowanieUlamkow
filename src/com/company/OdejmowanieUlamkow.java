package com.company;

public class OdejmowanieUlamkow {
    private int licznik1;
    private int mianownik1;
    private int licznik2;
    private int mianownik2;
    private int wynikLicznik;
    private int wynikMianownik;

    /********************************************************
     * nazwa funkcji: OdejmowanieUlamkow
     * parametry wejściowe: licznik1 - licznik pierwszego ułamka
     *                      mianownk1 - mianwnik pierwszego ułamka
     *                      licznik2 - licznik drugiego ułamka
     *                      mianownk2 - mianwnik drugiego ułamka
     * wartość zwracana: brak
     * opis: konstruktor klasy
     * autor: 45678901234
     * ****************************************************/
    public OdejmowanieUlamkow(int licznik1, int mianownik1, int licznik2, int mianownik2) {
        this.licznik1 = licznik1;
        this.mianownik1 = mianownik1;
        this.licznik2 = licznik2;
        this.mianownik2 = mianownik2;
    }

    /********************************************************
     * nazwa funkcji: obliczNWD
     * parametry wejściowe: a - pierwsza liczba, dla której obliczamy NWD
     *                      b - druga  liczba, dla której obliczamy NWD
     * wartość zwracana: największy wspólny dzielnik liczb a i b
     * opis: obliczanie największego wspólnego dzielnika liczb a i b
     * autor: 45678901234
     * ****************************************************/
    private int obliczNWD(int a, int b){
        while(a!=b){
            if(a>b) a = a - b; // można użyć skróconej formy: a -=b;
            else b = b - a; // można użyć skróconej formy: b -=a;
        }
        return a;
    }

    /********************************************************
     * nazwa funkcji: obliczRoznice
     * parametry wejściowe: brak
     * wartość zwracana: brak
     * opis: obliczanie oblicza różnicę dwóch ułamków
     * autor: 45678901234
     * ****************************************************/
    public void obliczRoznice(){
        this.wynikLicznik = this.licznik1 * this.mianownik2 - this.licznik2 * this.mianownik1;
        this.wynikMianownik = this.mianownik1 * this.mianownik2;
        //int nwd = obliczNWD(mianownik1, mianownik2);
        nt nwd = obliczNWD(wynikLicznik, wynikMianownik);
        this.wynikLicznik = this.wynikLicznik  / nwd;
        this.wynikMianownik = this.wynikMianownik  / nwd;
    }

    /********************************************************
     * nazwa funkcji: getWynikLicznik
     * parametry wejściowe: brak
     * wartość zwracana: wynikLicznik
     * opis: zwraca wynikowy licznik odejmowanych ułamków
     * autor: 45678901234
     * ****************************************************/
    public int getWynikLicznik() {
        return wynikLicznik;
    }

    /********************************************************
     * nazwa funkcji: getWynikMianownik
     * parametry wejściowe: brak
     * wartość zwracana: wynikMianownik
     * opis: zwraca wynikowy mianownik odejmowanych ułamków
     * autor: 45678901234
     * ****************************************************/
    public int getWynikMianownik() {
        return wynikMianownik;
    }
}
