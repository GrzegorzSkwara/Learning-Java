public class Pracownik {

    public  String imie;
    public  String nazwisko;
    public  int age;


    public Pracownik(String imie, String nazwisko, int age){
        this.imie = imie;
        this.nazwisko =nazwisko;
        this.age = age;
    }

    public Pracownik(String imie, int age){
        this.imie = imie;
        this.age=age;
    }
    public Pracownik(int age){
        this.age=age;
    }
    public Pracownik(Pracownik pracownik){
        this.imie=pracownik.imie;
        this.nazwisko=pracownik.nazwisko;
        this.age=pracownik.age;
    }



    public void funkcja(){
        if(nazwisko==null) nazwisko="Nan";
        if(imie==null)imie = "Nan";

        String name = imie + " " + nazwisko;
        System.out.println(name + " " + age);
    }

}
