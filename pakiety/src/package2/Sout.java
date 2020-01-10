package package2;

import package1.Animal;

public class Sout {
    String czyLata;

    void sout(Animal animal){
        System.out.println(animal.getName() + " " + animal.getSize());
    }

    void sout(Bird bird){
        if(bird.isFly()) czyLata = " umie latać";
        else czyLata = " nie umie latać";

        System.out.println(bird.getCountry() + " " + czyLata);
    }
}
