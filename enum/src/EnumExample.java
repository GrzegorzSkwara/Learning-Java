public enum EnumExample {

    yes(true),
    y(true),
    ok(true),
    no(false),
    nope(false),
    n(false);

    private boolean wartosc;

    private EnumExample(boolean wartosc){
        this.wartosc=wartosc;
    }


    public boolean GetWartosc(){
        return wartosc;
    }
}
