import java.io.*;
import java.util.Calendar;

public class Human implements Serializable {
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        try {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("file.bin"));
            output.writeObject(new Human("Grzegorz", 25));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("file.bin"));
            Human human = (Human) input.readObject();
            System.out.println(human.name);
            System.out.println(human.age);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        int birth = Calendar.getInstance().get(Calendar.YEAR) - age;
        stream.writeInt(birth);

    }

    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        int birth = stream.readInt();
        age = Calendar.getInstance().get(Calendar.YEAR) - birth;
    }
}
