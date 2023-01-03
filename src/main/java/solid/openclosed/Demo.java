package solid.openclosed;

import solid.openclosed.cumple.AndSpecification;
import solid.openclosed.cumple.BetterFilter;
import solid.openclosed.cumple.ColorSpecification;
import solid.openclosed.cumple.SizeSpecification;
import solid.openclosed.nocumple.ProductFilter;

import java.util.List;

public class Demo {

    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);

        List<Product> products = List.of(apple, tree, house);

        ProductFilter pf = new ProductFilter();

        System.out.println("Green products (old):");
        pf.filterByColor(products.stream(), Color.GREEN)
                .forEach(p -> System.out.println(" - " + p.name + " is green"));

        BetterFilter bf = new BetterFilter();
        System.out.println("Green products (new)");
        bf.filter(products, new ColorSpecification(Color.GREEN))
                .forEach(p -> System.out.println(" - " + p.name + " is green"));

        System.out.println("Large blue items");
        bf.filter(products, new AndSpecification<>(
                new ColorSpecification(Color.BLUE),
                new SizeSpecification(Size.LARGE)
        )).forEach(p -> System.out.println(" - " + p.name + " is large and blue"));


    }

}
