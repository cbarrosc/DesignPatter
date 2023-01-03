package creational.prototype.clonable;

public class Person implements Cloneable{
    public String[] names;
    public Address address;

    public Person(String[] names, Address address) {
    this.names = names;
    this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
        "names=" + String.join(" ", names) +
        ", address=" + address +
        '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Person(
                names.clone(),
                (Address) address.clone());
    }
}
