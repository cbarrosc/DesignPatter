package creational.builder.lombok;

public class Demo {

    public static void main(String[] args) {
        Person person = Person.builder()
                .streetAddress("123 London Road")
                .city("London")
                .postcode("SW12BC")
                .companyName("Fabrikam")
                .position("Engineer")
                .annualIncome(123000)
                .build();
        System.out.println(person);
    }

}
