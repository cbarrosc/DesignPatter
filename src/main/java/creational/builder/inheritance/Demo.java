package creational.builder.inheritance;

public class Demo {
    public static void main(String[] args) {
        EmployeeBuilder pb = new EmployeeBuilder();
        Person person = pb
                .withName("Dmitri")
                .worksAt("Oracle")
                .build();
        System.out.println(person);
    }
}
