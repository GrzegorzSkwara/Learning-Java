public class Run implements Runnable {

    private int id;
    public Run(int id){
        this.id=id;
    }
    /*interfejs Runnable posiada jedną metodę, którą musimy zaimplementować- run().
    Wszystko co się w niej znajduje zostanie wykonane po uruchomieniu wątku, do którego przekażemy obiekt klasy Run*/
    @Override
    public void run() {
        while(true){  //petla niekonczaca sie
            System.out.println("Wątek " + id);
            try{
                Thread.sleep(1000);  //usypiam wątek na 1000 milisekund
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
