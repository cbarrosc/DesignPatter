package solid.dependencyinversion.nocumple;

import org.javatuples.Triplet;
import solid.dependencyinversion.Person;
import solid.dependencyinversion.Relationship;

import java.util.List;

public class Research { //high level - business logic
    public Research(Relationships relationships){//low level module as dependency
        List<Triplet<Person, Relationship, Person>> relations = relationships.getRelations();
        relations.stream()
                .filter(x -> x.getValue0().name.equals("John")
                        && x.getValue1() == Relationship.PARENT)
                .forEach(ch -> System.out.println("John has a child called " + ch.getValue2().name));
    }
}
