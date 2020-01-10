package package2;

import package1.Animal;

public class Bird extends Animal {
    public boolean isFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    boolean fly;
}
