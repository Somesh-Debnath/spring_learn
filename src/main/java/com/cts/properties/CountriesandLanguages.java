package com.cts.properties;

import java.util.Properties;

public class CountriesandLanguages {
    private Properties countriesandlanguages;

    public Properties getCountriesandlanguages() {
        return countriesandlanguages;
    }

    public void setCountriesandlanguages(Properties countriesandlanguages) {
        this.countriesandlanguages = countriesandlanguages;
    }

    @Override
    public String toString() {
        return "CountriesandLanguages [countriesandlanguages=" + countriesandlanguages + "]";
    }
}
