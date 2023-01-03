package solid.openclosed.nocumple;

import solid.openclosed.Color;
import solid.openclosed.Product;
import solid.openclosed.Size;

import java.util.stream.Stream;

public class ProductFilter {

    //initial commit
    public Stream<Product> filterByColor(Stream<Product> products, Color color){
        return products.filter(p -> p.color == color);
    }

    //commit 2
    public Stream<Product> filterBySize(Stream<Product> products, Size size){
        return products.filter(p -> p.size == size);
    }

    //commit 3
    public Stream<Product> filterBySizeAndColor(Stream<Product> products, Size size, Color color){
        return products.filter(p -> p.size == size && p.color == color);
    }

}
