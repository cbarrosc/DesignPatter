package solid.dependencyinversion.cumple;

import solid.dependencyinversion.Person;

import java.util.List;

public class Research { //high level - business logic
   public Research(RelationshipBrowser browser) {
       List<Person> children = browser.findAllChildrenOf("John");
       for (Person child : children)
           System.out.println("John has a child called " + child.name);
   }
}
