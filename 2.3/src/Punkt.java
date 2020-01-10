public class Punkt {

    int x;
    int y;
    Integer z;

    public Punkt(int x, int y, Integer z) {
        this.x = x;
        this.y=y;
        this.z=z;
    }

    void zwieksz(){
        x++;
        y++;
        z++;
    }
    void zmien(){
        x+=100;
        y+=100;
    }
}
