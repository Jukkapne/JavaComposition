package com.javaesimerkki.composition;

// Komponentti, joka kuvaa ajoneuvon toimintaa
class AjoneuvonToiminta {
    public void aja(String nimi) {
        System.out.println(nimi + " ajaa.");
    }

    public void pysakoi(String nimi) {
        System.out.println(nimi + " pysähtyy.");
    }
}


