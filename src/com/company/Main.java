package com.company;

import java.util.Scanner;
/********************************************************
 * nazwa klasy: Main
 * atrybuty: licznik1 - licznik pierwszego ułamka
 *           mianownk1 - mianwnik pierwszego ułamka
 *           licznik2 - licznik drugiego ułamka
 *           mianownk2 - mianwnik drugiego ułamka
 * atrybuty zwracane  wynikLcznik - licznik wyniku
 *                    wynikMianownk - mianwnik różnicy
 * autor: 45678901234
 * ****************************************************/
public class Main {
    private static int licznik1;
    private static int mianownik1;
    private static int licznik2;
    private static int mianownik2;
    private static int wynikLicznik;
    private static int wynikMianownik;

    /********************************************************
     * nazwa funkcji: main
     * parametry wejściowe: args - parametry wywołania programu
     * wartość zwracana: brak
     * autor: 45678901234
     * ****************************************************/
    public static void main(String[] args) {
        //bufor do wczytywania danych z klawiatury
        Scanner daneWejsciowe = new Scanner(System.in);
        //wczytujemy licznik i mianownik pierwszego ułamka
        System.out.print("Wprowadź licznik pierwszego ułamka: ");
        licznik1 = daneWejsciowe.nextInt();
        System.out.print("Wprowadź mianownik pierwszego ułamka: ");
        mianownik1 = daneWejsciowe.nextInt();

        //wczytujemy licznik i mianownik drugiego ułamka
        System.out.print("Wprowadź licznik drugiego ułamka: ");
        licznik2 = daneWejsciowe.nextInt();
        System.out.print("Wprowadź mianownik drugiego ułamka: ");
        mianownik2 = daneWejsciowe.nextInt();

        OdejmowanieUlamkow odejmowanieUlamkow = new OdejmowanieUlamkow(licznik1, mianownik1, licznik2, mianownik2);
        odejmowanieUlamkow.obliczRoznice();
        wynikLicznik = odejmowanieUlamkow.getWynikLicznik();
        wynikMianownik = odejmowanieUlamkow.getWynikMianownik();

        System.out.print(licznik1 + "/" + mianownik1 + " - ");
        System.out.print(licznik2 + "/" + mianownik2 + " = ");
        System.out.println(wynikLicznik + "/" + wynikMianownik);
    }
}
