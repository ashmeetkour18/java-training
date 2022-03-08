package com.company.day14.person;

public class Address {
    private String street;
    private String city;
    private Long pincode;

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", pincode=" + pincode +
                '}';
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getPincode() {
        return pincode;
    }

    public void setPincode(Long pincode) {
        this.pincode = pincode;
    }

    public Address() {
        System.out.println("inside Address const");

    }

    public Address(String street, String city, Long pincode) {
        this.street = street;
        this.city = city;
        this.pincode = pincode;
        System.out.println("inside Address const 2");
    }
}
