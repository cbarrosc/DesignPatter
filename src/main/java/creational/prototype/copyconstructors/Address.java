package creational.prototype.copyconstructors;

public class Address {

    public String stretAddress, city, country;

    public Address(String streetAddress, String city, String country) {
        this.stretAddress = streetAddress;
        this.city = city;
        this.country = country;
    }

    public Address(Address other) {
        this(other.stretAddress, other.city, other.country);
    }

    @Override
    public String toString() {
        return "Address{" +
                "stretAddress='" + stretAddress + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
