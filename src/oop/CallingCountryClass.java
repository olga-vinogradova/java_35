package oop;

public class CallingCountryClass {
    public static void main(String[] args) {

        //creating country class object
        Country latvia = new Country();//1st object. new Country() <--calling constructor
        latvia.setName("Latvia");
        latvia.setPopulation(1831586);
        latvia.setCapital("Riga");
        latvia.setCurrency("EUR");
        latvia.setInEU(true);

        latvia.countryInfo();
        latvia.isThisCountryInEU();

        Country china = new Country();//2nd object
        china.setName("China");
        china.setPopulation(1454456883);
        china.setCapital("Beijing");
        china.setCurrency("CNY");
        china.setInEU(false);

        china.countryInfo();
        china.isThisCountryInEU();

    }
}
