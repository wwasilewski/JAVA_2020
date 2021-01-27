package powtorka.tydzien2.zadania.oop.person;

public class Address {

    private String street, city, country;
    private int flatNo, homeNo;

    public Address(String street, String city, String country, int flatNo, int homeNo) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.flatNo = flatNo;
        this.homeNo = homeNo;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(int flatNo) {
        this.flatNo = flatNo;
    }

    public int getHomeNo() {
        return homeNo;
    }

    public void setHomeNo(int homeNo) {
        this.homeNo = homeNo;
    }
}
