import java.io.*;

public class Main {
    public static void main(String[] args) {
        DataInputStream in = null;
        DataOutputStream out = null;

        try{
            in = new DataInputStream(new FileInputStream("n1.txt"));
            out = new DataOutputStream(new FileOutputStream("n2.txt"));

        }catch (FileNotFoundException e){
            System.out.println("błąd");
        }

        int ilosc =0;
        int all = 0;
        byte[] bufor = new byte[1024];
        try{

            while ((ilosc = in.read(bufor))!=-1 ){
                out.write(bufor, 0, ilosc);
                all+=ilosc;
            }

        }catch(IOException e){
            System.out.println("błąd");
        }

        try{
            if(in!=null)in.close();
            if(out!=null)out.close();

        }catch(IOException e){
            System.out.println("błąd");
        }

        System.out.println(all);
    }
}
