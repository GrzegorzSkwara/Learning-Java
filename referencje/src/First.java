import java.util.Vector;
public class First {
    public static void main(String[] args) {

        int [] tab = new int[5]; //tworze tablice

        Add newtab = new Add(); //tworze obiekt newtab

        newtab.add(tab); //wywoluje metode add

        for(int i : tab){
            System.out.println(tab[i]);
        }

        Vector v = new Vector(); // tworze wektor v

        Vec foo = new Vec(); // tworze obiekt foo

        foo.adding(v); // uruchamiam metode adding z klasy Vec

        System.out.println(v);  //drukuje vector
        
        Place x = new Place(); //klasa przechowuje punkty
        
        x.x1 =1; //przypisuje wartosci punktom
        x.x2 = 10;
        x.x3 = 100;
        
        Plus plus = new Plus();
        plus.add(x); //dodaje do kazdego punktu 1 
        System.out.println(x.x1 + " " + x.x2 + " " + x.x3);

    }
}

