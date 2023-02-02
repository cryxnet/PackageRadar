package com.cryxnet.objects;

import com.cryxnet.definitions.NetworkObject;

public class IPAddress {
    private String ip;
    private String network;
    private String version;
    private String city;
    private String region;
    private String region_code;
    private String country;
    private String country_name;
    private String country_code;
    private String country_code_iso3;
    private String country_capital;
    private String country_tld;
    private String continent_code;
    private boolean in_eu;
    private String postal;
    private float latitude;
    private float longitude;
    private String timezone;
    private String utc_offset;
    private String country_calling_code;
    private String currency;
    private String currency_name;
    private String languages;
    private float country_area;
    private float country_population;
    private String asn;
    private String org;

    public IPAddress(String ip, String network, String version, String city, String region, String region_code, String country, String country_name, String country_code, String country_code_iso3, String country_capital, String country_tld, String continent_code, boolean in_eu, String postal, float latitude, float longitude, String timezone, String utc_offset, String country_calling_code, String currency, String currency_name, String languages, float country_area, float country_population, String asn, String org) {
        this.ip = ip;
        this.network = network;
        this.version = version;
        this.city = city;
        this.region = region;
        this.region_code = region_code;
        this.country = country;
        this.country_name = country_name;
        this.country_code = country_code;
        this.country_code_iso3 = country_code_iso3;
        this.country_capital = country_capital;
        this.country_tld = country_tld;
        this.continent_code = continent_code;
        this.in_eu = in_eu;
        this.postal = postal;
        this.latitude = latitude;
        this.longitude = longitude;
        this.timezone = timezone;
        this.utc_offset = utc_offset;
        this.country_calling_code = country_calling_code;
        this.currency = currency;
        this.currency_name = currency_name;
        this.languages = languages;
        this.country_area = country_area;
        this.country_population = country_population;
        this.asn = asn;
        this.org = org;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegion_code() {
        return region_code;
    }

    public void setRegion_code(String region_code) {
        this.region_code = region_code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getCountry_code_iso3() {
        return country_code_iso3;
    }

    public void setCountry_code_iso3(String country_code_iso3) {
        this.country_code_iso3 = country_code_iso3;
    }

    public String getCountry_capital() {
        return country_capital;
    }

    public void setCountry_capital(String country_capital) {
        this.country_capital = country_capital;
    }

    public String getCountry_tld() {
        return country_tld;
    }

    public void setCountry_tld(String country_tld) {
        this.country_tld = country_tld;
    }

    public String getContinent_code() {
        return continent_code;
    }

    public void setContinent_code(String continent_code) {
        this.continent_code = continent_code;
    }

    public boolean isIn_eu() {
        return in_eu;
    }

    public void setIn_eu(boolean in_eu) {
        this.in_eu = in_eu;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getUtc_offset() {
        return utc_offset;
    }

    public void setUtc_offset(String utc_offset) {
        this.utc_offset = utc_offset;
    }

    public String getCountry_calling_code() {
        return country_calling_code;
    }

    public void setCountry_calling_code(String country_calling_code) {
        this.country_calling_code = country_calling_code;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrency_name() {
        return currency_name;
    }

    public void setCurrency_name(String currency_name) {
        this.currency_name = currency_name;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public float getCountry_area() {
        return country_area;
    }

    public void setCountry_area(float country_area) {
        this.country_area = country_area;
    }

    public float getCountry_population() {
        return country_population;
    }

    public void setCountry_population(float country_population) {
        this.country_population = country_population;
    }

    public String getAsn() {
        return asn;
    }

    public void setAsn(String asn) {
        this.asn = asn;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }
}
