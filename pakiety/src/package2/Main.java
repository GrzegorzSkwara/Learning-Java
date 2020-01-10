package package2;

import package1.Animal;
import package1.Size;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.setCountry("Poland");
        dog.setName("Burek");
        dog.setSize(Size.SMALL);

        Bird owl = new Bird();
        owl.setFly(true);
        owl.setCountry("France");
        owl.setName("Pigi");
        owl.setSize(Size.MEDIUM);

        Sout sout = new Sout();
        sout.sout(dog);
        sout.sout(owl);


    }
}
