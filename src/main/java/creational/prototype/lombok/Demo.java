package creational.prototype.lombok;


public class Demo {

    public static void main(String[] args) {
       Foo f0 = Foo.builder().stuff(0).whatever("something").build();
       Foo f1 = f0.toBuilder().stuff(1).build();
        System.out.println(f0);
        System.out.println(f1);
    }

}
