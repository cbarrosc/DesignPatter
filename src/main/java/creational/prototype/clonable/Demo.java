package creational.prototype.clonable;

public class Demo {//not recommended cause it's a shallow copy

    public static void main(String[] args) throws CloneNotSupportedException {
        Person john = new Person(new String[]{"John", "Smith"},
                new Address("London Road", 123));

        Person jane = john;
        jane.names[0] = "Jane";
        jane.address.houseNumber = 124;

        System.out.println(john);
        System.out.println(jane);
        //we overwrite john cause they refer to same object, shallow copy
        /** output
         * Person{names=Jane Smith, address=Address{streetName='London Road', houseNumber=124}}
         * Person{names=Jane Smith, address=Address{streetName='London Road', houseNumber=124}}
         * */

        Person john2 = new Person(new String[]{"John", "Smith"},
                new Address("London Road", 123));
        Person jane2 = (Person) john2.clone();
        jane2.names[0] = "Jane";
        jane2.address.houseNumber = 124;

        System.out.println(john2);
        System.out.println(jane2);



    }

}
