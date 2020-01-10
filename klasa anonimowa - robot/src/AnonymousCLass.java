public class AnonymousCLass {

    public static class Robot {
        public final Greeting saySomething;

        public Robot(Greeting saySomething) {
            this.saySomething = saySomething;
        }

        public void sayMethod(){
            saySomething.sayHello();
        }
    }

        public interface Greeting {
            void sayHello();
        }
    public static void main(String[] args) {

        Robot r1 = new Robot(new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Guten Morgen");
            }
        });

        r1.sayMethod();
    }

}
