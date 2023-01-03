package solid.openclosed.cumple;

public interface Specification<T> {

    boolean isSatisfied(T item);

}
