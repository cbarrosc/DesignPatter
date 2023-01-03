package creational.prototype.clonable;

import java.util.Objects;

public class Address  implements Cloneable{

    public String streetName;
    public int houseNumber;

    public Address(String streetName, int houseNumber) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }

    @Override //change it to protected to public -> is a deep copy mechanic
    public Object clone() throws CloneNotSupportedException{
        return new Address(streetName,houseNumber);
    }

}
