package solid.dependencyinversion.nocumple;

import org.javatuples.Triplet;
import solid.dependencyinversion.Person;
import solid.dependencyinversion.Relationship;

import java.util.ArrayList;
import java.util.List;

public class Relationships { //low level - persistance

    private List<Triplet<Person, Relationship, Person>> relations = new ArrayList<>();

    public List<Triplet<Person, Relationship, Person>> getRelations() {
        return relations;
    }

    public  void addParentAndChild(Person parent, Person child) {
        relations.add(new Triplet<>(parent, Relationship.PARENT, child));
        relations.add(new Triplet<>(child, Relationship.CHILD, parent));
    }


}
