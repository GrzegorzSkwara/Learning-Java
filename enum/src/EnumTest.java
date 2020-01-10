public class EnumTest {

    public static void main(String[] args) {
        String[] odpowiedziUser = {"ok", "nope", "y"};
        wyswietl("WEJŚCIE", "WYJŚCIE");

        for(String wejscie:odpowiedziUser){
            wyswietl(wejscie, odpUseraString(wejscie));  //dla kazdego elementu z odpowiedziUser wyswietlamy elelment i sprawdzamy tru or false
        }


    }

    private static String odpUseraString(String wejscie){

            return odpUsera(wejscie)?"true":"false";

    }

    private static boolean odpUsera(String wejscie){
        boolean b = false;
        for(EnumExample odpowiedz:EnumExample.values()){    //po clym enum sprawdzam czy odp usera jest rowna ktorejs z enum i jesli tak to zwracam czy true czy false
            if(odpowiedz.toString().equalsIgnoreCase(wejscie)){
                b = odpowiedz.GetWartosc();
            }
        } return b;
    }

    private static void wyswietl(String s1, String s2){
        System.out.println(s1 + " | " + s2);
    }
}
