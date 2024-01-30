package com.javaesimerkki.composition;

public class App {
    public static void main(String[] args) throws Exception {
        // Luodaan Auto-olioita
        Auto auto1 = new Auto("Henkilöauto1", "Toyota");
        Auto auto2 = new Auto("Henkilöauto2", "Ford");

        // Kutsutaan Auto-olioiden metodeja
        auto1.aja();
        auto1.pysakoi();
        
        auto2.aja();
        auto2.pysakoi();
        
        // Tulostetaan luotujen Auto-olioiden määrä
        System.out.println("Yhteensä luotuja Auto-olioita: " + Auto.getAutojenMaara());
    }
}