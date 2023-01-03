package solid.dependencyinversion.cumple;

import solid.dependencyinversion.Person;

import java.util.List;

public interface RelationshipBrowser {
    List<Person> findAllChildrenOf(String name);
}
