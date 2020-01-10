public enum Computation {
    ADD{
        double perform(double x, double y){
            return x+y;
        }

    },
    SUBTRACT{
        double perform(double x, double y){
            return x-y;
        }

    },
    DIVIDE{
        double perform(double x, double y){
            if(y==0) System.out.println("Nie dzilimy przez 0");
            return x/y;
        }

    },
    MULIIPY{
        double perform(double x, double y){
            return x*y;
        }

    };

    abstract double perform(double x, double y);


}
