package com.javaesimerkki.composition;

// Auto-luokka, joka koostaa AjoneuvonToiminta-komponentin
class Auto {
    private String nimi;
    private String merkki;
    private AjoneuvonToiminta toiminta; // Ajoneuvon toimintakomponentin sisällyttäminen
    private static int autojenMaara = 0; // Staattinen muuttuja auto-olioiden määrän laskemiseksi

    public Auto(String nimi, String merkki) { // Konstruktori jossa AjoneuvonToiminta-komponentti luodaan myös sekä kasvatetaan autojen määrän laskuria
        this.nimi = nimi;
        this.merkki = merkki;
        this.toiminta = new AjoneuvonToiminta(); // Komponentin instanssi
        autojenMaara++; // Kasvattaa auto-olioiden määrää
    }

    public void aja() {
        toiminta.aja(nimi); // Delegoi toiminta AjoneuvonToiminta-komponentille
        System.out.println("Tämä on " + this.merkki + "-merkkinen auto.");
    }

    public void pysakoi() {
        toiminta.pysakoi(nimi); // Delegoi toiminta AjoneuvonToiminta-komponentille
    }
    
    public static int getAutojenMaara() {
        return autojenMaara;
    }
}